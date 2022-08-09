package com.company;

public class Scope {
    private int varOne = 1;

    private int getVarOne(){
        return this.varOne;
    }
    public void multiply(){
        System.out.println("This is using declared member varOne of Scope class");
        for (int i=0;i<111;i++)
            System.out.println(varOne+" times "+i+" equals "+varOne*i);
    }
    public void multiplyLocalVarOne(){
        int varOne = 2;
        System.out.println("This is using locally declared variable varOne");
        for(int i=0;i<11;i++)
            System.out.println(varOne+" times "+i+" equals "+varOne*i);
    }
    public class InnerClass{
        private int varOne = 3;
    }


}
