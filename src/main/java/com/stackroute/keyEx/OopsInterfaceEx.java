package com.stackroute.keyEx;

//creating an interface
public interface OopsInterfaceEx {

    public void test();
    public void print();
}

//a class implements interface
class DemoClass implements OopsInterfaceEx{
    @Override
    public void test() {
        System.out.println("giving implementation to test method");
    }

    @Override
    public void print() {
        System.out.println("giving implementation to print method");

    }

    //addingg new method to implementation
    public void newMethod(){
        System.out.println("adding new method to implmented class");
    }
}
