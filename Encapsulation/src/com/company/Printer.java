package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        if(this.tonerLevel<0|| this.tonerLevel>100)
            this.tonerLevel = -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        int tonerLevel = this.tonerLevel+tonerAmount;

        if(tonerAmount<1 || tonerLevel>100)
            return -1;
        return this.tonerLevel+=tonerAmount;
    }

    public int printPages(int pages){
        int pagesToPrint = 0;
        if(this.duplex) {
            pagesToPrint = pages%2==0 ? pages/2 : pages/2+1;
            System.out.println("Printing in duplex mode");
            this.pagesPrinted+=pagesToPrint;
            return pagesToPrint;
        }
        this.pagesPrinted+=pages;
        return this.pagesPrinted;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }



}
