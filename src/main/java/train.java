package com.example.myfirstdevops;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class train {
    @GetMapping("/train")
    public String getData() {return "Welcome to MMT .Please book your Train Tickets at 10% Discount" ;}
}