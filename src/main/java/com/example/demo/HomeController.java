package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/test")
    public String login(){
        return "Form";
    }

    @RequestMapping("/recipe")
    public String homepage(){
        return "index";
    }

    @RequestMapping("/table")
    public String tableData(){
        return "table";
    }
}

