package com.company;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private final String name;
    private List<Seat> seats = new ArrayList<Seat>();

    public Theater(String name, int maxRow, int seatsInEachRow) {
        this.name = name;
        char maxRowIndex = (char)('A'+(maxRow-1));
        for(char row='A';row<=maxRowIndex;row++) {
            for (int i = 1; i <= seatsInEachRow; i++) {
                seats.add(new Seat(row + String.format("%02d", i)));
            }
        }
    }
    public void getSeats(){
        System.out.println("***************");
        System.out.println("Seat\tReserved");
        for (Seat seat : seats){
            System.out.println(seat.name+"\t\t"+seat.reserved);
        }
        System.out.println("***************");
    }
    public boolean reserve(String name){
        for(Seat seat : seats){
            if(name.equals(seat.name))
                return seat.reserve();
        }
        System.out.println("Seat cannot be found in the database");
        return false;
    }
    public boolean cancel(String name){
        for(Seat seat : seats){
            if(name.equals(seat.name))
                return seat.cancel();
        }
        System.out.println("Seat cannot be found in the database");
        return false;
    }
    private class Seat {
        private final String name;
        private boolean reserved;

        public Seat(String name) {
            this.name = name;
            this.reserved = false;
        }

        private boolean reserve(){
            if(!this.reserved){
                System.out.println("Reserved seat "+this.name);
                this.reserved=true;
                return true;
            }
            System.out.println(this.name+" is already reserved");
            return false;
        }

        private boolean cancel(){
            if(this.reserved){
                System.out.println("Cancelled seat "+this.name);
                this.reserved=false;
                return true;
            }
            System.out.println("There are no reservations for "+this.name);
            return false;
        }

    }
}

