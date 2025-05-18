package com.example.campusmarket.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.campusmarket.service.UserService;
import com.example.campusmarket.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/login")
    public Response<Object> login(@RequestBody String loginData) {
        JSONObject jsonObject = JSONObject.parseObject(loginData);

        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        boolean res = false;

        try {
            System.out.println("res1: " + res);
            res = userService.login(username, password);
            System.out.println("res2: " + res);

        } catch (Exception e) {
            return Response.fail("服务出错了");
        }

        if (res){
            return Response.success("登录成功");
        }

        return Response.fail("出错");
    }

//    @PostMapping(value = "/register", consumes = "application/json", produces = "application/json")
//    public ApiResponse<Object> register(@RequestBody User user) {
//        try {
//            userService.register(user);
//            return ApiResponse.success("注册成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ApiResponse.error();
//        }
//    }
}