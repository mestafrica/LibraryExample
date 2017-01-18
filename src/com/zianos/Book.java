package com.zianos;

/**
 * Created by andrew on 1/18/17.
 */
public class Book implements LibraryItem {

    private int numPages;
    private String title;
    private Barcode barcode;
    private boolean isAvailable;
    private Creator author;

    /*
     * Default contructor for Book
     * Assigns dummy values
     */
    public Book(){
        this.title = "Harry Potter";
        this.author = new Creator("JK Rowling");
        this.numPages = 1;
        this.barcode = new Barcode(); //Creating a new barcode w/out passing anything
        this.isAvailable = true;
    }

    /*
     * Overloaded Constructor
     * Takes in title, numpages, barcode, author
     */
    public Book(String title, int numPages, Barcode barcode, Creator author){
        this.title = title;
        this.numPages = numPages;
        this.barcode = barcode;
        this.author = author;
    }

    @Override
    public int getLength() {
        return this.numPages;
    }

    @Override
    public Barcode getBarcode() {
        return this.barcode;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean isAvailable() {
        return this.isAvailable;
    }

    /*
     * Sets the library item's availability to false
     * returns the instance to a patron / customer / small animal
     */
    @Override
    public Book checkOut() {
        this.isAvailable = false;

        return this; //Returns itself
    }

    @Override
    public Creator getCreator() {
        return this.author;
    }

    @Override
    public void setCreator(Creator author) {
        this.author = author;
    }
}
