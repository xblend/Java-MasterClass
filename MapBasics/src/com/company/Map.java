package com.company;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Character,String> alphabets = new HashMap<>();
        /*
        NOTE: UNLIKE PYTHON THERE IS NO SUCH REQUIREMENT IN JAVA THAT KEY OF MAP SHOULD BE IMMUTABLE
         */
        //Put method is used to insert the key-value pair in the Map and return the previous value of the associated key
        System.out.println(alphabets.put('A',"Apple"));//will print "null"
        System.out.println(alphabets.put('C',"Cat"));
        System.out.println(alphabets.put('D',"Dog"));
        System.out.println(alphabets.put('E',"Elephant"));

        System.out.println(alphabets.put('A',"Ant"));//will print "Apple"

        insert(alphabets,'A',"Anthem");
        insert(alphabets,'F',"Fish");

        printMap(alphabets);//Will print the unsorted key:value pairs in the same order in which key:value pairs were added.

        remove(alphabets,'R');
        remove(alphabets,'A',"Anthem");
        remove(alphabets,'F');
        remove(alphabets,'E',"Elephant");
        replace(alphabets,'A',"Apple","Ant");
        replace(alphabets,'B',"Bat");
        replace(alphabets,'A',"Ant","Apple");
        replace(alphabets,'A',"Antlers");

        printMap(alphabets);


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

    public static boolean replace(java.util.Map m, Character k, String val, String newVal){
        if(m.replace(k,val,newVal)){
            System.out.println("key "+k+" having value \""+val+"\" was replaced successfully with the new value \""
            +newVal+"\"");
            return true;
        }
        System.out.println("key "+k+" having value \""+val+"\" doesn't exist");
        return false;
    }

    public static boolean replace(java.util.Map m, Character k, String newVal){
        String val = (String) m.get(k);
        if(m.replace(k,newVal)!=null){
            System.out.println("key "+k+" having value \""+val+"\" was replaced successfully with the new value \""
                    +newVal+"\"");
            return true;
        }
        System.out.println("key "+k+" doesn't exist");
        return false;
    }

    public static boolean remove(java.util.Map m, Character k, String val){
        if(m.remove(k,val)){
            System.out.println("key "+k+" having value \""+val+"\" was successfully removed");
            return true;
        }
        System.out.println("key "+k+" having value \""+val+"\" doesn't exist");
        return false;
    }
    public static boolean remove(java.util.Map m, Character k){
        String val = (String) m.get(k);
        if(m.remove(k)!=null){
            System.out.println("key "+k+" having value \""+val+"\" was successfully removed");
            return true;
        }
        System.out.println("key "+k+" doesn't exist");
        return false;
    }

    public static void printMap(java.util.Map m){
        System.out.println("***************\nKey : Value");
        for(Object k : m.keySet()){
            System.out.println(k+" : "+m.get(k));
        }
        System.out.println("***************");
    }
}
