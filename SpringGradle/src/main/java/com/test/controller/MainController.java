package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String test(Model model) {
        model.addAttribute("msg", "Good!!");
        return "index";
    }
}
