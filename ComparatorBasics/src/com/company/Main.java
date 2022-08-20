package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theater pvr = new Theater("pvr",8,20);
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

        List<Theater.Seat> reverseSeats = new ArrayList<>(pvr.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(pvr.getSeats());
        priceSeats.add(pvr.new Seat("ExtraB01",13.00));
        priceSeats.add(pvr.new Seat("ExtraA01",13.00));

        /* Warning:
         If you check the output the "ExtraB01" comes before "ExtraA01" because, we inserted "ExtraA01" after "ExtraB01"
         so the comparator is sorting only on the basis of pricing.
         This means the comparator is not consistent with the equals.
         */
        Collections.sort(priceSeats,Theater.PRICE_INORDER);
        printList(priceSeats);
        /*
        Output:
        ****************************************************************

        F01($10.0) F02($10.0) F03($10.0) F04($10.0) F05($10.0) F15($10.0) F16($10.0) F17($10.0) F18($10.0) F19($10.0) F20($10.0) G01($10.0) G02($10.0) G03($10.0) G04($10.0) G05($10.0) G15($10.0) G16($10.0) G17($10.0) G18($10.0)
        G19($10.0) G20($10.0) H01($10.0) H02($10.0) H03($10.0) H04($10.0) H05($10.0) H15($10.0) H16($10.0) H17($10.0) H18($10.0) H19($10.0) H20($10.0) A01($12.0) A02($12.0) A03($12.0) A04($12.0) A05($12.0) A15($12.0) A16($12.0)
        A17($12.0) A18($12.0) A19($12.0) A20($12.0) B01($12.0) B02($12.0) B03($12.0) B04($12.0) B05($12.0) B15($12.0) B16($12.0) B17($12.0) B18($12.0) B19($12.0) B20($12.0) C01($12.0) C02($12.0) C03($12.0) C04($12.0) C05($12.0)
        C15($12.0) C16($12.0) C17($12.0) C18($12.0) C19($12.0) C20($12.0) D01($12.0) D02($12.0) D03($12.0) D04($12.0) D05($12.0) D15($12.0) D16($12.0) D17($12.0) D18($12.0) D19($12.0) D20($12.0) E01($12.0) E02($12.0) E03($12.0)
        E04($12.0) E05($12.0) E06($12.0) E07($12.0) E08($12.0) E09($12.0) E10($12.0) E11($12.0) E12($12.0) E13($12.0) E14($12.0) E15($12.0) E16($12.0) E17($12.0) E18($12.0) E19($12.0) E20($12.0) F06($12.0) F07($12.0) F08($12.0)
        F09($12.0) F10($12.0) F11($12.0) F12($12.0) F13($12.0) F14($12.0) G06($12.0) G07($12.0) G08($12.0) G09($12.0) G10($12.0) G11($12.0) G12($12.0) G13($12.0) G14($12.0) H06($12.0) H07($12.0) H08($12.0) H09($12.0) H10($12.0)
        H11($12.0) H12($12.0) H13($12.0) H14($12.0) ExtraB01($13.0) ExtraA01($13.0) A06($14.0) A07($14.0) A08($14.0) A09($14.0) A10($14.0) A11($14.0) A12($14.0) A13($14.0) A14($14.0) B06($14.0) B07($14.0) B08($14.0) B09($14.0) B10($14.0)
        B11($14.0) B12($14.0) B13($14.0) B14($14.0) C06($14.0) C07($14.0) C08($14.0) C09($14.0) C10($14.0) C11($14.0) C12($14.0) C13($14.0) C14($14.0) D06($14.0) D07($14.0) D08($14.0) D09($14.0) D10($14.0) D11($14.0) D12($14.0)
        D13($14.0) D14($14.0)
        ****************************************************************
         */

    }

    public static void printList(List<Theater.Seat> list){
        int i=0;
        System.out.println("****************************************************************\n");
        for(Theater.Seat seat : list){
            i+=1;
            System.out.print(" "+seat.getName()+"($"+seat.getPrice()+")");
            if(i%20==0)
                System.out.println();
        }
        System.out.println();
        System.out.println("****************************************************************");
    }



}
