package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class EmailValidator{
        private static final String EMAIL_REGEX= "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        private static final Pattern pattern=Pattern.compile(EMAIL_REGEX);
        public static boolean isValidEmail(String email){
            if (email == null)
                return false;
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();


        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter email id:");
        String email=scanner.nextLine();

        if (EmailValidator.isValidEmail(email)){
            System.out.println("Valid email address");

        }
        else {
            System.out.println("Email address is not valid");
        }
        scanner.close();

    }
}