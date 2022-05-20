package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> writeValues = new ArrayList<String>();
        writeValues.add(this.name);
        writeValues.add(String.valueOf(this.hitPoints));
        writeValues.add(String.valueOf(this.strength));

        return writeValues;
    }

    @Override
    public void read(List<String> readValues) {
        if(readValues!=null && readValues.size()>0){
            this.name = readValues.get(0);
            this.hitPoints = Integer.parseInt(readValues.get(1));
            this.strength = Integer.parseInt(readValues.get(2));
        }

    }
}
