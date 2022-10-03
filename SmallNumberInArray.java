//Java Program to print the smallest element in an array
package com.bridgelabz.day6problems;

public class SmallNumberInArray {
    public static void main(String[] args) {
        int [] Numbers = {566,458,765,875,415,654,456,540,545,650};
        int smallNumber = Numbers[0];

        System.out.println("Numbers in the Array: ");
        for(int i=0; i < Numbers.length; i++ )
        {
            if(Numbers[i] < smallNumber)
            {
                smallNumber= Numbers[i];
            }
        }
        System.out.println("smallest Number in Array is= "+smallNumber);
    }
}
