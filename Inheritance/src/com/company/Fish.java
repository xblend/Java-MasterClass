package com.company;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int size, int weight, String name, int gills, int eyes, int fins) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest(){
        System.out.println("Fish.rest() called");
        super.movement(0);
    }
    private void moveBackFin(){
        System.out.println("Fish.moveBackFin() called");
    }
    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() called");
    }

    public void swim(int speed){
        System.out.println("Fish.swim() called");
        this.moveBackFin();
        this.moveMuscles();
        super.movement(speed);

    }
}
