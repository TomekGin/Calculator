package com.ginszt.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String calc() {
        return "calculator/calc2.html";
    }

    @GetMapping("/add")
    public String add() {
        return "calculator/add.html";
    }

    @GetMapping("/add//{firstInput}/{secondInput}")
    public CalculatorDto add(@PathVariable double firstInput,
                             @PathVariable double secondInput) {
        return new CalculatorDto(firstInput, secondInput,
                (double)Math.round((firstInput + secondInput) * 100) / 100);
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