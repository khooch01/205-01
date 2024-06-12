package com.khooch.onestopgroceries.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String getHomepage(){
        return "index";
    }

    @GetMapping("/payment")
    public String getPaymentpage(){
        return "payment";
    }
}
