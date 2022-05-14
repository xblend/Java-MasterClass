package com.company;


public class Main {

    public static void main(String[] args) {
         /*
        8 primitive data types in JAVA
        1. boolean
        2. byte
        3. char
        4. short
        5. int
        6. long
        7. float
        8. double
         */
        int myValue = 10000;
        //Int occupies 32bits
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum int value: "+myMinIntValue);
        System.out.println("Maximum int value: "+myMaxIntValue);
        System.out.println("Busted Integer.MAX_VALUE: "+ (myMaxIntValue+1));//Overflow
        System.out.println("Busted Integer.MIN_VALUE: "+(myMinIntValue-1));//Underflow
        //We can also type large numbers by spacing digits with an underscore
        int myMaxIntTest = 2_147_483_647;//If we type an int literal greater than Integer.MAX_VALUE
        //or an int literal lesser than Integer.MIN_VALUE, IntelliJ throws an error saying that number is too large
        //or the number is too small respectively.
        System.out.println("myMaxIntTest: "+myMaxIntTest);

        //Byte occupies 8bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum byte value: "+myMinByteValue);
        System.out.println("Maximum byte value: "+myMaxByteValue);

        //Short occupies 16bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum short value: "+myMinShortValue);
        System.out.println("Maximum short value: "+myMaxShortValue);

        //Long occupies 64bits
        long myLongValue = 100L;//Forces the JAVA to treat it as a long
        //by default, JAVA will take any integer typed as int instead of long unless and until "L" is appended

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum long value: "+myMinLongValue);
        System.out.println("Maximum long value: "+myMaxLongValue);
        //long myLongBustedIntMaxValue = 2_147_483_648; Throws error as JAVA takes literal as int
        long myLongBustedIntMaxValue = 2_147_483_648L;
        //short myIntBustedShortMaxValue = 32768; we get error saying that required value is short
        // but passed value is int
        int myMinValueBy2 = (myMinIntValue/2);
        //byte myByteValueBy2 = (myMinByteValue/2);
        // we get error above because JAVA took the value of the expression as an int by default
        // Reason: JAVA uses int by default
        byte myByteValueBy2 = (byte)(myMinByteValue/2);//Typecast the output data type to byte
        int myIntVariable = 2100;
        byte myByteVariable = 120;
        short myShortVariable = 32000;

        long myLongTotal = 50000L+10L*(myIntVariable+myByteVariable+myShortVariable);
        System.out.println("myLongTotal="+myLongTotal);

        short myShortTotal = (short)(50+10*(myIntVariable+myByteVariable+myShortVariable));
        //since output is in int by default which doesn't fit the width of the short,
        // we have to typecast it to short datatype.
        System.out.println("myShortTotal=" + myShortTotal);

    }
}
