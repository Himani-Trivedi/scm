package com.example.scm.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PageController {

    @GetMapping("/demo")
    public String demo(Model model){
        log.info("/ demo called");
        model.addAttribute("Name", "Himani");
        model.addAttribute("Lastname", "Trivedi");
        return "home";
    }
}
