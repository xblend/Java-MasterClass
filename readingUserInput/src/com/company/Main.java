package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(!hasNextInt){
            System.out.println("Unable to parse the characters");
            scanner.close();
            return;}

        int age = 2022-scanner.nextInt();// Takes input from console and converts into int data type
        //Need to add a check for negative number
        //Need to add a check if the alphabets are entered in place of number
        scanner.nextLine();
        //The above line handles the line separator 'Enter key', otherwise the next input will be taken as blank
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        if(age<0 || age>120){
            System.out.println("Invalid age");
            scanner.close();
            return;
        }
        System.out.println("Your name is "+name+" and you are "+age+" years old");
        scanner.close();//essential to close the scanner object instance after the operations are performed
    }
}
