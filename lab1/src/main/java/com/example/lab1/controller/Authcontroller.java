package com.example.lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Authcontroller {
    
    @Autowired
    HttpServletRequest request;


    @GetMapping("/loginnn")

    public String form(){
        return "/login";
    }

    @PostMapping("check")

    public String login(Model model){

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("poly".equals(username) && "333".equals(password)){
            model.addAttribute("message", "Login successful");
        } else{
            model.addAttribute("message", "Login failed");
        }
        return "/login";
    }    
}
