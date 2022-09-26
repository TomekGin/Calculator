package com.ginszt.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String calc() {
        return "calculator/calculator.html";
    }

    @RequestMapping(path = "/calculate", method = RequestMethod.POST)
    public String handleForm(@RequestParam("type") String type,
                             @RequestParam("firstValue") Double firstValue,
                             @RequestParam("units1") String units1,
                             @RequestParam("secondValue") Double secondValue,
                             @RequestParam("units2") String units2,
                             @RequestParam("units3") String units3,
                             Double result,
                             Model model) {

        model.addAttribute("type", type);
        model.addAttribute("firstValue", firstValue);
        model.addAttribute("secondValue", secondValue);
        model.addAttribute("units1", units1);
        model.addAttribute("units2", units2);
        model.addAttribute("units3", units3);

        if (units1.equals("ft")) {
            firstValue = firstValue / 3.2808399;
        } else if (units1.equals("NM")) {
            firstValue = firstValue / 0.000539956803;
        } else {
            firstValue = firstValue;
        }

        if (units2.equals("ft")) {
            secondValue = secondValue / 3.2808399;
        } else if (units2.equals("NM")) {
            secondValue = secondValue / 0.000539956803;
        } else {
            secondValue = secondValue;
        }

        if (type.equals("+")) {
            result = firstValue + secondValue;
        } else if (type.equals("-")) {
            result = Math.abs(firstValue - secondValue);
        } else if (type.equals("*")) {
            result = firstValue * secondValue;
        } else if (secondValue != 0) {
            result = firstValue / secondValue;
        } else return "calculator/warning.html";

        if (units3.equals("ft")) {
            result = result * 3.2808399;
        } else if (units3.equals("NM")) {
            result = result * 0.000539956803;
        } else {
            result = result;
        }

        result = (double) Math.round(result * 100) / 100;
        model.addAttribute("result", result);
        return "calculator/result.html";
    }
}