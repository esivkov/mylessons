package com.mycompany.lessons;


import java.util.Arrays;

/**
 * Created by Василий on 30.11.2016.
 */
public class MyArrayChange {
    public static void main(String[] args) {
       int [] arr = {12, 67, 46,  20, 45, 26};
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length / 2; i++){
            swap (arr, i);
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int i) {
        int temp = arr [i];
        arr [i] = arr [arr.length - 1 - i];
        arr [arr.length -1 - i] = temp;
    }
}
// переписать отражение: цикл идет от середины к началу