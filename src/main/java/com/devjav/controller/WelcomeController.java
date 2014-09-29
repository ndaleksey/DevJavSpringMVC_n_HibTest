package com.devjav.controller;

import com.devjav.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shishkov A.V. on 29.09.2014.
 */
@Controller
public class WelcomeController {
    @Autowired
    QuestionService questionService;

    @RequestMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("question", questionService.listAll().get(0));
        return "welcome";
    }
}
