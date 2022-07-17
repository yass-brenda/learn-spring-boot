package com.example.demo.paquetito;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    @RequestMapping("/")
    public  String Hello(){
        return "Hello";
    }
}
