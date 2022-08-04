package com.company;

import java.util.ArrayList;

public class Series {
    public static int nSum(int n){
        return  n*(n+1)/2;
    }

    public static int factorial(int n){
        if(n<=1)
            return 1;
        return(n*factorial(n-1));
    }

    public static int fibonacci(int n) {
        ArrayList<Integer> fibArray = new ArrayList<Integer>();
        fibArray.add(0);
        fibArray.add(1);
        if(n<fibArray.size())
            return fibArray.get(n-1);
        else
            for(int index=2;index<n;index++){
                fibArray.add(fibArray.get(index-1)+fibArray.get(index-2));
            }
            return fibArray.get(n-1);
    }

}
