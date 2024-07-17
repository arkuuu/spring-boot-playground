package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;

@RestController
public class GreetingController {

    private AtomicLong counter = new AtomicLong();

    @GetMapping(path = "/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "User") String name) {
        return new Greeting(
                counter.getAndIncrement(),
                String.format("Hello, %s", name));
    }
}
