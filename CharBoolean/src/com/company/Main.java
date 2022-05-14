package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //char occupies 16bit as it allows users to store unicode characters
	    char myChar = 'A';//saves only one character
        char myUnicode = '\u0044'; //Unicode for letter "D"
        System.out.println("myChar = " +myChar);
        System.out.println("myUnicode = " +myUnicode);
        char myCopyrightChar = '\u00A9';
        System.out.println("myCopyrightChar = "+myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        if(myTrueBooleanValue){
            System.out.println("myTrueBooleanValue");
        }
    }
}
