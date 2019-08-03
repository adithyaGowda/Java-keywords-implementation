package com.stackroute.keyEx;

public class MainClass {

    public static void main(String[] args) {
        //creating object of ConditionalStatementEx class
//        ConditionalStatementEx ex = new ConditionalStatementEx();
//        ex.ifElse(true);
//        ex.ifElseIF(2);
//        ex.nestedIfElse(1);
//        ex.switchEx(3);

//        //creating object of LoopsEx class
//        LoopsEx loopsEx = new LoopsEx();
//        loopsEx.forLoop(5);
//        loopsEx.whileLoop(1);
//        loopsEx.doWhileLoop(0);

        //creatin object of ArrayEx class
//        ArraysEx arraysEx = new ArraysEx();
//        int[] arr = {1,2,3,4,5};
//        arraysEx.arrayEx(arr);

        //creating object of child class
//        ChildEx childEx = new ChildEx();
//        childEx.print();

        DemoClass demoClass = new DemoClass();
        demoClass.test();
        demoClass.print();
        demoClass.newMethod();

        OopsInterfaceEx interfaceEx = new DemoClass();
        interfaceEx.print();
        interfaceEx.test();

    }
}
