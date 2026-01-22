package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pro")
public class bai3 {
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("pro", new Product());
        return "bai3";
    }

    @PostMapping("/save")
    public String save(Product product, Model model) {
        model.addAttribute("pro", product);
        return "bai3";
    }

}   
