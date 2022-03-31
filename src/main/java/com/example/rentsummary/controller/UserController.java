package com.example.rentsummary.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.rentsummary.model.*;
import com.example.rentsummary.server.UserService;
import com.example.rentsummary.server.VerifyCodeGenService;
import com.example.rentsummary.server.impl.SimpleCharVerifyCodeGenImpl;
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

    @ResponseBody
    @PostMapping(value = "register")
    public String register(UserEntity userEntity, String verifyCode) {
        JSONObject result = new JSONObject();
        if (userEntity == null) { // the data is empty
            result.put("flag", 0);
            result.put("msg", "Please input form!");
            return result.toString();
        }
        if (!verifyCode.equalsIgnoreCase(genCode)) {
            result.put("flag", 0);
            result.put("msg", "Verification code error!");
            return result.toString();
        }
        List<UserEntity> user = userService.getUserByAccount(userEntity.getAccount());
        if (user.size() > 0) {
            // 用户名已存在
            result.put("flag", 0);
            result.put("msg", "The user name already exists!");
            return result.toString();
        }

        try {
            userService.register(userEntity);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        result.put("msg", "Register Success!");
        result.put("flag", 1); // register successs
        return result.toString();
    }

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

    @GetMapping(value = "loginOut")
    public String logout(){
        return "redirect:/toLogin";
    }

    @ResponseBody
    @GetMapping(value = "getState")
    public String getState() {
        JSONObject result = new JSONObject();
        List<StateEntity> stateList = userService.getState();
        result.put("stateList", stateList);
        return result.toString();
    }

    @ResponseBody
    @GetMapping(value = "getCityById")
    public String getCityById(int id) {
        JSONObject result = new JSONObject();
        List<CityEntity> cityList = userService.getCityById(id);
        result.put("cityList", cityList);
        return result.toString();
    }

    @ResponseBody
    @GetMapping(value = "getAreaById")
    public String getAreaById(int id) {
        JSONObject result = new JSONObject();
        List<AreaEntity> areaList = userService.getAreaById(id);
        result.put("areaList", areaList);
        return result.toString();
    }


    @GetMapping(value = "toRegister")
    public String toRegister() {
        return "register.html";
    }
}
