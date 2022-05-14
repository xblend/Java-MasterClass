package com.company;

public class PC {

    //Composition as it consists the member fields as objects of another class.
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("UbuntuOS");
    }
    private void drawLogo(){
        monitor.drawPixelAt(240,480,"yellow");
    }

}
