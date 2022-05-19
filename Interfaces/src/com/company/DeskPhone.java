package com.company;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhone doesn't have a power button");
    }

    @Override
    public boolean callPhone(int number) {
        System.out.println("Calling "+number);
        if(!this.isRinging) {
            System.out.println("Phone is ringing. Please wait..");
            this.isRinging = true;
        }
        else {
            System.out.println("Cannot connect to the phone");
            this.isRinging = false;
        }
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }

    @Override
    public void answer() {
        if(this.isRinging){
            System.out.println("Answer the call");
            return;
        }
        System.out.println("The phone is not ringing");
    }
}
