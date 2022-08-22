package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Location> locationMap = new HashMap<>();
        locationMap.put(0,new Location(0,"You are now sitting in front of PC learning java"));
        locationMap.put(1,new Location(1,"You are now standing on the road"));
        locationMap.put(2,new Location(2,"You are now standing on top of the hill"));
        locationMap.put(3,new Location(3,"You are now standing inside the building"));
        locationMap.put(4,new Location(4,"You are now standing besides the valley"));
        locationMap.put(5,new Location(5,"You are now standing in the middle of the forest"));

        initialize(locationMap);


        int currentPosition=1;
        while (true) {
            if(locationMap.containsKey(currentPosition))
                System.out.println(locationMap.get(currentPosition).getDescription());
            else
                System.out.println("Location not found");
            System.out.println("Following are the directions you can go:");
            Map<String,Integer> exits = locationMap.get(currentPosition).getExits();
            for(String k:exits.keySet())
                System.out.print(k+", ");
            String direction = scanner.nextLine().toUpperCase();
             if(exits.containsKey(direction))
                 currentPosition=exits.get(direction);
             else
                 System.out.println("You cannot go in that direction!");
            if(currentPosition==0){
                System.out.println("Going back to study");
                System.out.println(locationMap.get(currentPosition).getDescription());
                break;
            }
        }

    }

    public static void initialize(Map<Integer,Location> locationMap){
        locationMap.get(1).addExits("N",5);
        locationMap.get(1).addExits("W",2);
        locationMap.get(1).addExits("E",3);
        locationMap.get(1).addExits("S",4);

        locationMap.get(2).addExits("N",5);

        locationMap.get(3).addExits("W",1);

        locationMap.get(4).addExits("N",1);
        locationMap.get(4).addExits("W",2);

        locationMap.get(5).addExits("W",2);
        locationMap.get(5).addExits("S",1);
    }
}
