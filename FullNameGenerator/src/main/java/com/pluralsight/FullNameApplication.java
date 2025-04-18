package com.pluralsight;

import java.util.Scanner;


public class FullNameApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your middle name (optional): ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your suffix (e.g., Jr, PhD, optional): ");
        String suffix = scanner.nextLine();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full Name: " + fullName);

        scanner.close();
    }
}