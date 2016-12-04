package com.mycompany.lessons;
import  java.util.*;
/**
 * Created by Василий on 29.11.2016.
 */




public class MyArray {
    private int[] Data = {7, 12, 67, 34, 20, 6, 4, 12};
    public int [] getData(){
        return Data;
    }
    public static void main(String[] args) {

        MyArray myData = new MyArray();




        System.out.println(Arrays.toString(myData.Data));


        System.out.println(myData.Data.length - 1);

        for (int barrier = 0; barrier < myData.Data.length - 1; barrier ++) {

        for (int i = myData.Data.length - 2; i >= barrier; i--) {
            if (myData.Data[i] > myData.Data[i + 1]) {
                swap(myData.Data, i);
            }
            System.out.print(i + " ");


        }
            System.out.println();

    }
            System.out.println(Arrays.toString(myData.Data));
        }




    private static void swap(int[] myData, int i) {
        int temp = myData [i];
        myData [i] = myData [i + 1];
        myData [i + 1] = temp;

    }
}
