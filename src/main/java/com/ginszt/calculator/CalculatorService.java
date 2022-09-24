package com.ginszt.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

    @GetMapping("/add/{firstNumb}/{secondNumb}")
    public CalculatorResult add(@PathVariable double firstNumb, @PathVariable double secondNumb) {
        return new CalculatorResult(firstNumb, secondNumb,
                (double)Math.round((firstNumb + secondNumb) * 100) / 100);
    }

    @GetMapping("/sub/{firstNumb}/{secondNumb}")
    public CalculatorResult substract(@PathVariable double firstNumb, @PathVariable double secondNumb) {
        return new CalculatorResult(firstNumb, secondNumb,
                (double)Math.round((firstNumb - secondNumb) * 100) / 100);
    }

    @GetMapping("/mul/{firstNumb}/{secondNumb}")
    public CalculatorResult multiply(@PathVariable double firstNumb, @PathVariable double secondNumb) {
        return new CalculatorResult(firstNumb, secondNumb,
                (double)Math.round((firstNumb * secondNumb) * 100) / 100);
    }

    @GetMapping("/div/{firstNumb}/{secondNumb}")
    public CalculatorResult divide(@PathVariable double firstNumb, @PathVariable double secondNumb) {
        return new CalculatorResult(firstNumb, secondNumb,
                (double)Math.round((firstNumb / secondNumb) * 100) / 100);
    }

}
