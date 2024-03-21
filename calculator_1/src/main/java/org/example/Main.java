package org.example;

import jdk.dynalink.Operation;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter operator(+,-,*,/):");
        char operator=scanner.next().charAt(0);

        System.out.println("Enter first number:");
        double num1=scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2=scanner.nextDouble();


        Calculator.Operation1 operation;
        switch (operator){
            case  '+':
                operation =(x, y)->(x+y);
                break;


            case  '-':
                operation =(x, y)->(x-y);
                break;


            case  '*':
                operation =(x, y)->(x*y);
                break;

            case  '/':
                operation =(x, y)->(x/y);
                break;


            default:
                out.println("Invalid operator");
                return;


        }

    double result=operation.apply(num1,num2);
        out.println("Result="+result);



    }
}