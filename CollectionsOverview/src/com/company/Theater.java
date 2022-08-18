package com.company;
import java.util.*;

public class Theater {
    private final String name;
    public List<Seat> seats = new ArrayList<Seat>();
    // private Collection<Seat> seats = new LinkedList<>();
    // private Collection<Seat> seats = new HashSet<>();
    // private Collection<Seat> seats = new LinkedHashSet<>();
    // private Collection<Seat> seats = new TreeSet<>();
    /*
     class com.company.Theater$Seat cannot be cast to class java.lang.Comparable
     This is because we have not set seats using comparable
     */
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
        Seat requestedSeat = new Seat(name);
        int found = Collections.binarySearch(seats,requestedSeat,null);
        if(found>=0)
            return seats.get(found).reserve();
        /*
        for(Seat seat : seats){
            if(name.equals(seat.name))
                return seat.reserve();
        }
         */
        System.out.println("Seat cannot be found in the database");
        return false;
    }
    public boolean cancel(String name){
        Seat requestedSeat = new Seat(name);
        int found = Collections.binarySearch(seats,requestedSeat,null);
        if(found>=0)
            return seats.get(found).cancel();
        /*
        for(Seat seat : seats){
            if(name.equals(seat.name))
                return seat.cancel();
        }
         */
        System.out.println("Seat cannot be found in the database");
        return false;
    }
    public class Seat implements Comparable<Seat>{
        private final String name;
        private boolean reserved;

        public Seat(String name) {
            this.name = name;
            this.reserved = false;
        }

        public String getName() {
            return name;
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

