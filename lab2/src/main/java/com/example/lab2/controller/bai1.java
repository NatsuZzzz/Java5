package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/ctrl")
public class bai1 {
     
    @PostMapping("/bai1")
    public String m1(Model model){
        model.addAttribute("method", "m1()");
        return "bai1";
    }


    @GetMapping("/bai1")
    public String m2(Model model){
        model.addAttribute("method", "m2()");
        return "bai1";
    }

    @PostMapping( value="/bai1", params = "x" )
    public String m3(Model model){
        model.addAttribute("method", "m3()");
        return "bai1";
    }
    
}
