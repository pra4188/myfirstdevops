package com.example.myfirstdevops;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hotels {
    @GetMapping("/hotels")
    public String getData() {return "Welcome to MMT .Please book your Hotels at 50% Discount" ;}
}