package com.zerotoismail.learningspringbootmvc.controller;

import com.zerotoismail.learningspringbootmvc.dto.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class HomeController {

    @Value("${app.data.countries}")
    private List<String> countries;

    @Value("${app.data.skills}")
    private List<String> skills;

    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello World, Current Time: " + LocalDateTime.now());
        return "home-page";
    }

    @GetMapping("/registration-form")
    public String registrationForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countries", countries);
        model.addAttribute("skills", skills);
        return "registration-form";
    }
}
