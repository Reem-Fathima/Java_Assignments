package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate currentDate=LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM-dd-yyyy");

        String formattedDate=currentDate.format(formatter);
        System.out.println("Formatted Date:"+formattedDate);

    }


}