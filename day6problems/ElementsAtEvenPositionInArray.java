//Java Program to print the elements of an array present on an even position
package com.bridgelabz.day6problems;

public class ElementsAtEvenPositionInArray {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50,60,70,80,90,100};

        //evenposition
        for (int i=0; i < array.length; i=i+2)
        {
            System.out.println("index: " + i +" " + "elements= "+array[i]);
        }
    }
}
