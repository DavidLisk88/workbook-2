package com.pluralsight;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) throws InterruptedException {
        Scanner userInput = new Scanner(System.in);

        // Create an Array. This makes the list of 20 books.
        // Use the class "Book" to split the books
        Book[] availableBooks = new Book[20];

        availableBooks[0] = new Book(1, "ISBN: 1001", "Harry Potter");
        availableBooks[1] = new Book(2, "ISBN: 1002", "To Kill a Mockingbird");
        availableBooks[2] = new Book(3, "ISBN: 1003", "Pride and Prejudice");
        availableBooks[3] = new Book(4, "ISBN: 1004", "The Lord of the Flies");
        availableBooks[4] = new Book(5, "ISBN: 1005", "The Hobbit");
        availableBooks[5] = new Book(6, "ISBN: 1006", "Narnia: The Lion, The Witch, and The Wardrobe");
        availableBooks[6] = new Book(7, "ISBN: 1007", "Frankenstein");
        availableBooks[7] = new Book(8, "ISBN: 1008", "Dune");
        availableBooks[8] = new Book(9, "ISBN: 1009", "The Lord of The Rings");
        availableBooks[9] = new Book(10, "ISBN: 1010", "The Da Vinci Code");
        availableBooks[10] = new Book(11, "ISBN: 1011", "Pinocchio");
        availableBooks[11] = new Book(12, "ISBN: 1012", "Catcher in the Rye");
        availableBooks[12] = new Book(13, "ISBN: 1013", "The Alchemist");
        availableBooks[13] = new Book(14, "ISBN: 1014", "The Great Gatsby");
        availableBooks[14] = new Book(15, "ISBN: 1015", "The Hunger Games");
        availableBooks[15] = new Book(16, "ISBN: 1016", "Twilight");
        availableBooks[16] = new Book(17, "ISBN: 1017", "The Fault in Our Stars");
        availableBooks[17] = new Book(18, "ISBN: 1018", "The Bible");
        availableBooks[18] = new Book(19, "ISBN: 1019", "The Art of War");
        availableBooks[19] = new Book(20, "ISBN: 1020", "Dora the Explorer");


        boolean choosing = true;

        // Make a loop for all the outputs.

        while (choosing) {
            int userChoice = 0;
            while (true) {
                System.out.println("---------------------------------");
                System.out.println("----------  MAIN MENU  ----------\n");
                System.out.println("1. Show available Books.");
                System.out.println("2. Show checked out books.");
                System.out.println("3. Leave the store.");
                System.out.println("Please choose an option:\n");

                if (userInput.hasNextInt()) {
                    userChoice = userInput.nextInt();
                    userInput.nextLine();
                    if (userChoice >= 1 && userChoice <= 3) {
                        break;
                    } else {
                        System.out.println("Invalid Input. Please choose an option (1, 2, or 3).");
                    }
                } else {
                    userInput.nextLine();
                    System.out.println("Invalid input. Please choose an option (1, 2, or 3).");
                }
            }
             //   userInput.nextLine();

                switch (userChoice) {
                    case 1:
                        showAvailableBooks(userInput, availableBooks);
                        break;
                    case 2:
                        showCheckedOutBooks(userInput, availableBooks);
                        break;
                    case 3:
                        choosing = false;
                        Thread.sleep(1500);
                        System.out.println("Thank you for coming!");
                        break;
                }

        }
        userInput.close();
    }

    public static void showAvailableBooks(Scanner userInput, Book[] books) throws InterruptedException {
        System.out.println("--------------OUR BOOKS:-----------------");

        boolean areTheyHere = false;


        for (Book myBook : books) {
            if (!myBook.isCheckedOut()) {
                System.out.println("ID: " + myBook.getId() + "\n" + myBook.getIsbn() + "\nTitle:\n" + myBook.getTitle() + "\n------------------------------------------------------");
                areTheyHere = true;
            }
        }

        if (!areTheyHere) {
            System.out.println("There are no books available at the moment.");
            Thread.sleep(2000);
        }

        System.out.println("\nWhat is your book ID?\nPress 0 to go back.");
        int bookId = userInput.nextInt();
        userInput.nextLine();

        if (bookId == 0)
            return;

        for (Book myBook : books) {
            if (myBook.getId() == bookId && !myBook.isCheckedOut()) {
                System.out.println("\nEnter your full Name:");
                String name = getName(userInput);
                myBook.checkOut(name);

                System.out.println("------------------------------");
                System.out.println("\nSuccessfully checked out!");
                System.out.println("Title: " + myBook.getTitle());
                System.out.println("ID: " + myBook.getId());
                System.out.println(myBook.getIsbn());
                System.out.println("Checked out to: " + name);
                System.out.println("------------------------------");
                Thread.sleep(2000);
                endOfMenu(userInput, books);
                return;
            }
        }
        System.out.println("--- This book is not in stock right now. ---");
        Thread.sleep(2000);

        endOfMenu(userInput, books);

    }

    public static void showCheckedOutBooks(Scanner userInput, Book[] books) throws InterruptedException {
        System.out.println("\n--------------CHECKED OUT BOOKS: -----------------");
        for (Book myBook : books) {
            if (myBook.isCheckedOut()) {
                System.out.println("\nID: " + myBook.getId() + "\n" + myBook.getIsbn() + "\nTitle: " + myBook.getTitle() + "\nChecked out to:\n" + myBook.getCheckedOutTo());
            }
        }
        String askCheckIn;
     while(true) {
         System.out.println("\nPress C to check in a book.\nPress X to return to the main screen.\n");
         askCheckIn = userInput.nextLine().toUpperCase();

         if (askCheckIn.equalsIgnoreCase("C")) {
             System.out.println("\nWhat is the ID of the book?:\n");
             int bookId = userInput.nextInt();
             userInput.nextLine();
            boolean bookFound = false;

             for (Book myBook : books) {
                 if (myBook.getId() == bookId && myBook.isCheckedOut()) {
                     String checkedOutTo = myBook.getCheckedOutTo();
                     myBook.checkIn();
                     System.out.println("\nYour book is checked in!\nTitle: " + myBook.getTitle() + "\nID: " + bookId);
                     return;
                 }
             }

             if (!bookFound) {
                 System.out.println("\nThat book is not currently checked out or doesn't exist.");
                 Thread.sleep(2000);
             }

             endOfMenu(userInput, books);
             return; // Exit this method after check-in
         } else if (askCheckIn.equals("X")) {
             return; // Go back to main menu
         } else {
             System.out.println("\nInvalid input. Please press C or X.");
             Thread.sleep(2000);
         }
     }
    }

    public static String getName(Scanner scanner) {
        System.out.print("What is your name?\n");
        String name = "";
        while (true) {
            name = scanner.nextLine().toUpperCase();
            if (name.isEmpty()) {
                System.out.println("Please enter a name");
                System.out.println("What is your name?");
            } else {
                break;
            }
        }

        return capitalizedwords(name); // return the name.
    }

    public static String capitalizedwords(String input){
        String[] nameParts = input.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for (String name : nameParts){
            if (!name.isEmpty()){
                char firstLetter = Character.toUpperCase(name.charAt(0));
                String restOfName = name.substring(1).toLowerCase();
                capitalized.append(firstLetter).append(restOfName).append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public static void endOfMenu(Scanner userInput, Book[] books) throws InterruptedException {
        System.out.println("\nWould you like to do something else?\n");
        System.out.println("Press A to check out another book.");
        System.out.println("Press B to check in a book");
        System.out.println("Press X to return to the main menu\n");

        String endOfMenuChoice = userInput.nextLine().trim().toUpperCase();

        switch (endOfMenuChoice) {
            case "A":
                showAvailableBooks(userInput, books);
                break;
            case "B":
                showCheckedOutBooks(userInput, books);
                break;
            case "X":
                System.out.println("Returning to the main menu...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Hold on. We're having a little trouble!");
                } break;

            default:
                System.out.println("Invalid input. Returning to main menu...");
                Thread.sleep(2000);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Hold on, we're having some trouble...");
        }

    }
}





