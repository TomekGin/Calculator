package com.ginszt.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

    @GetMapping("/add/{firstNumb}/{secondNumb}")
    public int add(@PathVariable int firstNumb, @PathVariable int secondNumb) {
        return firstNumb + secondNumb;
    }
}
