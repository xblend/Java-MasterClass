package com.company;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName()+" penguin: can't do that I would rather prefer to swim");
    }
}
