package com.ginszt.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String calc() {
        return "calculator/calc.html";
    }

    @RequestMapping(path = "/type", method = RequestMethod.POST)
    public String handleForm(@RequestParam("type") String type, Model model) {
        System.out.println("type: " + type);
        model.addAttribute("type", type);
        if (type.equals("+")) {
            return "calculator/add.html";
        } else if (type.equals("-")) {
            return "calculator/substract.html";
        } else if (type.equals("*")) {
            return "calculator/multiply.html";
        } else if (type.equals("/")) {
            return "calculator/divide.html";
        } else {
            System.out.println("Wrong input");
        }
        return "";
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String handleForm(
            @RequestParam("firstValue") Double firstValue,
            @RequestParam("secondValue") Double secondValue, Model model) {

        System.out.println("firstValue: " + firstValue);
        System.out.println("secondValue: " + secondValue);

        model.addAttribute("firstValue", firstValue);
        model.addAttribute("secondValue", secondValue);

        double result = (double)Math.round((firstValue + secondValue) * 100) / 100;
        System.out.println(result);
        model.addAttribute("result", result);

        return "calculator/result.html";
    }

}