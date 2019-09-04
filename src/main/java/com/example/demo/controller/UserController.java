package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;

@Controller
public class UserController {
    @RequestMapping(value = "User/Login" ,method = RequestMethod.GET)
    @ResponseBody
    public void fun(){
        System.out.println("User/Login--url被调用");
    }
}
