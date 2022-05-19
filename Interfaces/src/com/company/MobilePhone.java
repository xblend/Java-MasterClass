package com.company;

public class MobilePhone implements IApp,ITelephone{ //Multiple Inheritance
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
        this.isOn = false;
    }

    @Override
    public boolean isAppOpen(Application app) {
        System.out.println("The app "+app.getName()+" is "+(app.isOpen() ? "open" : "close"));
        return app.isOpen();
    }

    @Override
    public void openApp(Application app) {
        if(!this.isOn) {
            System.out.println("Phone is switched off..");
            return;
        }
        System.out.println("Opening app "+app.getName());

        if(!app.isOpen())
            app.openApp();
        else
            System.out.println(app.getName()+" instance is open already");
    }

    @Override
    public void closeApp(Application app) {
        System.out.println("Closing app "+app.getName());
        if(app.isOpen())
            app.closeApp();
        else
            System.out.println(app.getName()+" instance is closed already");
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
