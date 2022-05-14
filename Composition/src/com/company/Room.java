package com.company;

public class Room {
    private Door door;
    private Furniture bed;
    private Furniture table;
    private Lights lights;
    private Fan fan;
    private Floor floor;

    public Room(Door door, Furniture bed, Furniture table, Lights lights, Fan fan, Floor floor) {
        this.door = door;
        this.bed = bed;
        this.table = table;
        this.lights = lights;
        this.fan = fan;
        this.floor = floor;
    }

    private void furnitureInfo(){
        this.bed.getInfo();
        this.table.getInfo();
    }


    public void enteringRoom(){
        this.door.openDoor();
        System.out.println("Entering the room..");
        this.fan.powerOnFan(4);
        this.lights.powerOnLights("yellow");
        this.furnitureInfo();
    }

    private Door getDoor() {
        return door;
    }

    private Furniture getBed() {
        return bed;
    }

    private Furniture getTable() {
        return table;
    }

    public Lights getLights() {
        return lights;
    }

    private Fan getFan() {
        return fan;
    }

    private Floor getFloor() {
        return floor;
    }

}
