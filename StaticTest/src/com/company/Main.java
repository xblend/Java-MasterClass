package com.company;

public class Main {

    public static void main(String[] args) {
	    StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number "+firstInstance.getPrivateNumberInstance());
        //System.out.println(firstInstance.getName() + " actually is instance number "+firstInstance.getStaticNumberInstance());
        System.out.println(firstInstance.getName() + " actually is instance number "+StaticTest.getStaticNumberInstance());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number "+secondInstance.getPrivateNumberInstance());
        //System.out.println(secondInstance.getName() + " actually is instance number "+firstInstance.getStaticNumberInstance());
        //As static members are shared by all the instances of the class
        // firstInstance.getStaticNumberInstance() equals secondInstance.getStaticNumberInstance()
        // This is a bad practice, so we'll set getStaticNumberInstance method as static
        System.out.println(firstInstance.getName() + " actually is instance number "+StaticTest.getStaticNumberInstance());

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number "+thirdInstance.getPrivateNumberInstance());
        System.out.println(thirdInstance.getName() + " actually is instance number "+StaticTest.getStaticNumberInstance());


        //Static methods cannot access non-static members or methods because non-static entities require an instance.
        //Non-static methods can access both static and non-static entities
    }
}
