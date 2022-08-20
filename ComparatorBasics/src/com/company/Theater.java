package com.company;

import java.util.*;

public class Theater {
    private final String name;
    private List<Seat> seats = new ArrayList<Seat>();


    //Comparator is used for sorting objects on basis of various member values
    //Can be done by making an object of Comparator class and overriding the compare method
    static final Comparator<Seat> PRICE_INORDER;

    static{
        PRICE_INORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            return seat1.getPrice()>seat2.getPrice() ? 1 : seat1.getPrice()<seat2.getPrice() ? -1 : 0;
        }
    };
    }

    public Theater(String name, int maxRow, int seatsInEachRow) {
        this.name = name;
        char maxRowIndex = (char)('A'+(maxRow-1));
        /*
        Price for first 3 rows middle seats is $14
        Price for the edge seats on the last rows is $10
        Otherwise the price is $12
         */

        for(char row='A';row<=maxRowIndex;row++) {
            double price;
            for (int i = 1; i <= seatsInEachRow; i++) {
                price = 12.00;
                if(row<='D' && (i>=6 && i<=14))
                    price = 14.00;
                else if(row>='F' && (i<6 || i>14))
                    price = 10.00;
                seats.add(new Seat(row + String.format("%02d", i),price));
            }
        }
    }

    public Collection<Seat> getSeats(){
        /*
        System.out.println("***************");
        System.out.println("Seat\tReserved");
        for (Seat seat : seats){
            System.out.println(seat.name+"\t\t"+seat.reserved);
        }
        System.out.println("***************");
         */
        return seats;
    }

    public boolean reserve(String name){
        Seat requestedSeat = new Seat(name,0);
        int found = Collections.binarySearch(seats,requestedSeat,null);
        if(found>=0)
            return seats.get(found).reserve();

        System.out.println("Seat cannot be found in the database");
        return false;
    }
    public boolean cancel(String name){
        Seat requestedSeat = new Seat(name,0);
        int found = Collections.binarySearch(seats,requestedSeat,null);
        if(found>=0)
            return seats.get(found).cancel();

        System.out.println("Seat cannot be found in the database");
        return false;
    }
    public class Seat implements Comparable<Seat>{
        private double price;
        private final String name;
        private boolean reserved;

        public Seat(String name, double price) {
            this.price = price;
            this.name = name;
            this.reserved = false;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public boolean isReserved() {
            return reserved;
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

        @Override
        public int compareTo(Seat seat) {
            return this.name.compareTo(seat.name);
        }
    }
}

