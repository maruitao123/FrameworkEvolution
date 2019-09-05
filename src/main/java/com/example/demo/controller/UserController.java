package com.example.demo.controller;

import com.example.demo.common.result.ApiResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/User/")
@ResponseBody
public class UserController {
    @RequestMapping(value = "Login" ,method = RequestMethod.GET)
    public ApiResult Login(){
        return ApiResult.success("123");
    }
}
