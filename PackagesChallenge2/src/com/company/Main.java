package com.company;
import com.company.Series;
public class Main {

    public static void main(String[] args) {
        System.out.println("******* Sum of n whole numbers **********");
        System.out.println(Series.nSum(0));
        System.out.println(Series.nSum(1));
        System.out.println(Series.nSum(2));
        System.out.println(Series.nSum(3));

        System.out.println("***** Factorial of nth whole number *****");
        System.out.println(Series.factorial(0));
        System.out.println(Series.factorial(1));
        System.out.println(Series.factorial(2));
        System.out.println(Series.factorial(3));

        System.out.println("**** nth number in Fibonacci series ****");
        System.out.println(Series.fibonacci(1));
        System.out.println(Series.fibonacci(2));
        System.out.println(Series.fibonacci(3));
        System.out.println(Series.fibonacci(4));



    }
}
