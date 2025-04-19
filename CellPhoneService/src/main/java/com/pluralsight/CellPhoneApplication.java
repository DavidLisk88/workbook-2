package com.pluralsight;

import java.util.Scanner;


// this class is saying "What do you want the object to do?"
// this is how we use the phone.
public class CellPhoneApplication {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // this brings the cellphone to life from the "CellPhone" class.
        CellPhone myPhone = new CellPhone();

        // ask for information about cell phone
        System.out.println("What is the serial number? ");
        String serialNumber = userInput.nextLine();

        System.out.println("What is the mmodel? ");
        String model = userInput.nextLine();

        System.out.println("Who is the carrier? ");
        String carrier = userInput.nextLine();

        System.out.println("What is the phone number? ");
        String phoneNumber = userInput.nextLine();

        System.out.println("Who is the owner of this phone? ");
        String owner = userInput.nextLine();

        // use setters to set the details of the object inside of myPhone

        // convert the serial number data to an integer since it is set to integer in the other class.
        // this is sticking our labels on the phone officially.
        myPhone.setSerialNumber(Integer.parseInt(serialNumber));
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        // use the getters to display info
 //       System.out.println(" ");
 //       System.out.println("SN: " + myPhone.getSerialNumber());
 //       System.out.println("Model: " + myPhone.getModel());
 //       System.out.println("Carrier: " + myPhone.getCarrier());
 //       System.out.println("Phone Number: " + myPhone.getPhoneNumber());
 //       System.out.println("Onwer: " + myPhone.getOwner());

        // this helper method (display) shows all the information on the phone.
    display(myPhone);

    // this creates the second phone
    CellPhone secondPhone = new CellPhone();
    // lets give the second phone some information.
    secondPhone.setPhoneNumber("123-123-1234");
    secondPhone.setOwner("Jake");

    // let's display the second phone
    display(secondPhone);

    // get the 2 phones to dial each other.
    myPhone.dial(secondPhone.getPhoneNumber());
    secondPhone.dial(myPhone.getPhoneNumber());
    }

    // this method tells the display method above to finally show us the phone's info.
    static void display(CellPhone phone){
        System.out.println(" ");
        System.out.println("SN: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Onwer: " + phone.getOwner());
    }

}
