package FullNameGenerator;
// import scanner
import java.awt.*;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {
        // create scanner
        Scanner userInput = new Scanner(System.in);
        // ask user for first and last name
        System.out.println("Enter your first name: ");
        // tell scanner to allow user input for first name.
        String firstName = userInput.nextLine();

        // ask user for last name
        System.out.println("Enter your last name: ");
        // tell scanner to allow user input for last name.
        String lastName = userInput.nextLine();

        // ask user for middle name
        System.out.println("What is your middle name?\nIf you do not have one, please enter (N/A)");
        String middleName = userInput.next();
        String prefixSuffix = userInput.nextLine();
        // create while loop to ask user if they have a middle nmme or not.
        // boolean askUser = true;
        boolean f = true;
      while (f) {
          while (f) {
              // for (i = 1; i <= 3; i++)
              if (middleName.equalsIgnoreCase("N/A")) {
                  System.out.println("Do you have any Suffixes or Prefixes in your name? (Y/N) ");
                  f = false;
              }
              if (prefixSuffix.equalsIgnoreCase("N")) {
                  System.out.println("Your full name is " + firstName + " " + lastName);
                  f = false;
              } else {
          }

          while (f) {
              if (middleName.equalsIgnoreCase("N")) {
                  System.out.println("If you have a suffix in your name,\nIf not, Press (N) to continue");
                  f = false;
                  String suffix = userInput.nextLine();
                  if (suffix.equalsIgnoreCase("N")) {
                      System.out.println("Do you have a prefix in your name?\nIf not, please enter (N) to continue");
                      f = false;
                      String prefix = userInput.nextLine();
                      if (prefix.equalsIgnoreCase("N")) {
                          System.out.println("Your full name is " + firstName + " " + lastName);
                          f = false;
                      } else {
                      }

                  }
              }
          }
      }



            // tell scanner to allow user input for middle initial.
          //  char middleName = userInput.next().charAt(0);
            System.out.println("Your full name is " + firstName + " " + middleName + " " + lastName);


*/
        String firstName = " ";
        String lastName = " ";
        String middleName = " ";

    System.out.println("Enter your first and last name: ");







            userInput.close();































    }
}
