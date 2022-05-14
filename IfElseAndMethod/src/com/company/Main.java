package com.company;

public class Main {

    public static void main(String[] args) {
        int Score = 100;
        if (Score > 100) {
            int finalScore = 150;//Here the variable for initialized in the if code block
            System.out.println("finalScore = " + finalScore);
        }
        //finalScore = 100; This throws an error because the scope of finalScore was in the if code block
        //So, finalScore cannot be used outside the code block

        {
            int myScore = 100;
            String MyName = "Akshat";
            MyName+=" Ravi";
            System.out.println("My name is "+ MyName + "\nI have scored "+myScore);
        }
        //myScore = 70;
        //myName+=" Marathe";
        //Same here we cannot use myScore and MyName outside the code block

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + levelCompleted*bonus;
            System.out.println("Your final score was " + finalScore);
        }
        System.out.println("*******CHALLENGE********");
        /*
        Print the second output with
        score set to 10000
        levelCompleted set to 8
        bonus set to 200
         */
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            int finalScore = score + levelCompleted*bonus;
            System.out.println("Your final score was " + finalScore);
        }
        System.out.println("************************");
        score = 12000;
        levelCompleted = 9;
        bonus = 100;
        calculateScore(gameOver,score,levelCompleted,bonus);
        calculateScore(true,1000,7,300);

        int finalScore = returnCalculatedScore(!gameOver,score,levelCompleted,bonus);
        System.out.println("Value of finalScore is " + finalScore);

        finalScore = returnCalculatedScore(gameOver,score+1000,levelCompleted+1,bonus);
        System.out.println("Value of finalScore is " + finalScore);

        {
            System.out.println("********Challenge********");
            int rank = calculateHighScorePosition(1500);
            displayHighScorePosition("Akshat", rank);

            rank = calculateHighScorePosition(900);
            displayHighScorePosition("Rahul", rank);

            rank = calculateHighScorePosition(400);
            displayHighScorePosition("Santosh", rank);

            rank = calculateHighScorePosition(50);
            displayHighScorePosition("Jayant", rank);

            rank = calculateHighScorePosition(1000);
            displayHighScorePosition("Raja", rank);

            rank = calculateHighScorePosition(500);
            displayHighScorePosition("Dinesh", rank);

            rank = calculateHighScorePosition(100);
            displayHighScorePosition("Mohit", rank);
            System.out.println("************************");
        }

    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + levelCompleted*bonus;
            System.out.println("Your Final Score is "+finalScore);
        }
    }

    public static int returnCalculatedScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + levelCompleted*bonus;
            System.out.println("Your Final Score is "+finalScore);
            return finalScore;
        }
        return -1;
    }
    //Challenge
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+ " managed to get into position "+position+" on the high score table");
    }
    public static int calculateHighScorePosition(int score){
       /* Yeh hei aam zindagi
        if(score>=1000)
            return 1;
        else if(score>=500 && score<1000)
            return 2;
        else if(score>=100 && score<500)
            return 3;
        else
            return 4;
        */
        /* Yeh hei mentos zindagi

        if(score>=1000)
            return 1;
        else if(score>=500)
            return 2;
        else if(score>=100)
            return 3;
        return 4;
        */

        int position = 4;
        if(score>=1000)
            position = 1;
        else if(score>=500)
            position = 2;
        else if(score>=100)
            position = 3;
        return position;

    }
}
