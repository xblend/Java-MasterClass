package com.company;/*
    Only add/edit code where it is stated in the description.
*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private Map<String,String> vocabulary = new HashMap<>();
    public Main() {
        /*
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempMap));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempMap));
        locations.put(2, new Location(2, "You are at the top of a hill",tempMap));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempMap));
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempMap));
        locations.put(5, new Location(5, "You are in the forest",tempMap));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
         */
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");
        
        //Due to addExits method the class Location is still mutable as we are able to add the exits to the Map from main
        //To make class Location immutable we will parse the exits while creating the object of Location class
        
        Map<String,Integer> tempMap = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        tempMap = new HashMap<>();
        tempMap.put("W", 2);
        tempMap.put("E", 3);
        tempMap.put("S", 4);
        tempMap.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempMap));

        tempMap = new HashMap<>();
        tempMap.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempMap));

        tempMap = new HashMap<>();
        tempMap.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempMap));

        tempMap = new HashMap<>();
        tempMap.put("N", 1);
        tempMap.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempMap));

        tempMap = new HashMap<>();
        tempMap.put("S", 1);
        tempMap.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempMap));
        tempMap.remove("S");//This will cause a havoc as we are passing original copy of tempMap to the constructor
        //The above line will remove "S" exit from the Location having locationID=5
    }

    public void command() {
        Scanner scanner = new Scanner(System.in);

        int currentPosition=1;
        while (true) {
            if(locations.containsKey(currentPosition))
                System.out.println(locations.get(currentPosition).getDescription());
            System.out.print("Available exits are ");
            Map<String,Integer> exits = locations.get(currentPosition).getExits();
            for(String k:exits.keySet())
                System.out.print(k+", ");
            String direction = scanner.nextLine().toUpperCase();
            String[] splitString = direction.split(" ");
            for(String s: splitString)
                if(vocabulary.containsKey(s))
                    direction=vocabulary.get(s);

            if(exits.containsKey(direction))
                currentPosition=exits.get(direction);
            else
                System.out.println("You cannot go in that direction");

            if(currentPosition==0){
                System.out.println(locations.get(currentPosition).getDescription());
                break;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.command();
    }
}