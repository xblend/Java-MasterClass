package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,3,4,56,10};
        reverse(array);

    }
    private static void reverse(int[] array){
        System.out.println("Array = "+ Arrays.toString(array));
        int[] reverse = new int[array.length];
        for(int i = array.length-1;i>=0;i--){
            reverse[array.length-i-1]=array[i];
        }
        System.out.println("Reversed array = "+ Arrays.toString(reverse));
    }
}
