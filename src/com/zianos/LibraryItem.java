package com.zianos;

/**
 * Created by andrew on 1/18/17.
 */
public interface LibraryItem {

    //Returns Number of Pages or the duration in minutes of the content
    public int getLength();

    //Returns the Barcode of the item (See UPC-A / EAN-34)
    public Barcode getBarcode();

    //Returns the book's title
    public String getTitle();

    //Returns true if the book is available to checkout - otherwise false
    public boolean isAvailable();

    //Returns the book and sets isAvaialable to false
    public LibraryItem checkOut();

    //Return the LibraryItem's creator
    public Creator getCreator();

    //Change the LibrrayItem's creator. Assign it to the value that's passed in
    public void setCreator(Creator creator);
}
