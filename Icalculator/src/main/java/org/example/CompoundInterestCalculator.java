package org.example;

// Implementation of compound interest calculation
public class CompoundInterestCalculator implements InterestCalculator {
    @Override
    public double calculate(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
}
