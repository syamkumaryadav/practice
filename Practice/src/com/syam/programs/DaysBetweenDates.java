package com.syam.programs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDates {

    public static void main(String[] syam) {
        Scanner scanner = new Scanner(System.in);

        // Input format: MMM dd yyyy (e.g., Sep 05 2001)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");

        // Prompt the user for input
        System.out.print("Enter the first date (e.g., Sep 05 2001): ");
        String firstDateInput = scanner.nextLine();
        System.out.print("Enter the second date (e.g., Sep 05 2001): ");
        String secondDateInput = scanner.nextLine();

        // Convert input strings to LocalDate using the custom format
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        // Calculate the number of days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);

        // Print the result
        System.out.println("Number of days between the two dates: " + Math.abs(daysBetween));

        scanner.close();
        
    }
}


/*import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input format: YYYY-MM-DD
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String firstDateInput = scanner.nextLine();
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String secondDateInput = scanner.nextLine();

        // Convert input strings to LocalDate
        LocalDate firstDate = LocalDate.parse(firstDateInput);
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        // Calculate the number of days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);

        // Print the result
        System.out.println("Number of days between the two dates: " + Math.abs(daysBetween));

        scanner.close();
    }
}
*/
