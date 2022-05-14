package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Array:");
        int count = readInteger();
        int[] array = readElements(count);
        System.out.println("Minimum of "+ Arrays.toString(array)+" is "+findMin(array));
    }
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for(int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0;i< array.length;i++){
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }
}
