package com.company;

import java.util.ArrayList;


class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
	    //Arrays
        String[] myStringArray = new String[10];
        int[] myIntArray = new int[10];

        //ArrayList

        ArrayList<String> myStringArrayList = new ArrayList<String>();
        myStringArrayList.add("Akshat");//String is not a primitive type data it's a class.
        //The below one throws an error since, ArrayList cannot accept primitive data type as an argument
        //ArrayList<int> myIntArrayList = new ArrayList<int>();
        //Instead we can create a class with an int value and make an ArrayList of it.
        ArrayList<IntClass> myIntClassArrayList = new ArrayList<IntClass>();
        myIntClassArrayList.add(new IntClass(10));

        //Autoboxing
        //Integer is the wrapper class for int
        //for each primitive data type there is a wrapper primitive class
        ArrayList<Integer> myIntegerArrayList = new ArrayList<Integer>();
        myIntegerArrayList.add(10);

        ArrayList<Double> myDoubleArrayList= new ArrayList<Double>();
        myDoubleArrayList.add(10.34);


        for(int i=0;i<=10;i++){
            myIntegerArrayList.add(i*10);
        }

        //Unboxing
        System.out.println("myIntegerArrayList contains:");
        for(int i=0;i<myIntegerArrayList.size();i++){
            System.out.println(myIntegerArrayList.get(i).intValue());
        }

        Integer myIntValue = 69; //no need to use "new" keyword here.
        //Java automatically translates above line to
        //Integer myIntValue = Integer.valueOf(69); which translates to,
        //Integer myIntValue = new Integer(69):

        //We can also do
        int myInt = myIntValue;

        //Autoboxing
        for(double dbl=0.0;dbl<=10;dbl+=0.5){
            myDoubleArrayList.add(dbl);
        }
        System.out.println("myDoubleArrayList contains:");
        for(int i=0;i<myDoubleArrayList.size();i++){
            System.out.println(i+" --> "+myDoubleArrayList.get(i).doubleValue());
        }
        System.out.println();
        System.out.println("myDoubleArrayList contains <without using .doubleValue()>:");
        for(int i=0;i<myDoubleArrayList.size();i++){
            System.out.println(i+" --> "+myDoubleArrayList.get(i));
        }


        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", false);

    }
}
