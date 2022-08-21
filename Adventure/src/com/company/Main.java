package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Location> locationMap = new HashMap<>();
        locationMap.put(0,new Location(0,"Sitting in front of PC learning java"));
        locationMap.put(1,new Location(1,"Inside apartment's Bedroom"));
        locationMap.put(2,new Location(2,"Inside apartment's Master Bedroom"));
        locationMap.put(3,new Location(3,"At the Front door"));
        locationMap.put(4,new Location(4,"Standing in front of Lift"));

        int currentPosition=0;
        while (true){
            if(locationMap.containsKey(currentPosition))
                System.out.println(locationMap.get(currentPosition).getDescription());
            currentPosition=scanner.nextInt();
            if(currentPosition==0) {
                System.out.println("Back to study");
                System.out.println(locationMap.get(currentPosition).getDescription());
                break;
            }
            else if(currentPosition>4)
                System.out.println("Cannot find the location");
        }

    }
}
