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
    public String handleForm(
            @RequestParam("type") String type, Model model) {

        System.out.println("type: " + type);

        model.addAttribute("type", type);

        return add();
    }

    @GetMapping("/add")
    public String add() {
        return "calculator/add.html";
    }
    @RequestMapping(path = "/processformAdd", method = RequestMethod.POST)
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

    @GetMapping("/sub/{firstInput}/{secondInput}")
    public CalculatorDto substract(@PathVariable double firstInput,
                                   @PathVariable double secondInput) {
        return new CalculatorDto(firstInput, secondInput,
                (double)Math.round((firstInput - secondInput) * 100) / 100);
    }

    @GetMapping("/mul/{firstInput}/{secondInput}")
    public CalculatorDto multiply(@PathVariable double firstInput,
                                  @PathVariable double secondInput) {
        return new CalculatorDto(firstInput, secondInput,
                (double)Math.round((firstInput * secondInput) * 100) / 100);
    }

    @GetMapping("/div/{firstInput}/{secondInput}")
    public CalculatorDto divide(@PathVariable double firstInput,
                                @PathVariable double secondInput) {
        return new CalculatorDto(firstInput, secondInput,
                (double)Math.round((firstInput / secondInput) * 100) / 100);
    }

}