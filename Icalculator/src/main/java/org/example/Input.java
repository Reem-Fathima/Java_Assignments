package org.example;



import java.util.Scanner;

// Class for taking user input
public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public double nextDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public void close() {
        scanner.close();
    }
}

