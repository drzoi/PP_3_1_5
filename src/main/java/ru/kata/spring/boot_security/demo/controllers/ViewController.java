package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping
    public String mainPage() {
        return "mainpage";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
