package com.group100.VotingApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.group100.VotingApp.data.entity.Widget;

import javax.validation.Valid;


@Controller
public class WidgetController {
    @GetMapping("/widget/add")
    public String addWidget(@ModelAttribute Widget widget) {
        return "enumForm";
    }
    
    @PostMapping("/widget/add")
    public String saveWidget(@Valid Widget widget, Model model) {
        model.addAttribute("widget", widget);
        return "enumForm";
    }
}
