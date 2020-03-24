package com.ham.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

    @GetMapping
    public String getHelloWord(){
        return "Hello World";
    }
}
