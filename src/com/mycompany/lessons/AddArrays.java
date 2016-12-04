package com.mycompany.lessons;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Василий on 01.12.2016.
 */
public class AddArrays {
    public static void main(String[] args) {
         int a [] = {};
        int b [] = {8, 20, 46, 46, 65, 97, 100};
        System.out.println("Array a: " + Arrays.toString(a) + "\nArray b: " + Arrays.toString(b));



        int [] result = new int [a.length + b.length];
        System.out.println("\nLength of new array \"result\" is " + result.length);
        if (a.length < 0){
            result = b;

        }
        if (b.length < 0){
            result = b ;
        }

        int aIndex = 0;
        int bIndex =0;

        while (aIndex + bIndex != result.length ){
            if (a[aIndex] < b[bIndex]){

                result [aIndex + bIndex] = a[aIndex++];
                if (aIndex > a.length - 1){
                    System.arraycopy(b, bIndex, result, aIndex + bIndex, b.length - bIndex);
                   break;
                }

            }
            else{
                result [aIndex + bIndex] = b[bIndex++];}
            if (bIndex > b.length - 1){
                System.arraycopy(a, aIndex, result, aIndex + bIndex, a.length - aIndex);
                break;
            }
        }

        System.out.println(Arrays.toString(result));


    }
}
