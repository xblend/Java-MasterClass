package com.company;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" bird: is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" bird: breathe in, breathe out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" bird: flapping wings");
    }
    //public abstract void fly(); //This method was shifted to CanFly interface
}
