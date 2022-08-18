package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Theater pvr = new Theater("pvr",8,10);
        pvr.getSeats();
        pvr.reserve("Z01");
        pvr.reserve("A01");
        pvr.reserve("A01");
        pvr.cancel("Z01");
        pvr.cancel("A01");
        pvr.cancel("B01");

        pvr.reserve("A01");
        pvr.reserve("B01");
        pvr.reserve("C01");
        pvr.reserve("D01");
        pvr.reserve("A02");
        pvr.reserve("E01");
        pvr.reserve("F01");
        pvr.reserve("H08");

        pvr.getSeats();

        List<Theater.Seat> seatCopy = new ArrayList<>(pvr.seats); //shallow copy
        //2 different list objects would be referencing the same elements in the list

        pvr.reserve("A04");
        System.out.println("seatCopy's A04 is also reserved? "+seatCopy.get(3).isReserved());
        System.out.println("****************************************************************\n");
        //Shuffling of one copy doesn't affect the other
        Collections.shuffle(seatCopy);//shuffles the elements randomly
        System.out.println("Printing shuffled seatCopy <shallow copy>");
        printList(seatCopy);
        System.out.println("Printing pvr.seats <original>");
        printList(pvr.seats);
        System.out.println("Sorting the randomly shuffled seatCopy");
        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy <shallow copy>");
        printList(seatCopy);
        System.out.println("Printing pvr.seats <original>");
        printList(pvr.seats);

        //To make a deep copy dev's usually write the following
        //List<Theater.Seat> newSeats = new ArrayList<>(pvr.seats.size());
        //Collections.copy(newSeats,pvr.seats);
        /* The above will throw an error
         <Exception in thread "main" java.lang.IndexOutOfBoundsException: Source does not fit in dest>
         Reason:
         List<Theater.Seat> newSeats = new ArrayList<>(pvr.seats.size()); will create a List with the max
         capacity of pvr.seats.size() but elements initialized to null
         For Collections.copy the dest list needs to have same size of that of source with all the elements valued other
          than null for a successful deep copy
         */

    }

    public static void printList(List<Theater.Seat> list){
        int i=0;
        System.out.println("****************************************************************\n");
        for(Theater.Seat seat : list){
            i+=1;
            System.out.print(" "+seat.getName());
            if(i%16==0)
                System.out.println();
        }
        System.out.println();
        System.out.println("****************************************************************");
    }

    public static void sortList(List<? extends Theater.Seat> list){ //Any class which extends/contains Theater.Seat type
        //Bubble sort
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).compareTo(list.get(j))>0)
                    Collections.swap(list,i,j); //Swaps the ith and jth indexes of the provided list
            }
        }
    }


}
