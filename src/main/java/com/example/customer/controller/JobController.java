package com.example.customer.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/client")
public class JobController {

    @GetMapping("/hello")
    public String returnString() {
        return "Helllo world from Client app !!!";
    }

    @GetMapping("/helloClient")
    public String helloClient() {
        return "Helllo world from Client app via Customer app !!!";
    }

}


