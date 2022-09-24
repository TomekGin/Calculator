package com.ginszt.calculator;

public class CalculatorResult {

    private double firstNumb;
    private double secondNumb;
    private double result;

    public CalculatorResult(double firstNumb, double secondNumb, double result) {
        this.firstNumb = firstNumb;
        this.secondNumb = secondNumb;
        this.result = result;
    }

    public double getFirstNumb() {
        return firstNumb;
    }

    public double getSecondNumb() {
        return secondNumb;
    }

    public double getResult() {
        return result;
    }

}
