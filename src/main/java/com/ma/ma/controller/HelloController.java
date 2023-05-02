package com.ma.ma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "你好啊!";
    }
}
