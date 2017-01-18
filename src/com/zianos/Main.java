package com.zianos;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Library andrewsLibrary = new Library();

        //"Buy" some books
        ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(
                new Book(),
                new Book()
        ));

        for(Book book : books){
            andrewsLibrary.addItem(book);
        }

        /*for(int i = 0; i < books.size(); i++){
            Book book = books.get(i);

            andrewsLibrary.addItem(book);
        }*/

        andrewsLibrary.addLibrarian(new Librarian("Eric"));
        andrewsLibrary.addLibrarian(new Librarian("Erica"));

        System.out.println(andrewsLibrary);

        Creator firstAuthor = new Creator("Andrew Berkowitz");
        Creator secondAuthor = new Creator("Andrew", "Berkowitz");
    }
}
