package com.company;

public class Main {

    public static void main(String[] args) {
	    printDayOfTheWeek(3);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(7);
        printDayOfTheWeekUsingIfElse(4);
        printDayOfTheWeekUsingIfElse(-1);
        printDayOfTheWeekUsingIfElse(7);
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(1900));
    }
    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
    public static void printDayOfTheWeekUsingIfElse(int day){
        if(day==0)
            System.out.println("Sunday");
        else if(day==1)
            System.out.println("Monday");
        else if(day==2)
            System.out.println("Tuesday");
        else if(day==3)
            System.out.println("Wednesday");
        else if(day==4)
            System.out.println("Thursday");
        else if(day==5)
            System.out.println("Friday");
        else if(day==6)
            System.out.println("Saturday");
        else
            System.out.println("Invalid Day");
    }
    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if(year<1 || year>9999)
            return false;
        if(year%4==0)
            if(year%100==0) {
                if (year % 400 == 0)
                    isLeap=true;
            }
            else
                isLeap=true;
            return isLeap;
    }
    public static int getDaysInMonth(int month, int year){
        int days = -1;
        if(month<1 || month>12)
            return days;
        if(year<1 || year>9999)
            return days;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days=31;
                break;
            case 2:
                if(isLeapYear(year))
                    days=29;
                else
                    days=28;
                break;
            case 4: case 6: case 9: case 11:
                days=30;


        }
        return days;
    }
}

