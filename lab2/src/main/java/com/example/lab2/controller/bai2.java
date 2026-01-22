package com.example.lab2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class bai2 {
    @RequestMapping("/param/bai2")
    public String form(){
        return "bai2";
    }
    
     @RequestMapping("/param/save/{x}")
     public String save(
        @PathVariable("x") String x,
        @RequestParam("y") String y,
        Model model
     ){
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "bai2";
     }
}
