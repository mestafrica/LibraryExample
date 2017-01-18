package com.zianos;

import java.util.ArrayList;

/**
 * Created by andrew on 1/18/17.
 */
public class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<Librarian> librarians;

    public Library(){
        items = new ArrayList<LibraryItem>();
        librarians = new ArrayList<Librarian>();
    }

    public void addItem(LibraryItem item){
        items.add(item);
    }

    private LibraryItem checkOut(LibraryItem item){
        return item.checkOut();
    }

    public void addLibrarian(Librarian librarian){
        librarians.add(librarian);
    }

    public Librarian getAvailableLibrarian(){
        Librarian availableLibrarian = null;

        for(Librarian librarian : this.librarians){
            if(librarian.isAvailable()){
                availableLibrarian = librarian;
            }
        }

        return availableLibrarian;
    }

    private ArrayList<LibraryItem> getAvailableItems(){
        ArrayList<LibraryItem> items = new ArrayList<LibraryItem>();
        for(LibraryItem item : this.items){
            if(item.isAvailable()){
                items.add(item);
            }
        }

        return items;
    }

    public ArrayList<Book> getBooks(){
        ArrayList<Book> books = new ArrayList<Book>();
        for(LibraryItem item : this.getAvailableItems()){
            if(item instanceof Book){
                books.add((Book) item);
            }
        }

        return books;
    }

    @Override
    public String toString(){
        return "The library has " + this.items.size() + " items and " +
                this.librarians;
    }
}