package com.company;

public final class Password {//To avoid any sub-class to inherit this class use final keyword here
    //values of the final declared members can be assigned only once using constructor
    public final String name; //Will throw an error until the member is not assigned with a value in constructor
    //public final String name="default";
    private final static int KEY=7474745; //To declare a constant make it "final static"


    //We can also initialize final static member in a static block
    private final static String HASH_KEY;
    private final static int HASHCODE;

    static{
        HASHCODE=5467;
        HASH_KEY="_ARGUS";
    }


    private static int instance=0;
    private final int myInstance;
    private final int password;

    public Password(String name,int password) {
        this.name=name; //This will throw an error when name member was initialized with value "default"
        this.password = encryptDecrypt(password);
        instance+=1;
        this.myInstance = instance;
    }

    private final int encryptDecrypt(int password){//To avoid this method to be overridden use final keyword here
        return password ^ KEY & HASHCODE;
    }

    public void savePassword(){
        System.out.println("The password for "+this.name.concat(HASH_KEY)+" is saved as "+this.password);
    }

    public int getMyInstance() {
        return myInstance;
    }

    public static int getInstance() {
        return instance;
    }
}
