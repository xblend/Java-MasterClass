package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q",0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public void addExit(String key, Integer value){
        this.exits.put(key,value);
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
        //This will return a copy of the exits map so that no one can change the original contents of the map from outside
    }
}
