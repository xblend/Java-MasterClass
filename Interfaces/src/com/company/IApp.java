package com.company;

//The methods in the interface are by default public
//The variables in the interface are by default public static final therefore it's a must to initialize them
//There can't be any other access modifiers other than public which can be assigned to the members of the interface

public interface IApp {
    int MAX_APPS=25;
    boolean isAppOpen(Application app);
    void openApp(Application app);
    void closeApp(Application app);
}
