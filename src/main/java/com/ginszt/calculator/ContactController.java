package com.ginszt.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String showForm() {
        return "calculator/contact.html";
    }

//    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm(
            @RequestParam("email") String userEmail,
            @RequestParam("userName") String userName,
            @RequestParam("password") String userPassword, Model model) {

        System.out.println("user email" + userEmail);
        System.out.println("user name" + userName);
        System.out.println("user password" + userPassword);

        //process

        model.addAttribute("name", userName);
        model.addAttribute("email", userEmail);
        model.addAttribute("password", userPassword);

        return "calculator/success.jsp";
    }
}
