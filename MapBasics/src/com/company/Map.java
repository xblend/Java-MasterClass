package com.company;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Character,String> alphabets = new HashMap<>();

        //Put method is used to insert the key-value pair in the Map and return the previous value of the associated key
        System.out.println(alphabets.put('A',"Apple"));//will print "null"
        System.out.println(alphabets.put('C',"Cat"));
        System.out.println(alphabets.put('D',"Dog"));
        System.out.println(alphabets.put('E',"Elephant"));

        System.out.println(alphabets.put('A',"Ant"));//will print "Apple"

        insert(alphabets,'A',"Anthem");
        insert(alphabets,'F',"Fish");

        printMap(alphabets);//Will print the unsorted key:value pairs in the same order in which key:value pairs were added.

    }

    public static boolean insert(java.util.Map m, Character k, String val){
        if(m.containsKey(k)){
            System.out.println("Key "+k+" already exists");
            return false;
        }
        System.out.println("Key "+k+" having value \""+val+"\" added successfully");
        m.put(k,val);
        return true;
    }

    public static void printMap(java.util.Map m){
        System.out.println("***************\nKey : Value");
        for(Object k : m.keySet()){
            System.out.println(k+" : "+m.get(k));
        }
        System.out.println("***************");
    }
}
