package com.company;

public class Main {
    /*
    Float is a single precision data type to store real numbers.
    Double is a double precision data type to store real numbers.
    Float occupies 32bits
    Double occupies 64bits
    */
    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("float minimum value: "+myMinFloatValue);
        System.out.println("float maximum value: "+myMaxFloatValue);

	    double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("double minimum value: "+myMinDoubleValue);
        System.out.println("double maximum value: "+myMaxDoubleValue);

        int myIntValue = 5;
        /*
         float myFloatValue = 5.35; Throws an error saying required value is float but double is passed.
         This error doesn't occur when we send a whole number.
         Reason: In case of real numbers JAVA uses double by default,
         unless and until 'f' literal for float is appended
         //These are the correct ways to declare a float variable
         1. float myFloatValue = 5.35f;
         2. float myFloatValue = (float)5.35;

         double myDoubleValue = 5.35d;
        */
        float myFloatValue = 5f;//We get .0 append in the output
        double myDoubleValue = 5d;//We get .0 append in the output
        System.out.println("myIntValue="+myIntValue);
        System.out.println("myFloatValue="+myFloatValue);
        System.out.println("myDoubleValue=" + myDoubleValue);

        myIntValue = myIntValue / 2; //Takes the floor value
        myFloatValue = myFloatValue / 2f;
        myDoubleValue = myDoubleValue / 2d;
        System.out.println("\nValues of the variables after dividing by 2");
        System.out.println("myIntValue="+myIntValue);
        System.out.println("myFloatValue="+myFloatValue);
        System.out.println("myDoubleValue=" + myDoubleValue);

        //Setting the values of int, float and double variables back to 5
        myIntValue = 5;
        myFloatValue = 5f;//We get .0 append in the output
        myDoubleValue = 5d;//We get .0 append in the output
        System.out.println("\nSetting the values of int, float and double variables back to 5");
        System.out.println("myIntValue="+myIntValue);
        System.out.println("myFloatValue="+myFloatValue);
        System.out.println("myDoubleValue=" + myDoubleValue);

        myIntValue = myIntValue / 3; //Takes the floor value
        myFloatValue = myFloatValue / 3f;
        myDoubleValue = myDoubleValue / 3d;
        /*
        The precision value of float differs from double
        Output:
        myFloatValue=1.6666666
        myDoubleValue=1.6666666666666667
         */
        System.out.println("\nValues of the variables after dividing by 3");
        System.out.println("myIntValue="+myIntValue);
        System.out.println("myFloatValue="+myFloatValue);
        System.out.println("myDoubleValue=" + myDoubleValue);
        //We can also write like
        myDoubleValue = 5.00 / 3.00; //JAVA will assume it to be a double by default
        System.out.println("myDoubleValue=" + myDoubleValue);
        double valuePounds = 3.56;
        double valueKilograms = valuePounds*0.45359237;
        System.out.println(valuePounds+" pounds in kilograms="+valueKilograms+"kg");
        //For precise calculations float and double are not great for usage due to limitations in JAVA
        //For such precise calculations we'll use class named as BigDecimal

    }
}
