package com.bridgelabz.day6problems;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2,8,6,4,7,3,9,1};

        System.out.println("The original array is: ");
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println("Reverse Array is: ");
        for (int i=arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
