package com.company;

public class Main {

    public static void main(String[] args) {
	    char alphabet = 'e';
        switch (alphabet){
            case 'a':
            case 'A':
                System.out.println("A was found");
                break;
            case 'b':
            case 'B':
                System.out.println("B was found");
                break;
            case 'c':
            case 'C':
                System.out.println("C was found");
                break;
            case 'd':
            case 'D':
                System.out.println("D was found");
                break;
            case 'e':
            case 'E':
                System.out.println("E was found");
                break;
            default:
                System.out.println("A,B,C,D or E was not found");
    }
    //From JDK 7 we can also use String data type apart from primitive 8 data types for switch statement.String month = "January";
        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "december":
                System.out.println("Dec");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not found");
    }
    }
}
