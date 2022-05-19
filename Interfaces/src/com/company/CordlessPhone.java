package com.company;

public class CordlessPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public CordlessPhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("Powering up the phone...");
        System.out.println("Phone number is set to "+this.myNumber);
        this.isOn = true;
    }

    @Override
    public boolean callPhone(int number) {
        if(!this.isOn) {
            System.out.println("Phone is switched off..");
            return false;
        }
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
        if(this.isRinging && this.isOn){
            System.out.println("Answer the call");
            return;
        }
        else if(!this.isOn)
            System.out.println("As the phone is switched off,");
        System.out.println("The phone is not ringing");
    }
}
