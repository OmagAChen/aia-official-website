package com.example.aiaofficialwebsite.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/ConnectTest")
    public String testConnect() {
        return "connect success";
    }

}
