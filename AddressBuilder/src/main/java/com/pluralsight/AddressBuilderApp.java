package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder addressInfo = new StringBuilder();

        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
        addressInfo.append("Full Name: ").append(fullName).append("\n");

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        addressInfo.append("Billing Street: ").append(billingStreet).append("\n");

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        addressInfo.append("Billing City: ").append(billingCity).append("\n");

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();
        addressInfo.append("Billing State: ").append(billingState).append("\n");

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();
        addressInfo.append("Billing Zip: ").append(billingZip).append("\n");

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        addressInfo.append("Shipping Street: ").append(shippingStreet).append("\n");

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        addressInfo.append("Shipping City: ").append(shippingCity).append("\n");

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        addressInfo.append("Shipping State: ").append(shippingState).append("\n");

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();
        addressInfo.append("Shipping Zip: ").append(shippingZip).append("\n");

        System.out.println("\nDisplay the customer information:");
        System.out.println(addressInfo.toString());

        scanner.close();
    }
}
