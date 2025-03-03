package com.siwy.lukas.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam("data") String data, Model model) {
        model.addAttribute("data", data);
        return "result";
    }
 }
