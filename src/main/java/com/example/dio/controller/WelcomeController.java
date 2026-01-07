package com.example.dio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
  @GetMapping
    public String welcome() {
        return "Welcome to the Dio Application!";
    }
}
