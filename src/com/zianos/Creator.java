package com.zianos;

/**
 * Created by andrew on 1/18/17.
 */
public class Creator {
    private String firstName;
    private String lastName;

    /*
     * Default Constructor
     * Takes in creator's name
     * Expectation name is in the form "First Last"
     */
    public Creator(String name){
        //TODO: make sure the user does not pass in invalid data
        String[] partsOfName = name.split(" ");

        this.firstName = partsOfName[0];
        this.lastName = partsOfName[1];
    }

    /*
     *  Constructor
     *  Takes in firstName, and lastName
     *  Constructs a new instance
     */
    public Creator(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*
     * String representation of Creator
     * Returns the form Lastname, FirstName
     * Ex.
     * Creator author = new Creator("Andrew Berkowitz");
     * author.toString()
     * -> Berkowitz, Andrew
     */
    @Override
    public String toString(){
        return this.lastName + ", " + this.firstName;
    }

}
