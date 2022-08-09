package com.company;

//Static members are shared by all the instances of the class
public class StaticTest {
    private int privateNumberInstance=0;
    private static int staticNumberInstance=0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        privateNumberInstance+=1;
        staticNumberInstance+=1;
    }

    public int getPrivateNumberInstance() {
        return privateNumberInstance;
    }

    /*
    public int getStaticNumberInstance() {
        return staticNumberInstance;
    }
     */

    public static int getStaticNumberInstance() {
        return staticNumberInstance;
    }

    public String getName() {
        return name;
    }
}
