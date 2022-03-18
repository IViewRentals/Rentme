package com.example.rentsummary.controller;

import com.alibaba.druid.util.Utils;
import com.alibaba.fastjson.JSONObject;
import com.example.rentsummary.model.CityEntity;
import com.example.rentsummary.model.StateEntity;
import com.example.rentsummary.model.UserEntity;
import com.example.rentsummary.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping(value = "register")
    public String register(UserEntity userEntity) {
        JSONObject result = new JSONObject();
        if (userEntity == null) { // the data is empty
            result.put("flag", 0);
            result.put("msg", "Please input form!");
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
    public String login(UserEntity userEntity) {
        JSONObject result = new JSONObject();
        if (userEntity == null) {
            result.put("flag", 0);
            result.put("msg", "Please input form!");
            return result.toString();
        }
        UserEntity user = userService.login(userEntity);
        if (user != null) {
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


    @GetMapping(value = "toRegister")
    public String toRegister() {
        return "register.html";
    }
}
