//Java Program to print the elements of an array

package com.bridgelabz.day6problems;

public class PrintArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Elements of given array");
        //Loop for print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
