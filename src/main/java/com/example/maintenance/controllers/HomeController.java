package com.example.maintenance.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping
    public String displayIndexForm(Model model){
        model.addAttribute("title", "527 Maintenance");
        return "index";
    }




}
