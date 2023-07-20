package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping(value = "/index")
    public String index() {
        return "Hello World from UserController!";
    }
}
