package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;

@RestController
public class GreetingController {

    private long counter = 0;

    @GetMapping(path = "/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "User") String name) {
        return new Greeting(
                counter++,
                String.format("Hello, %s", name));
    }
}
