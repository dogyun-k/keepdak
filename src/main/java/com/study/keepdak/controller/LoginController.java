package com.study.keepdak.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@Slf4j
public class LoginController {
    @GetMapping("/")
    public String home() {
        log.info("LoginController");
        return "index";
    }
}
