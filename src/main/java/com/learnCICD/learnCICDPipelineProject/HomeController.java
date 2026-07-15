package com.learnCICD.learnCICDPipelineProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String greet(){
        return "Welcome to the world of DevOps and CI/CD pipeline!!";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi :) ";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world!!";
    }

    @GetMapping("/greet")
    public String sayGreet(){
        return "Hey there!!";
    }
}
