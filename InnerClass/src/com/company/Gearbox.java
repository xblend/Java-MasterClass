package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;//Renamed from gearNumber
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }
    //Making inner class private make sense
    //public class Gear {
    private class Gear {
        private int gearNumber;
        //This variable is shadowing the gearNumber variable defined in class Gearbox
        private double ratio;

        public double getRatio() {
            return ratio;
        }

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;//here this.gearNumber uses the gearNumber defined in the inner class Gear
            //To access the variable gearNumber of class Gearbox we'll use Gearbox.this.gearNumber
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }
    public void addGear(int number, double ratio){
        if(number<0 || number>this.maxGears){
            System.out.println("Cannot add negative gears or gear greater than "+this.maxGears);
            return;
        }
        this.gears.add(new Gear(number,ratio));
        System.out.println("Added a gear with number "+number+" and ratio "+ratio);
    }
    public void changeGear(int newGear) {
        if (newGear > 0 && newGear < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear is changed to " + this.currentGear);
        } else {
            System.out.println("Totalled!! Clutch is not pressed or gearNumber not found");
            this.currentGear = 0;
        }
    }
    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Totalled!! Clutch is pressed");
            return 0.0;
        }
        return revs*gears.get(this.currentGear).getRatio();
    }
}
