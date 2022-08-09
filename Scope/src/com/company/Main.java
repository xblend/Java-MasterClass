package com.company;

public class Main {

    public static void main(String[] args) {
	    Scope scope = new Scope();
        scope.multiply();
        scope.multiplyLocalVarOne();

        Scope.InnerClass innerClass = scope.new InnerClass();
        innerClass.multiply();
        innerClass.multiplyOuterVar();
        scope.multiplyInnerVar();
    }
}
