package com.example.maintenance.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/addjob")
    public String displayAddJob(Model model){
        model.addAttribute("title", "AddJob");
        return "addjob";
    }

    @GetMapping("/addmachine")
    public String displayAddMachine(Model model){
        model.addAttribute("title", "AddMachine");
        return "addmachine";
    }

    @GetMapping("/adduser")
    public String displayAddUser(Model model){
        model.addAttribute("title", "AddUser");
        return "adduser";
    }

    @GetMapping
    public String displayIndexForm(Model model){
        model.addAttribute("title", "527 Maintenance");
        return "index";
    }

    @GetMapping("/jobhistory")
    public String displayJobHistory(Model model){
        model.addAttribute("title", "JobHistory");
        return "jobhistory";
    }

    @GetMapping("/login")
    public String displayLogin(Model model){
        model.addAttribute("title", "Login");
        return "login";
    }

    @GetMapping("/navbar")
    public String displayNavbar(Model model){
        model.addAttribute("title", "NavBar");
        return "navbar";
    }



}
