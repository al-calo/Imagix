package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String startPage() {
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
