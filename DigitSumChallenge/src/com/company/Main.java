package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits in -1 is "+sumDigits(-1));
        System.out.println("The sum of digits in 9 is "+sumDigits(9));
        System.out.println("The sum of digits in 10 is "+sumDigits(10));
        System.out.println("The sum of digits in 25 is "+sumDigits(25));
        System.out.println("The sum of digits in 1467 is "+sumDigits(1467));
    }
    public static int sumDigits(int number){
        if (number<10)
            return -1;
        int sum = 0;
        while(number!=0){
            sum+=(number%10);
            number/=10;
        }
        return sum;
    }
}
