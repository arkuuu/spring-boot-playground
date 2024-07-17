package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SayHelloService;

@RestController
public class SayHelloWithDIController {

    @Autowired
    private SayHelloService sayHelloService;

    @GetMapping(path = "/hello-di")
    public String helloDi() {
        return sayHelloService.sayHello();
    }
}
