package com.company;

public class Scope {
    private int varOne = 1;

    private int getVarOne() {
        return this.varOne;
    }

    public void multiply() {
        System.out.println("\nThis is using declared member varOne of Scope class");
        for (int i = 0; i < 11; i++)
            System.out.println(varOne + " times " + i + " equals " + varOne * i);
    }

    public void multiplyLocalVarOne() {
        int varOne = 2;
        System.out.println("\nThis is using locally declared variable varOne");
        for (int i = 0; i < 11; i++)
            System.out.println(varOne + " times " + i + " equals " + varOne * i);
    }
    public void multiplyInnerVar() {
        InnerClass innerClass = new InnerClass();
        System.out.println("\nThis is using declared member varOne of InnerClass (an inner class in Scope class) " +
                "\n accessed from outer class");
        for (int i = 0; i < 11; i++)
            System.out.println(innerClass.varOne + " times " + i + " equals " + innerClass.varOne * i);
    }

    public class InnerClass {
        private int varOne = 3;

        public void multiply() {
            System.out.println("\nThis is using declared member varOne of InnerClass (an inner class in Scope class)");
            for (int i = 0; i < 11; i++)
                System.out.println(varOne + " times " + i + " equals " + varOne * i);
        }

        public void multiplyOuterVar() {
            Scope scope = new Scope();
            System.out.println("\nThis is using declared member varOne of Scope class from inner class");
            for (int i = 0; i < 11; i++)
                //Inner class can access the private members of its outer class
                System.out.println(scope.varOne + " times " + i + " equals " + scope.varOne * i);
        }
    }
}
