package com.ginszt.calculator;

public class CalculatorDto {
    private double firstInput;
    private double secondInput;
    private double result;

    public CalculatorDto(double firstInput, double secondInput, double result) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
        this.result = result;
    }

    @Override
    public String toString() {
        return "CalculatorResult{" +
                "firstInput=" + firstInput +
                ", secondInput=" + secondInput +
                ", result=" + result +
                '}';
    }

    public double getFirstInput() {
        return firstInput;
    }

    public double getSecondInput() {
        return secondInput;
    }

    public double getResult() {
        return result;
    }

}
