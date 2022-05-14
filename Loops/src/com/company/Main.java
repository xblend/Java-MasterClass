package com.company;

public class Main {

    public static void main(String[] args) {
        double amount = 10000;
	    for(int i=2;i<9;i++)
            System.out.println(amount+" at "+i+"% of interest is "+calculateInterest(amount,i));
        System.out.println("*************************************************");
        for(int i=8;i>1;i--)
            System.out.println(amount+" at "+i+"% of interest is "+calculateInterest(amount,i));
        System.out.println("********************Challenge********************");
        System.out.println("Print first 3 prime numbers in the given range");
        int primeCount = 0;
        int a = 21,b = 100;
        System.out.println("First 3 prime numbers between "+a+" and "+b+" are:");
        for (int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.println(i);
                primeCount++;
            }
            if(primeCount==3)
                break;
        }
        System.out.println("********************Challenge********************");
        System.out.println("Print first 5 numbers between 1 and 1000 inclusive that are divisible by 3 and 5");
        System.out.println("Print the sum of those 5 numbers");
        long sum=0;
        int count=0;
        for (int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" is divisible by 3 and 5");
                sum+=i;
                count++;
            }
            if(count==5) {
                System.out.println("Sum of first 5 numbers which are divisible by 3 and 5 is "+sum);
                break;
            }
        }
        System.out.println("************While Loop***************");
        int Number = 4;
        int finalNumber = 22;
        while(Number<=finalNumber){
            Number+=1;
            if(!isEvenNumber(Number))
                continue;
            System.out.println("Even number: "+Number );

        }
        System.out.println("************While Loop Challenge***************");
        Number = 8;
        finalNumber = 100;
        count = 0;
        while(Number<=finalNumber){
            Number+=1;
            if(!isEvenNumber(Number))
                continue;
            System.out.println("Even number: "+Number );
            count+=1;
            if(count==5)
                break;
        }
        System.out.println("Total number of even numbers found = "+count);
    }
    public static double calculateInterest(double amount,double interestRate){
        return (amount * interestRate/100);
    }
    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2;i<=(long)Math.sqrt(n);i++) //(long)Math.sqrt(n) is much more optimized way than n/2
            if(n%i==0)
                return false;
        return true;
    }

    public static boolean isOdd(int n){
         if(n<0)
             return false;
        if(n%2!=0)
            return true;
        return false;
    }
    public static int sumOdd(int start,int end){
        int sum=0;
        if(start>end || end<0 || start<0)
            return -1;
        for (int i=start;i<=end;i++)
            if(isOdd(i))
                sum+=i;
        return sum;
    }
    public static boolean isEvenNumber(int number){
        if((number%2)==0)
            return true;
        return false;
    }
}
