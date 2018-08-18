package com.example.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public HttpEntity<String> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new ResponseEntity<>("greeting", HttpStatus.OK);
    }
}
