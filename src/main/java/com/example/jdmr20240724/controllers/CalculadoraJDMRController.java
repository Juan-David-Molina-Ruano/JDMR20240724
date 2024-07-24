package com.example.jdmr20240724.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculadora")
public class CalculadoraJDMRController {
    @GetMapping("/resta")
    public String resta(Model model) {
        model.addAttribute("num1",0);
        model.addAttribute("num2",0);
        model.addAttribute("result",0);
        return "/calculadora/restajdmr";
    }

    @PostMapping("/resta")
    public String resta(Model model, @RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 - num2;
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("result",result);
        return "/calculadora/restajdmr";
    }

}
