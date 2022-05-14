package com.company;

public class Animal {
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;


    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }
    public void movement(int speed){
        System.out.println("Animal.movement() called");
        System.out.println("Animal is at a speed of "+speed);

    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
