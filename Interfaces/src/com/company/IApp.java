package com.company;

//The methods in the interface are by default public
//The variables in the interface are by default public static final

public interface IApp {
    boolean isAppOpen(Application app);
    void openApp(Application app);
    void closeApp(Application app);
}
