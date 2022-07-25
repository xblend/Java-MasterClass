package com.company.game;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                 ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> writeValues = new ArrayList<String>();
        writeValues.add(this.name);
        writeValues.add(String.valueOf(this.hitPoints));
        writeValues.add(String.valueOf(this.strength));
        writeValues.add(this.weapon);

        return writeValues;
    }

    @Override
    public void read(List<String> readValues) {
        if(readValues!=null && readValues.size()>0){
            this.name = readValues.get(0);
            this.hitPoints = Integer.parseInt(readValues.get(1));
            this.strength = Integer.parseInt(readValues.get(2));
            this.weapon = readValues.get(3);
        }
    }
}
