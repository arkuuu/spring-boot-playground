package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class SayHelloService {

    public String sayHello() {
        return "Hello from DI'd service";
    }
}
