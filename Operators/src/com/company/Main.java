package com.company;

import javax.annotation.processing.SupportedSourceVersion;
import java.awt.geom.RectangularShape;

public class Main {

    public static void main(String[] args) {
	    int Result = 1+2;//1+2=3
        //The above whole line is called a statement
        /*
        Result is a variable
         = and + are operators
         = is an assignment operator
         + is an arithmetic operator
         1 and 2 are operands
         The listed above are the part of an expression
        */
        int PreviousResult = Result;
        System.out.println("1 + 2 = "+Result);
        Result = Result - 1; //3-1=2
        System.out.println("Result - 1 = "+Result);
        System.out.println("PreviousResult = "+PreviousResult);
        Result = Result * 10 / 5; // 2*10/5=4
        System.out.println("Result*10/5 = "+Result);
        //% modulus operator returns the remainder of the division of its left operand with the right operand.
        Result = Result%3;// 4%3=1
        System.out.println("Result%3 = "+Result);
        //Abbreviating Operators
        Result++; //Result = Result+1
        System.out.println("Result++ = "+Result);
        Result--; //Result = Result-1
        System.out.println("Result-- = "+Result);
        Result+=3; //Result = Result+3
        System.out.println("Result+=3 = "+Result);
        Result-=5; //Result = Result-5
        System.out.println("Result-=5 = "+Result);
        Result*=10; //Result = Result*10
        System.out.println("Result*=10 = "+Result);
        Result/=5; //Result = Result/5
        System.out.println("Result/=5 = "+Result);

        boolean isAlien = false;
        if(isAlien==false)
            System.out.println("It's an Alien!");
        //if(isAlien==true);//Still the line below is executed because the if is terminated here
        if(isAlien==true)
            System.out.println("It's an Alien!");//Without parenthesis the if block will take only the first line
        System.out.println("This line is going to get printed anyways because, \n" +
                "if statement without parenthesis only took first line after the condition");
        if(isAlien==true){
            System.out.println("It's an Alien");
            System.out.println("The above and the this line wont get printed");
        }
        int topScore = 100;
        System.out.println("topScore= " + topScore);
        if(topScore==100)
            System.out.println("You got the high score!");
        if(topScore!=100)
            System.out.println("This line won't print");
        if(topScore>=100)
            System.out.println("This line will print");
        if(topScore<100)
            System.out.println("This line won't print");
        int failMarks = 50;
        System.out.println("failMarks= " + failMarks);
        if(failMarks>=50 && topScore<=100)
            System.out.println("failMarks>=50 and topScore<=100");
        if(failMarks>50 || topScore<=100)
            System.out.println("failMarks>50 or topScore<=100");
        int avgMarks = 75;
        System.out.println("avgMarks= " + avgMarks);
        if((failMarks>50 || topScore<=100) && avgMarks == 75)
            System.out.println("(failMarks>50 or topScore<=100) and avgMarks == 75");
        /*
        & bitwise AND
        | bitwise OR
        && logical AND
        || logical OR
        = Assignment operator
        == Equal to conditional operator
        */
        int assignmentValue = 3;
        //if(assignmentValue=3) Throws an error since "if" condition works on boolean.
        // But we are using assignment operator which results in int object
        boolean isCar = true;
        if(isCar = false)
            //The above condition will change the value of isCar to false as assignment operator was used
            System.out.println("This is not supposed to happen");
        if(isCar == false) //This is correct could be written as if(!isCar)
            System.out.println("IsCar is false");
        if(isCar!=false) //could be written as if(isCar)
            System.out.println("IsCar is true");
        //Ternary operators work as a single line if-else statement
        boolean wasCar = isCar ? false : true;
        //Here wasCar would be assigned with value of false if isCar is true and true if isCar is false
        if(wasCar)
            System.out.println("wasCar was assigned true, as isCar is false");
        if(!wasCar)
            System.out.println("wasCar was assigned false, as isCar is true");
        isCar = true;
        System.out.println("isCar is true");
        wasCar = isCar ? false : true;
        //Here wasCar would be assigned with value of false if isCar is true and true if isCar is false
        if(wasCar)
            System.out.println("wasCar was assigned true, as isCar is false");
        if(!wasCar)
            System.out.println("wasCar was assigned false, as isCar is true");

        /*
        1. Create 2 double variables of value 20.00 and 80.00
        2. Add both numbers and then multiply it by 100.00
        3. Get the remainder of division of result in step 2 with 40.00
        4. Create a boolean variable to assign true if we don't get a remainder and false otherwise
        5. Print the value of boolean variable created in step 4.
        6. Use if-then to tell if we got remainder or not
        */
        System.out.println("***********Operator Challenge**************");
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        boolean isRemainderZero = (firstDouble+secondDouble)*100.00%40.00 == 0 ? true : false;
        System.out.println("isRemainderZero? "+isRemainderZero);
        if(isRemainderZero)
            System.out.println("Remainder is zero");
        else
            System.out.println("Got some remainder");//Whatever string we type to print is also an expression

    }
}
