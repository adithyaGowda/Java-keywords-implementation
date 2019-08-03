package com.stackroute.keyEx;

public class JavaBasics {

    int x,y;
    static int a,b;

    {
        x=20;
        y=30;
    }

    static {
        a=40;
        b=60;
    }

    public int arithmetic(){
        System.out.println("addition: "+(a+b));
        System.out.println("subtraction: "+(x-y));
        System.out.println("multiplication: "+(a*y));

        return (a+b);
    }
}
