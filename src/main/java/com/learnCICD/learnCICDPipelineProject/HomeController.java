package com.learnCICD.learnCICDPipelineProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/hello")
    public String greet(){
        return "Hello world!!";
    }
}
