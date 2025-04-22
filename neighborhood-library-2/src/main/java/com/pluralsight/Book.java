package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";

    }
    // Set the getters
    public int getId(){
        return id;}
    public String getIsbn(){
        return isbn;}
    public String getTitle(){
        return title; }
    public boolean isCheckedOut(){
        return isCheckedOut;
    }
    public String getCheckedOutTo(){
        return checkedOutTo;
    }

    // Set the setters
    public void setId(int id){
        this.id = id;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setTitle(String title){
        this.title = title;
    }



    // Create the methods
    // this method checks out the book.
    public void checkOut(String name){
        if (!isCheckedOut){
            isCheckedOut = true;
            checkedOutTo = name;
        }
    }

    // This method returns the book to the library. (check in)
    public void checkIn(){
        if (isCheckedOut){
            isCheckedOut = false;
            checkedOutTo = "";
        }
    }

}




