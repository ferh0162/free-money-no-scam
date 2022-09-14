package com.example.freemoneynoscam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/test")
    public String test(/*WebRequest dataFromForm*/@RequestParam("email") String email, RedirectAttributes redirectAttributes){
        //System.out.println(dataFromForm.getParameter("email"));
        redirectAttributes.addAttribute("email",email);

        return "redirect:/test";
    }
    @GetMapping("/test")
    public String lavSuccessite(Model model, @RequestParam("email") String email){
        model.addAttribute("email",email);
        return "successite";
    }
}
