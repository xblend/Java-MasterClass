package com.company;

import java.util.Locale;

public class Car {
    //private for fields to adhere to encapsulation of an object in OOPs.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        //we can add validation here
        String validModel = model.toLowerCase();
        if(validModel.equals("gt911s"))
            this.model = model+" turbo";
        else
            this.model = model;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public  void setEngine(String engine){
        this.engine = engine;
    }
    public void  setColor(String color){
        this.color = color;
    }
    public String getModel(){
        return this.model;
    }
    public int getDoors() {
        return doors;
    }
    public String getEngine(){
        return engine;
    }
    public String getColor(){
        return color;
    }
    public int getWheels(){
        return wheels;
    }

}
