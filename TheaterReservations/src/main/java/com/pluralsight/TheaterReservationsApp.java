package com.pluralsight;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TheaterReservationsApp {

    public static void main(String[] args) {

 System.out.println ("Hello from the reservations app.");
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter your name: ");
            String fullName = scanner.nextLine();

            LocalDate showDate = null;
            boolean validDate = false;
            while (!validDate) {
                System.out.print("What date will you be coming (MM/dd/yyyy): ");
                String dateString = scanner.nextLine();
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                    showDate = LocalDate.parse(dateString, formatter);
                    validDate = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please use MM/dd/yyyy.");
                }
            }

            int numTickets = -1;
            boolean validNumTickets = false;
            while (!validNumTickets) {
                System.out.print("How many tickets would you like? ");
                try {
                    numTickets = Integer.parseInt(scanner.nextLine());
                    if (numTickets > 0) {
                        validNumTickets = true;
                    } else {
                        System.out.println("Please enter a positive number of tickets.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            String[] names = fullName.split(" ");
            String lastName = names[names.length - 1];
            String firstName = names[0];

            String ticketString = (numTickets == 1) ? "ticket" : "tickets";
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = showDate.format(outputFormatter);

            System.out.println(numTickets + " " + ticketString + " reserved for " + formattedDate + " under " + lastName + ", " + firstName);

            scanner.close();
        }


    }
}
