package com.yuan.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello zhidao";
    }

    @GetMapping(value = "/")
    public String home(){
        return "hello home";
    }

}
