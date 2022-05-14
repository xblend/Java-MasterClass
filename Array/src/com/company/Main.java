package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Array is a reference type of object.
        //Eg:
        //int[] myArray = {1,2,3,5};
        //int[] anotherArray = myArray;
        //Here any changes in either myArray or anotherArray would affect the values of both the arrays
        //Reason: both the arrays are being referenced to a single memory location.
        //Or we can say that anotherArray was referenced to the memory location of myArray using assignment operator.
        //Remember we use "new" to make instances of objects. Recall references and instances type of objects.
        //Ways an array can be declared
        //1.
        int[] myIntArray;
        //default values of numeric array elements is 0.
        //default values of boolean array elements is false.
        //default values of String or other object array elements is null
        myIntArray = new int[10];//Array of length 10
        //2.
        double[] myDoubleArray = new double[20];//Array of length 20;
        //3.
        float[] myFloatArray = { 10.3f,4.5f,3.6f,7.8f };//Assigning array elements during initialization with size.
        //{} are called as array initialization block
        //How to assign array elements
        for(int i = 0; i<myIntArray.length;i++){//Array starts from index 0 and goes up to (length of array - 1)
            myIntArray[i]=i*10;
        }

        //How to print array elements
        for(int i = 0; i<myIntArray.length;i++){//Array starts from index 0 and goes up to (length of array - 1)
            System.out.println("For index "+i+" the value is "+myIntArray[i]);
        }
        //The below throws an exception named as ArrayIndexOutOfBoundsException
        /*
        for(int i = 0; i<11;i++){//Array starts from index 0 and goes up to (length of array - 1)
            System.out.println("For index "+i+" the value is "+myIntArray[i]);
        }
        */
        int[] myInputArray = getIntegers(5);
        printArray(myInputArray);
        System.out.println("Average of the array is "+averageOfArray(myInputArray));
        int[] sortedArray = sortIntegers(myInputArray);
        printArray(sortedArray);

        //printing array using Arrays.toString() method
        System.out.println("inputArray is "+ Arrays.toString(myInputArray));
        //Output:
        //inputArray is [1, 2, 3, 4, 5]
        int[] resizedArray = resizeArray(7,sortedArray);
        resizedArray[5] = 100;
        resizedArray[6] = -23;
        System.out.println("Resized sortedArray is "+Arrays.toString(resizedArray));

    }
    //Function to scan user input
    public static int[] getIntegers(int length){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[length];
        System.out.println("Enter the elements of the array:\r");
        for(int i=0;i<length;i++){
            array[i] = scan.nextInt();
        }
        return array;
    }

    //Function to display elements of array
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }

    }
    //Function to resize an array
    //resizing an array is a tedious job to do.
    //That's the reason Java introduced the concept of lists.
    public static int[] resizeArray(int length,int[] array){
        int[] newArray = new int[length];
        int cloneLength=0;
        if(length>array.length)
            cloneLength = array.length;
        else
            cloneLength = length;
        for(int i=0;i<cloneLength;i++){
            newArray[i]=array[i];
        }
        return newArray;
    }

    //Function to return average of the array
    public static double averageOfArray(int[] array){
        double sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = array.clone();
        for(int i=0;i<array.length-1;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (sortedArray[j] > sortedArray[i]) {
                    sortedArray[j] = sortedArray[j] + sortedArray[i];
                    sortedArray[i] = sortedArray[j] - sortedArray[i];
                    sortedArray[j] = sortedArray[j] - sortedArray[i];
                }
            }
        }
        return sortedArray;
    }

}
