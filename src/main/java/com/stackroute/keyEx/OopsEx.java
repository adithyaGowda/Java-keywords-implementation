package com.stackroute.keyEx;

//creating parent class
public class OopsEx {
    int x=20;
    public void test(){
        System.out.println("running super class method");
    }
}

//creating child class
class ChildEx extends OopsEx{

    public void print(){
        System.out.println("value of x: "+x);
        System.out.println("running child method");
        super.test();
    }

}

