package com.example.myfirstdevops;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Bus {
    @GetMapping("/Bus")
    public String getData() {return "Welcome to MMT .Please book your Travals at 50% Discount" ;}
}