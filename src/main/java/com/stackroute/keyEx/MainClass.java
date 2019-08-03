package com.stackroute.keyEx;

public class MainClass {

    public static void main(String[] args) {
        //creating object of ConditionalStatementEx class
        ConditionalStatementEx ex = new ConditionalStatementEx();
        ex.ifElse(true);//calling ifElse method
        ex.ifElseIF(2);//calling ifElseIF method
        ex.nestedIfElse(1);//calling nestedIf method
        ex.switchEx(3);//calling switchEx method

        //creating object of LoopsEx class
        LoopsEx loopsEx = new LoopsEx();
        loopsEx.forLoop(5);//calling forLoop method
        loopsEx.whileLoop(5);//calling whileLoop method
        loopsEx.doWhileLoop(5);//calling doWhileLoop method

    }
}
