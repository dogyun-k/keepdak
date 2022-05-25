package com.study.keepdak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("loginpage")
    public String loginPage() {
        return "loginPage";
    }
}
