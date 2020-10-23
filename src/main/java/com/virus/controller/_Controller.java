package com.virus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class _Controller {
    @GetMapping("/")
    public String view(){
        return "Hello World";
    }
}
