package com.stackroute.keyEx;

public class ArraysEx {

    public void arrayEx(int[] input){

        int arr[] = new int[input.length];
        for (int i=0; i<arr.length; i++){
            arr[i] = input[i]+5;
            System.out.println("Array element incremented by 5: "+arr[i]);
        }
    }
}
