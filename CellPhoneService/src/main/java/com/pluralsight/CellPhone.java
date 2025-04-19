package com.pluralsight;

// this class is defining an object and describing it.
public class CellPhone {

    // describe the cellphone.
    // this is like adding stickers to the phone, but they are blank.
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // this is the constructor.
    // this decides what the values of each property above is.
    // now you're telling each sticker what it's going to allow the user to write on it
    // call the CellPhone class again to assign the stickers
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    // i used right click inside the CellPhone class to scroll down the menu and select "Generate" > "Getters and Setters" > highlight all details and generate.
    // "hey phone, let me make sure you're capable of having an owner"
    public String getOwner() {
        return owner;
    }

    // "Your owner will be Jake!"
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    // see if the phone can dial a number and make it pretend to do so
    public void dial(String phoneNumber){
        System.out.println(this.getOwner() + "'s phone is calling " + phoneNumber);
    }

}
