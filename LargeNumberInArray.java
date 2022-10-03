//Java Program to print the largest element in an array
package com.bridgelabz.day6problems;

public class LargeNumberInArray {
    public static void main(String[] args) {
        int [] Numbers = {5,68,23,89,34,74,45,99,103,569,234,654,456,132};
        int maxNumber = Numbers[0];                                             //Maximum Number stored in this Variable

        System.out.println("Numbers in the Array: ");
        for(int i=0; i < Numbers.length; i++){
            if(Numbers[i] > maxNumber)
            {
                maxNumber = Numbers[i];
            }
        }

        System.out.println("Largest Number in Array is= "+maxNumber);
    }
}
