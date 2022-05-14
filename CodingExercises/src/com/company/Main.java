package com.company;

import java.util.Scanner;

public class Main {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0)
            return -1;
        long MilesPerHour = Math.round(1/1.609 * kilometersPerHour);
        return MilesPerHour;
    }
    public static void printConversion(double kilometersPerHour){
        long conversion = toMilesPerHour(kilometersPerHour);
        if(conversion==-1)
            System.out.println("invalid Value");
        else
            System.out.println(kilometersPerHour +  " km/h = "+ conversion+" mi/h");
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0) {
            System.out.println("Invalid Value");
            return;
        }
        int megabytes = kiloBytes/1024;
        int remainingKiloBytes = kiloBytes%1024;
        System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+remainingKiloBytes+" KB");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay){
        boolean shouldWake = false;
        if(hourOfTheDay<0 || hourOfTheDay>23);
        else if((hourOfTheDay<8 || hourOfTheDay>22) && barking)
            shouldWake = true;
        return shouldWake;
    }

    public static boolean isLeapYear(int Year){
        boolean isLeap = false;
        if(Year<=1 || Year>=9999);
        else if(Year%4==0)
            if(Year%100==0) {
                if (Year % 400 == 0)
                    isLeap = true;
            }
            else
                isLeap=true;
        return isLeap;
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int digit1 = (int)(num1*1000);
        int digit2 = (int)(num2*1000);
        boolean areSame = false;

        if(digit1==digit2)
            areSame = true;
        return areSame;
    }
    public static boolean hasEqualSum(int a , int b, int c){
        boolean isSame = false;
        if((a+b)==c)
            isSame=true;
        return isSame;
    }
    public static boolean isTeen(int age){
        if(age>=13 && age<=19)
            return true;
        return false;
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        if (isTeen(age1) || isTeen(age2) || isTeen(age3))
            return true;
        return false;
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0) {
            System.out.println("Invalid Value");
            return;
        }
        long hours = minutes/60;
        long days = hours/24;
        long years = days/365;
        long remainderDays = days%365;
        System.out.println(minutes+" min = "+years+" y and "+remainderDays+" d");
    }
    public static void printEqual(int a, int b, int c){
        if (a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
            return;
        }
        if(a==b && b==c)
            System.out.println("All numbers are equal");
        else if(a==b || b==c || a==c){
            System.out.println("Neither all are equal or different");
        }
        else
            System.out.println("All numbers are different");
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer && (temperature>=25 && temperature<=45) || !summer && (temperature>=25 && temperature<=35))
            return true;
        return false;
    }

    public static boolean isPalindrome(int number){
        boolean isPalindrome = false;
        int reverse = 0;
        int temp = number;
        while(temp!=0){
            reverse*=10;
            reverse+=temp%10;
            temp/=10;
        }
        if(reverse==number)
            isPalindrome=true;

        return isPalindrome;
    }

    public static int sumFirstAndLastDigit(int number){
        if(number<0)
            return -1;
        int sum=0;
        int digit=0;
        sum+=(number%10);
        while(number!=0){
            digit = number%10;
            number/=10;
        }
        sum+=digit;
        return sum;
    }

    public static int getEvenDigitSum(int number){
        if(number<0)
            return -1;
        int sum=0;
        int digit=0;
        while(number!=0){
            digit=number%10;
            if(digit%2==0)
                sum+=digit;
            number/=10;
        }

        return sum;
    }

    public static boolean hasSharedDigit(int a,int b){
        if(a<10 || a>99 || b<10 || b>99)
            return false;
        int digit=0;
        int temp=0;
        while(a!=0){
            digit=a%10;
            temp=b;
            while (temp!=0){
                if((temp%10)==digit)
                    return true;
                temp/=10;
            }
            a/=10;
        }
        return false;
    }
    public static boolean isValid(int n){
        if(n<10 || n>1000)
            return false;
        return true;
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) || isValid(b) || isValid(c))
            return false;
        a%=10;
        b%=10;
        c%=10;
        if(a==b || b==c || a==c)
            return true;
        return false;
    }

    public static int getGreatestCommonDivisor(int first,int second){
        if(first<10 || second<10)
            return -1;
        int min = first>second ? second : first;
        int max = first>second ? first : second;
        int greatestCommonDivisor = 0;
        for(int i=1;i<=min;i++){
            if(max%i==0 && min%i==0){
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }

    public static void printFactors(int number){
        if(number<1)
            System.out.println("Invalid Value");
        for(int i=1;i<=number;i++){
            if(number%i==0)
                System.out.println(i);
        }
    }

    public static boolean isPerfectNumber(int number){
        if(number<1)
            return false;
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0)
                sum+=i;
        }
        return sum==number ? true : false;
    }

    public static int reverse(int number){
        int reverse=0;
        while (number!=0){
            reverse*=10;
            reverse+=(number%10);
            number/=10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number<0)
            return -1;
        int count=0;
        if(number==0)
            return 1;
        while(number!=0){
            number/=10;
            count++;
        }
        return count;
    }

    public static void numberToWords(int number){
        if(number<0) {
            System.out.println("Invalid Value");
            return;
        }
        int reverse = reverse(number);
        int numberOfDigits = getDigitCount(number);
        int digit = 0;
        while (reverse!=0){
            digit = reverse%10;
            switch (digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
            }
            reverse/=10;
            numberOfDigits--;
        }
        while (numberOfDigits!=0) {
            System.out.println("Zero");
            numberOfDigits--;
        }
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(goal<0 || bigCount<0 || smallCount<0)
            return false;
        boolean canPack = false;
        int requiredBigCount = goal/5;
        if(requiredBigCount>bigCount){
            goal-=(bigCount*5);
        }
        else{
            goal-=(requiredBigCount*5);
        }
        if(goal<=smallCount)
            canPack=true;
        return canPack;
    }

    public static int getLargestPrime(int number){
        if(number<2)
            return -1;
        int largestPrime=0;
        int flag = -1;
        for(int i=2;i<=number;i++) {
            if (number % i == 0) {
                flag = -1;
                for (int j = 2; j <= Math.sqrt(i); j++)
                    if (number % j == 0) {
                        flag=0;
                        break;
                    }
                if(flag==-1)
                    largestPrime = i;
            }
        }

        return largestPrime;
    }
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
            return;
        }
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                if(i==j || j==number-i+1 || i==1 || i==number || j==1 || j==number)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void inputThenPrintSumAndAverage(){
        int sum=0;
        long average=0;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(!scanner.hasNextInt()){
                break;
            }
            sum+=scanner.nextInt();
            average=Math.round((double)sum/count);
            count+=1;
            scanner.nextLine();
        }
        System.out.println("SUM = "+sum+" AVG = "+average);
        scanner.close();
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBucket<0)
            return -1;
        double area = width*height;
        int bucket = (int)Math.ceil(area/areaPerBucket);
        if(extraBucket>=bucket)
            return 0;
        else
            return bucket-extraBucket;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0)
            return -1;
        double area = width*height;
        int bucket = (int)Math.ceil(area/areaPerBucket);
        return bucket;
    }
    public static int getBucketCount(double area,  double areaPerBucket){
        if(area<=0 || areaPerBucket<=0)
            return -1;
        int bucket = (int)Math.ceil(area/areaPerBucket);
        return bucket;
    }

    public static void main(String[] args) {
        //Test your code here
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(7.25,-4.3,2.35));
        System.out.println(getBucketCount(7.25,4.3,-2.35));
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,-2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,-1.5,2));
        System.out.println(getBucketCount(7.25,4.3,2.35,1));
        System.out.println(getBucketCount(7.25,4.3,2.35,-1));
        System.out.println(getBucketCount(3.4,1.5));
        System.out.println(getBucketCount(6.26,2.2));
        System.out.println(getBucketCount(3.26,0.75));
        System.out.println(getBucketCount(-3.26,0.75));
        System.out.println(getBucketCount(3.26,-0.75));

    }


}
