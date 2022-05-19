package com.company;
//You can implement multiple Interfaces in a single class (Multiple Inheritance)
public class Main {

    public static void main(String[] args) {
	    ITelephone deskPhone;
        deskPhone = new DeskPhone(3001);
        System.out.println("*******************************");
        System.out.println("Added Desk phone to network");
        System.out.println("*******************************");
        deskPhone.powerOn();
        deskPhone.callPhone(7090);
        System.out.println("Is phone ringing? "+deskPhone.isRinging());
        deskPhone.answer();
        deskPhone.callPhone(3009);
        System.out.println("Is phone ringing? "+deskPhone.isRinging());
        deskPhone.answer();

        //Using the same object of ITelephone
        deskPhone = new CordlessPhone(3001);
        System.out.println("*******************************");
        System.out.println("Added Cordless phone to network");
        System.out.println("*******************************");
        deskPhone.callPhone(7090);
        System.out.println("Is phone ringing? "+deskPhone.isRinging());
        deskPhone.answer();
        deskPhone.powerOn();
        deskPhone.callPhone(7090);
        System.out.println("Is phone ringing? "+deskPhone.isRinging());
        deskPhone.answer();
        deskPhone.callPhone(3009);
        System.out.println("Is phone ringing? "+deskPhone.isRinging());
        deskPhone.answer();

        MobilePhone mobilePhone = new MobilePhone(3370);
        System.out.println("*******************************");
        System.out.println("Added Mobile phone");
        System.out.println("*******************************");
        Application youtube = new Application("youtube");
        mobilePhone.openApp(youtube);
        mobilePhone.callPhone(7090);
        System.out.println("Is phone ringing? "+mobilePhone.isRinging());
        mobilePhone.answer();
        mobilePhone.powerOn();
        mobilePhone.callPhone(3009);
        System.out.println("Is phone ringing? "+mobilePhone.isRinging());
        mobilePhone.answer();


        mobilePhone.closeApp(youtube);
        mobilePhone.isAppOpen(youtube);
        mobilePhone.openApp(youtube);
        mobilePhone.openApp(youtube);
        mobilePhone.closeApp(youtube);
        mobilePhone.closeApp(youtube);
    }
}
