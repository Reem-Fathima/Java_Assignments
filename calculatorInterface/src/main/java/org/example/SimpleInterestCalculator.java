package org.example;

// Implementation of simple interest calculation
public class SimpleInterestCalculator implements InterestCalculator {
    @Override
    public double calculate(double principal, double rate, double time) {

        return (principal * rate * time) / 100;
    }
}
