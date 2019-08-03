package com.stackroute.keyEx;

public class LoopsEx {

    public void forLoop(int test){
        for(int i=1; i <= test; i++){
            System.out.println("Hello world"+i);
        }
    }

    public void whileLoop(int test){

        while(test == 0){
            System.out.println("Hello world");
            test--;
        }
    }

    public  void doWhileLoop(int test){
        do {
            System.out.println("Hello world");
            test--;
        }while (test == 0);
    }
}
