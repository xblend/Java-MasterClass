package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number = 0;
        //boolean start = true;
        while(true){
            System.out.println("Enter number:");
            if(!scanner.hasNextInt()){
                System.out.println("Invalid number! Breaking the loop");
                break;
            }

            number = scanner.nextInt();
            /*
            Set the min to max int value and max to min int value.
            Then there is no need to use flag
            if(start){
                min = number;
                max = number;
                start=false;
            }
             */
            if(number<min)
                min = number;
            else if(number>max)
                max = number;
            scanner.nextLine();
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        scanner.close();
    }
}
