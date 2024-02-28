package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] myArray = readIntegers();
        System.out.printf("\n MyArray: %s", Arrays.toString(myArray));

        int min = findMin(myArray);

        System.out.printf("Min: %d \n", min);
    }

    private static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];

        for(int i=0; i<myArray.length; i++){
            System.out.println("Enter an integer");
            int myInt = scanner.nextInt();

            myArray[i] = myInt;

        }

        return myArray;

    }

    private static int findMin(int[] arr){
        int min = arr[0];
        for (int el: arr) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }
}

// Chal insts:
// Write readIntegers. takes comma delim num[], entered from console, then returns an array of those nums
// Write findMin that takes the array, then returns the min val from array

// Main: Call readIntegers  to get the array from user, then print these out, using a method from Arrays
// Then call findMin, passing the array from readInts
// Print min element
// Assume user only enters numbers