package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "This is my first GITHUB Action Deployment, Using DOCKER image pushed and deploy thr ECS!";
    }
}

