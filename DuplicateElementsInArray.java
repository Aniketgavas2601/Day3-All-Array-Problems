// Java Program to print the duplicate elements of an array
package com.bridgelabz.day6problems;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int duplicate[] = {1,8,9,6,8,6,7,6,4,9};

        System.out.println("Duplicate elements ia Array is: ");

        for(int i = 0; i < duplicate.length; i++) {
            for(int j = i + 1; j < duplicate.length; j++) {
                if(duplicate[i] == duplicate[j])
                    System.out.println(duplicate[j]);
            }
        }
    }
}
