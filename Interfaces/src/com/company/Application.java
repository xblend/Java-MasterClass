package com.company;

public class Application {
    private String name;
    private boolean isOpen;

    public Application(String name) {
        System.out.println("App "+name+" initiated..");
        this.name = name;
        this.isOpen = false;
    }

    public String getName() {
        return name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void openApp(){
        System.out.println("Opened "+this.name);
        this.isOpen = true;
    }

    public void closeApp(){
        System.out.println("Closed "+this.name);
        this.isOpen = false;
    }
}
