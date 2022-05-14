package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	    // String is a sequence of characters having a maximum length of Integer.MAX_VALUE
        String myString = "This is a string";
        System.out.println(myString+"<- is myString's value");
        myString = myString + ", and well I lost 2 matches in Dota";
        System.out.println(myString+"<- is modified myString's value ");
        myString = myString + "\u00A9";
        System.out.println(myString+"<- is modified myString's value with \u00A9");
        String myNumericData = "400.1";
        myNumericData = myNumericData+"400.1";//addition of 2 numbers is not performed
        // Instead, the string gets appended
        System.out.println(myNumericData);
        int myInt = 500;
        myNumericData = myNumericData + myInt;// IntelliJ converts int variable to a string and
        // appends to the myNumericData string
        System.out.println(myNumericData);
        //Same goes for double
        double myDouble = 23.23;
        myNumericData = myNumericData+myDouble;
        System.out.println(myNumericData);
        //String data type is immutable data type i.e. everytime we modify the value of a String variable,
        //new String data would be created in the memory.
        //To overcome this we'll use StringBuffer which is mutable.
    }
}
