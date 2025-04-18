package com.pluralsight;

import java.util.Scanner;


public class FullNameParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name (first last or first middle last):");
        String fullName = scanner.nextLine().trim();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length < 2 || nameParts.length > 3) {
            System.out.println("Invalid name format. Please enter either first last or first middle last.");
        } else {
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length - 1];

            System.out.println("First Name: " + firstName);
            if (nameParts.length == 3) {
                String middleName = nameParts[1];
                System.out.println("Middle Name: " + middleName);
            }
            System.out.println("Last Name: " + lastName);
        }
        scanner.close();
    }
}
