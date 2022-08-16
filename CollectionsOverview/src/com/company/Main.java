package com.company;

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
    }
}
