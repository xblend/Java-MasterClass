package com.company;

public class Motherboard {

    private String model;
    private String manufacture;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacture, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String ProgramName){
        System.out.println("Program "+ProgramName+" is loading...");
    }


    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
