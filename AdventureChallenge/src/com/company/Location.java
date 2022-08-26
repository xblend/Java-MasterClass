package com.company;

import java.util.HashMap;
import java.util.Map;

public final class Location {//final keyword so that no one can inherit from this class and change the contents.
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int locationID, String description, Map<String,Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        //this.exits = exits; //This is dangerous as we are referencing mutable objects directly **check Line 73** in Main class
        //The constructor will crash the program if we parse null to exits map
        if(exits!=null) {//To avoid this we are checking the condition if the user has passed "null"
            this.exits = new HashMap<>(exits); //Parsing a copy of exits is right move
        }else{
            this.exits=new HashMap<>();
        }
        this.exits.put("Q", 0);

    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    /*
    //No need of addExit method as we are parsing exit while creating object of Location class
    public void addExit(String key, Integer value){
        this.exits.put(key,value);
    }
    */
    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
        //This will return a copy of the exits map so that no one can change the original contents of the map from outside
    }
}
/*
IMPORTANT:
***A Strategy for Defining Immutable Objects***
1. Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
2. Make all fields final and private.
3. Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final.
    A more sophisticated approach is to make the constructor private and construct instances in factory methods.
4. If the instance fields include references to mutable objects, don't allow those objects to be changed:
   1. Don't provide methods that modify the mutable objects.
   2. Don't share references to the mutable objects. Never store references to external,
      mutable objects passed to the constructor; if necessary, create copies, and store references to the copies.
      Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.
 */
