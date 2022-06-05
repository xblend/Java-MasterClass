package com.company;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" dog: is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" dog: breathe in, breathe out, repeat");
    }
}
