package com.example.lab2.controller;

import java.util.Arrays;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class bai4 {
    @GetMapping("/bai4/form")

    public String form(Model model) {
        Product p1 = new Product("Iphone 14 Pro Max", 1900.0);
        Product p2 = new Product(); // tránh null

        model.addAttribute("p1", p1);
        model.addAttribute("p2", p2);
        model.addAttribute("item", getItems());
        return "/bai4";

    }

    @PostMapping("/bai4/save")
    public String save(@ModelAttribute("p2") Product p, Model model) {
        Product p1 = new Product("Iphone 14 Pro Max", 1900.0);

        model.addAttribute("p1", p1);
        model.addAttribute("p2", p);
        model.addAttribute("items", getItems());

        return "bai4";
    }

    public List<Product> getItems() {
        return Arrays.asList(
                new Product("A", 1.0),
                new Product("B", 12.0));
    }

}
