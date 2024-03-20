package org.example;


public class InterestCalculatorApp {

    public static void main(String[] args) {
        Input scanner = new Input();


        try {
            double principal = scanner.nextDouble("Enter principal amount: ");
            double rate = scanner.nextDouble("Enter rate of interest (in percentage): ");
            double time = scanner.nextDouble("Enter time (in years): ");

            if (principal <= 0 || rate <= 0 || time <= 0) {
                throw new IllegalArgumentException("Principal, rate, and time must be greater than zero.");
            }

            InterestCalculator simpleInterestCalculator = new SimpleInterestCalculator();
            InterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();

            double simpleInterest = simpleInterestCalculator.calculate(principal, rate, time);
            double compoundInterest = compoundInterestCalculator.calculate(principal, rate, time);

            System.out.println("Simple Interest: " + simpleInterest);
            System.out.println("Compound Interest: " + compoundInterest);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
