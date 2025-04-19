package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // set scanner and StringBuilder variables
        Scanner userInput = new Scanner(System.in);
        StringBuilder addressInfo = new StringBuilder();

        // Set prompts. Instead of setting variables for each prompt, you can just append the users input.
        // Every time the user inputs something, it gets stored inside the StringBuilder.
        // You can append multiple things, so append spaces with the user input.
        // Use trim to trim out the user inputs white space.
        System.out.println("Full Name:");
        String name = userInput.nextLine().trim();

        System.out.println("Billing Street: ");
        addressInfo.append(userInput.nextLine().trim()).append(" \n");

        System.out.println("Billing City: ");
        addressInfo.append(userInput.nextLine().trim()).append(", ");

        System.out.println("Billing State: ");
        addressInfo.append(userInput.nextLine().trim()).append(" ");

        System.out.println("Billing Zip: ");
        addressInfo.append(userInput.nextLine().trim()).append(" ");

        System.out.println("-----------------------------------------");

        // save some extra time by asking the user if their billing address is the same as their shipping.
        System.out.println("Is your Shipping Address the same as your Billing Address? (Yes/No)");
        String sameAddress = userInput.nextLine().trim();

        // if yes, then just print final statement. if no, then prompt for shipping info.
        if (sameAddress.equalsIgnoreCase("Yes")){
            System.out.println("-----------------------------------");
            System.out.println(name + "\n" + "\n" + "Billing Address:\n" + addressInfo + "\n" + "\n" + "Shipping Address:\n" + addressInfo);
        } else {
            // make a new string builder for the shipping info since it is separate information.
            StringBuilder shippingInfo = new StringBuilder();

            System.out.println("Shipping Street: ");
            shippingInfo.append(userInput.nextLine().trim()).append(" \n");

            System.out.println("Shipping City: ");
            shippingInfo.append(userInput.nextLine().trim()).append(", ");

            System.out.println("Shipping State: ");
            shippingInfo.append(userInput.nextLine().trim()).append(" ");

            System.out.println("Shipping Zip: ");
            shippingInfo.append(userInput.nextLine().trim()).append(" ");

            System.out.println("-----------------------------------");

            System.out.println(name + "\n" + "\n" + "Billing Address:\n" + addressInfo + "\n" + "\n" + "Shipping Address:\n" + shippingInfo);
        }

userInput.close();























    }
}