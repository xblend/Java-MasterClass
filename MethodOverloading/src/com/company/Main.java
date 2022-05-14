package com.company;

public class Main {
/*
Method overloading happens when we use same method name but change the number or type of the parameters
Only changing the return type of the number won't change the signature
It helps in achieving consistency
It improves code readability and re-usability
 */
    public static void main(String[] args) {
	// write your code here
        int score = 50;
        String player = "Akshat";
        System.out.println(calculateScore(player,score));
        System.out.println(calculateScore(score));
        calculateScore();
        calculateScore(player);
        System.out.println("********Challenge*********");
        System.out.println(calcFeetAndInchesToCentimeters(5,8));
        System.out.println(calcFeetAndInchesToCentimeters(70));
        System.out.println(calcFeetAndInchesToCentimeters(100.5));
        System.out.println(calcFeetAndInchesToCentimeters(-100.5));
        System.out.println(calcFeetAndInchesToCentimeters(-3,12));
        System.out.println(calcFeetAndInchesToCentimeters(3,13));
        System.out.println(calcFeetAndInchesToCentimeters(3,-0.5));
        System.out.println("**************************");
    }

    public static int calculateScore(String playerName, int score){
        System.out.println(playerName+" scored "+score+" points");
        return score*100;
    }
    //Method overloading
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+" points");
        return score*10;
    }
    public static int calculateScore(){
        System.out.println("Unnamed player scored unknown score");
        return 0;
    }

    /*
    public static void calculateScore(){
        System.out.println("Unnamed player scored unknown score");
    }
    This will throw an error since only changing the return type of the method won't change the signature of the method
     */
    public static void calculateScore(String playerName){
        System.out.println(playerName+ " scored unknown points");
    }

    //Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || (inches<0 || inches>12)){
            System.out.println("Invalid feet or inches value");
            return -1;
        }
        double cm = feet*12*2.54+inches*2.54;
        System.out.println(feet+" ft and "+inches+" inches equals "+cm+" cms");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0) {
            System.out.println("Invalid inches value");
            return -1;
        }
        int feetInt = (int)inches/12;
        double remainderInches = inches%12;
        System.out.println(inches+" inches equals "+feetInt+" ft and "+remainderInches+" inches");
        double cms = calcFeetAndInchesToCentimeters(feetInt,remainderInches);
        System.out.println(cms+" cms");
        return cms;

    }
}
