package com.zerotoismail.learningspringbootmvc.controller;

import com.zerotoismail.learningspringbootmvc.dto.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RegistrationFormController {

    @Value("${app.data.countries}")
    private List<String> countries;

    @Value("${app.data.skills}")
    private List<String> skills;

    @PostMapping("/displayRegisterFormData")
    public String registerUser(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("countries", countries);
            model.addAttribute("skills", skills);
            return "registration-form";
        }

        return "display-form-data";
    }
}
