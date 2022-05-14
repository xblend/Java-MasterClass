package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(22,32,5);
	    Case theCase = new Case("220XB","Dell","240",dimensions);
        Monitor monitor = new Monitor("LG28144","LG",32,new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("Z690x TomHat","MSI"
                ,4,2,"V2.54");
        PC thePc = new PC(theCase,motherboard,monitor);
        /*
        //The below will fail since we either removed the getters from PC class or made them private
        thePc.getTheCase().pressPowerButton();
        thePc.getMonitor().drawPixelAt(500,500,"red");
        thePc.getMotherboard().loadProgram("Dotav2.8");
         */
        thePc.powerUp();

        Dimensions2D doorDimensions = new Dimensions2D(180,60);
        Door door = new Door(true,"Teak Wood",doorDimensions);
        Tile tile = new Tile("Ceramic",new Dimensions2D(30,30),"Cera");
        Floor floor = new Floor(tile,new Dimensions2D(480,560));
        Furniture bed = new Furniture("bed","Plywood",new Dimensions(120,120,60));
        Furniture table = new Furniture("table","Glass",new Dimensions(60,60,100));
        Fan fan = new Fan("Opera","H2345Cool");
        Lights lights = new Lights("XRGB2234","Philips");

        Room theRoom = new Room(door,bed,table,lights,fan,floor);

        theRoom.enteringRoom();
    }
    //It is usually recommended to give priority to Composition first then to Inheritance,
    // but it all depends on case to case basis.


}
