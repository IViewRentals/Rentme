package com.example.rentsummary.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.rentsummary.model.*;
import com.example.rentsummary.server.MailService;
import com.example.rentsummary.server.UserService;
import com.example.rentsummary.server.VerifyCodeGenService;
import com.example.rentsummary.server.impl.SimpleCharVerifyCodeGenImpl;
import com.example.rentsummary.utils.RandomUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController {
    private static String genCode;
    @Autowired
    private UserService userService;
    @Autowired
    private MailService mailService;

    /**
     * 修改密码
     */
    @ResponseBody
    @PostMapping(value = "changePassword")
    public String changePassword(UserEntity userEntity) {
        JSONObject result = new JSONObject();
        // 修改密码
        userService.updatePasswordByAccount(userEntity);
        // 清除验证码
        userService.clearUserEmailCode(userEntity);
        result.put("flag", 1);
        return result.toString();
    }

    /**
     * 校验邮箱验证码是否正确
     * @param userEntity
     * @return
     */
    @ResponseBody
    @GetMapping(value = "checkAccountByEmailCode")
    public String checkAccountByEmailCode(UserEntity userEntity) {
        JSONObject result = new JSONObject();
        UserEntity user = userService.getUserByEmailCode(userEntity);
        if (user == null) {
            result.put("flag", 0);
            result.put("msg", "Email verification code error!");
            return result.toString();
        }

        result.put("flag", 1);
        result.put("msg", "Authentication is successful!");
        return result.toString();
    }

    /**
     * 跳转忘记密码页面
     * @return
     */
    @GetMapping(value = "toForgetAccount")
    public String toForgetAccount() {
        return "forgetaccount.html";
    }

    /**
     * 图像验证码
     * @param request
     * @param response
     */
    @GetMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response) {
        try {
            VerifyCodeGenService verifyCodeGenService = new SimpleCharVerifyCodeGenImpl();
            //设置长宽
            VerifyCode verifyCode = verifyCodeGenService.generate(80, 28);
            String code = verifyCode.getCode();
            genCode = code;
            //将VerifyCode绑定session
            request.getSession().setAttribute("VerifyCode", code);
            //设置响应头
            response.setHeader("Pragma", "no-cache");
            //设置响应头
            response.setHeader("Cache-Control", "no-cache");
            //在代理服务器端防止缓冲
            response.setDateHeader("Expires", 0);
            //设置响应内容类型
            response.setContentType("image/jpeg");
            response.getOutputStream().write(verifyCode.getImgBytes());
            response.getOutputStream().flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 用户名查重
     * @param account
     * @return
     */
    @ResponseBody
    @GetMapping(value = "checkAccount")
    public String checkAccount(String account) {
        JSONObject result = new JSONObject();
        List<UserEntity> users = checkAccountMethod(account);
        // 用户名已存在
        if (users.size() > 0) {
            result.put("user", users.get(0));
            result.put("flag", 0);
            result.put("msg", "The user name already exists!");
            return result.toString();
        }
        result.put("flag", 1);
        return result.toString();
    }

    /**
     * 用户名查重抽取方法
     * @param account
     * @return
     */
    private List<UserEntity> checkAccountMethod(String account) {
        return userService.getUserByAccount(account);
    }

    /**
     * 用户注册
     * @param userEntity
     * @param verifyCode
     * @return
     */
    @ResponseBody
    @PostMapping(value = "register")
    public String register(UserEntity userEntity, String verifyCode) {
        JSONObject result = new JSONObject();
        // 前端传递数据为空
        if (userEntity == null) {
            result.put("flag", 0);
            result.put("msg", "Please input form!");
            return result.toString();
        }
        // 验证码不对
        if (!verifyCode.equalsIgnoreCase(genCode)) {
            result.put("flag", 0);
            result.put("msg", "Verification code error!");
            return result.toString();
        }

        List<UserEntity> users = checkAccountMethod(userEntity.getAccount());
        // 用户名已存在
        if (users.size() > 0) {
            result.put("flag", 0);
            result.put("msg", "The user name already exists!");
            return result.toString();
        }

        // 通过邮箱验证码查询临时用户的邮箱是否存在
        UserEntity userByCode = userService.getUserByEmailCode(userEntity);
        // 邮箱校验失败
        if (userByCode == null) {
            result.put("flag", 0);
            result.put("msg", "Email verification code error!");
            return result.toString();
        }

        List<UserEntity> userList = userService.getUserByEmail(userEntity.getEmail());
        for (UserEntity user : userList) {
            // 邮箱已存在，不可再次发送验证码
            if (user.getAccount() != null) {
                result.put("flag", 0);
                return result.toString();
            }
        }

        try {
            // 注册成功
            userService.register(userEntity);
            // 根据账户名清除邮箱验证码
            userService.clearUserEmailCode(userEntity);
            // 清除验证码记录
            userService.clearCode(userEntity);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        result.put("msg", "Register Success!");
        result.put("flag", 1); // register successs
        return result.toString();
    }

    /**
     * 注册邮箱验证
     * @param userEntity
     * @return
     */
    @ResponseBody
    @GetMapping(value = "registerByEmailCode")
    public String registerByEmailCode(UserEntity userEntity) {
        JSONObject result = new JSONObject();

        List<UserEntity> userList = userService.getUserByEmail(userEntity.getEmail());
        for (UserEntity user : userList) {
            // 该邮箱已绑定注册账号，不可再次绑定
            if (user.getAccount() != null) {
                result.put("flag", 0);
                return result.toString();
            }
        }
        // 发送验证码
        userEntity = sendEmailCode(userEntity);

        // 插入一条用户信息
        userService.register(userEntity);

        result.put("msg", "EMail Sent Successfully!");
        result.put("flag", 1);
        return result.toString();
    }

    /**
     * 找回密码的发送邮箱验证码
     * @param userEntity
     * @return
     */
    @ResponseBody
    @GetMapping(value = "findAccountByEmailCode")
    public String findAccountByEmailCode(UserEntity userEntity) {
        JSONObject result = new JSONObject();
        // 发送验证码
        userEntity = sendEmailCode(userEntity);

        // 将验证码存入到用户信息上
        userService.updateEmailCodeByEmail(userEntity);

        result.put("msg", "EMail Sent Successfully!");
        result.put("flag", 1);
        return result.toString();
    }


    /**
     * 发送邮箱验证码方法
     * @param userEntity
     * @return
     */
    public UserEntity sendEmailCode(UserEntity userEntity) {
        String code = RandomUtils.randomNumberString(6);
        // 存储验证码
        userEntity.setEmailCode(code);
        System.out.println("验证码:"+code);
        //主题
        String subject = "[RentMe] Please verify your email";
        //上面的激活码发送到用户注册邮箱
        String context = "<div>Verification code: <strong>"+code+"</strong></div>";
        //发送激活邮件
        mailService.sendMimeMail (userEntity.getEmail(),subject,context);
        return userEntity;
    }


    /**
     * 登录
     * @param userEntity
     * @param verifyCode
     * @return
     */
    @ResponseBody
    @GetMapping(value = "login")
    public String login(UserEntity userEntity,String verifyCode) {
        JSONObject result = new JSONObject();
        if (userEntity == null) {
            result.put("flag", 0);
            result.put("msg", "Please input form!");
            return result.toString();
        }
        if (!verifyCode.equalsIgnoreCase(genCode)) {
            result.put("flag", 0);
            result.put("msg", "Verification code error!");
            return result.toString();
        }
        UserEntity user = userService.login(userEntity);
        if (user != null) {
            result.put("id", user.getId());
            result.put("username", user.getAccount()); // login success
            result.put("flag", 1); // login success
            return result.toString();
        }
        result.put("flag", 0); // login fail
        result.put("msg", "Account or password is incorrect!");
        return result.toString();
    }

    /**
     * 登出
     * @return
     */
    @GetMapping(value = "loginOut")
    public String logout(){
        return "redirect:/toLogin";
    }

    /**
     * 获取州
     * @return
     */
    @ResponseBody
    @GetMapping(value = "getState")
    public String getState() {
        JSONObject result = new JSONObject();
        List<StateEntity> stateList = userService.getState();
        result.put("stateList", stateList);
        return result.toString();
    }

    /**
     * 获取区
     * @param id
     * @return
     */
    @ResponseBody
    @GetMapping(value = "getCityById")
    public String getCityById(int id) {
        JSONObject result = new JSONObject();
        List<CityEntity> cityList = userService.getCityById(id);
        result.put("cityList", cityList);
        return result.toString();
    }

    /**
     * 注册页面跳转
     * @return
     */
    @GetMapping(value = "toRegister")
    public String toRegister() {
        return "register.html";
    }
}
