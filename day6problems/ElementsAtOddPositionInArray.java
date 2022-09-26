//Java Program to print the elements of an array present on odd position
package com.bridgelabz.day6problems;

public class ElementsAtOddPositionInArray {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50,60,70,80,90,100};

        //oddposition
        for (int i=1; i < array.length; i=i+2)
        {
            System.out.println("index: " + i +" " + "elements= "+array[i]);
        }
    }
}
