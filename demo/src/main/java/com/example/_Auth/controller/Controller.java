package com.example._Auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "hello Api";
    }

    @GetMapping("/hi")
    public String hi(){
        return "Hi Api";
    }

    @GetMapping("/hey")
    public String hey(){
        return "Hey Api";
    }

}
