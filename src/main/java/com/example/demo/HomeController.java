package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    ColorServices colorservice;

    @GetMapping("/askform")
    public String loadFormPage(Model model){
        model.addAttribute("color", new Color());
        model.addAttribute("random", colorservice.generateNum());
        return "requestform";
    }

    @PostMapping("/showform")
    public String loadFromPage(@ModelAttribute Color color, Model model){
        model.addAttribute("color", color);
        return "displayform";
    }
}
