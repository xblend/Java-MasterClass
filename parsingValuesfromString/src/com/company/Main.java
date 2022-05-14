package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
        //String numberAsString = "2018a"; will throw an execption
        System.out.println("Number as String = "+numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("Number as Int = "+number);

        numberAsString+=1;
        number+=1;


        System.out.println("Number as String = "+numberAsString);
        System.out.println("Number as Int = "+number);

        numberAsString+=".435";
        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("Number as Double = "+doubleNumber);
        //modifying value of doubleNumber
        doubleNumber+=0.25;
        System.out.println("Number as Double = "+doubleNumber);
    }
}
