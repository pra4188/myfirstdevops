package com.example.myfirstdevops;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class flight {
    @GetMapping("/flight")
    public String getData() {return "Welcome to Indigo .Please book your flights at 10% Discount" ;}
}

