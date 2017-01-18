package com.zianos;

/**
 * Created by andrew on 1/18/17.
 */
public class Librarian {

    private String name;
    private boolean isAvailable;

    public Librarian(String name){
        this.name = name;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    @Override
    public String toString(){
        return "Librarian " + this.name + " " + (this.isAvailable ? "is Available" : "isBusy");
    }
}
