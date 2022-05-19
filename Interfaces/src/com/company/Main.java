package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone deskPhone;
        deskPhone = new DeskPhone(3001);
        deskPhone.powerOn();
        deskPhone.callPhone(7090);
        System.out.println("Is phone ringing? "+deskPhone.isRinging());
        deskPhone.answer();
        deskPhone.callPhone(3009);
        System.out.println("Is phone ringing? "+deskPhone.isRinging());
        deskPhone.answer();
    }
}
