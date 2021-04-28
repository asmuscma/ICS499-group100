package com.group100.VotingApp.data.enums;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class widgetController {
    @GetMapping("/widget/add")
    public String addWidget(@ModelAttribute Widget widget) {
        return "enums/new";
    }
    
    @PostMapping("/widget/add")
    public String saveWidget(@Valid Widget widget, Model model) {
        model.addAttribute("widget", widget);
        return "enums/view";
    }
}
