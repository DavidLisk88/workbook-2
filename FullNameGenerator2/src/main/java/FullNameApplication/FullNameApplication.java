package FullNameApplication;
import java.util.Scanner;
public class FullNameApplication {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

    /*  System.out.println("First Name: ");
       String firstName = userInput.nextLine();

       System.out.println("Middle Name: ");
       String middleName = userInput.nextLine();

       System.out.println("Last Name: ");
       String lastName = userInput.nextLine();

       System.out.println("Suffix");
       String suffix = userInput.nextLine();


      // String fullName = "";
       StringBuilder fullName = new StringBuilder();
       fullName.append(firstName).append(" ");

       if (!middleName.isEmpty()){
            fullName.append(middleName).append(" ");
       }
       fullName.append(lastName);

       if (!suffix.isEmpty()){
            fullName.append(", ").append(suffix);

       }
       System.out.println(fullName);
*/

       // ----------------------------------------------------------

       System.out.println("First Name: ");
       String firstName = userInput.nextLine();

       System.out.println("Middle Name: ");
       String middleName = userInput.nextLine();

       System.out.println("Last Name: ");
       String lastName = userInput.nextLine();

       System.out.println("Suffix");
       String suffix = userInput.nextLine();

       // define first name as an empty string.
       String fullName = "";

       // create if statements for empty/not empty inputs
       if (!firstName.isEmpty()){
           fullName += firstName;
           // this is saying that if the user enters a first name (first name empty = false), then the firstName variable will be added and held inside the fullName variable.
       } else {
           System.out.println("Please enter first name: ");
           // since first name is required, the else statement will force user to put first name if nothing is entered.
           System.exit(0);
       }

       if (!middleName.isEmpty()){
           fullName += " " + middleName;
           // since middle name is not required, the fullName variable will recieve a blank space for middle name.
       }

       if (!lastName.isEmpty()){
           fullName += lastName;
       } else {
           System.out.println("Please enter last name: ");
           System.exit(0);
       }

     if (!suffix.isEmpty()){
         fullName += ", " + suffix;
     }

     // display all parts of the name with full name

    System.out.println(firstName + " " + middleName + " " + lastName + " " + suffix);
     //System.out.println("First Name: " + firstName);
   //  System.out.println("Middle Name: " + middleName);
    // System.out.println("Last Name: " + lastName);
    // System.out.println("Suffix: " + suffix);

      /*  System.out.print("Please enter your name \nFirst name: ");
        String firstName = cheese.nextLine();
        System.out.print("Middle name: ");
        String middleName = cheese.nextLine();
        System.out.print("Last name: ");
        String lastName = cheese.nextLine();
        System.out.print("Suffix: ");
        String suffix = cheese.nextLine();

        // Adjusting for the condition if middle name and suffix are empty
        middleName = middleName.trim().isEmpty() ? "" : " "+middleName.trim();
        suffix = suffix.trim().isEmpty() ? "" : ", "+suffix.trim();

        // Adding up and printing it out
        System.out.println("Full name: " + firstName.trim() + middleName +" "+ lastName.trim() + suffix);

       */
    }
}






























    }
}
