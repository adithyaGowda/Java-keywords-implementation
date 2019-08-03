package com.stackroute.keyEx;

public class ConditionalStatementEx {

    //method to validate if-else condition
    public void ifElse( boolean test) {
        if (test)
            System.out.println("printing true condition");

        else
            System.out.println("printing false condition");

    }

    //method to validate if-else if condition
    public void ifElseIF(int test){
        if (test == 1)
            System.out.println("printing if condition");
        else if(test == 2)
            System.out.println("printing else-if condition");
        else
            System.out.println("printing else condition");
    }

    //method to validate nested-if else condition
    public void nestedIfElse(int test){
        boolean flag = true;
        if(test == 1){
            if (flag){
                System.out.println("printing inner if condition"+flag);
            }
            else{
                System.out.println("printing inner if condition"+flag);
            }
        }
        else if (test == 2){
            if (flag){
                System.out.println("printing inner if condition"+flag);
            }
            else{
                System.out.println("printing inner if condition"+flag);
            }
        }
        else
            System.out.println("printing outer else condition");
    }

    //method to validate switch condition
    public void switchEx(int input){

        switch (input){
            case 1:
                System.out.println("case 1");
                break;

            case 2:
                System.out.println("case 2");
                break;

            default:
                System.out.println("default");

        }
    }
}
