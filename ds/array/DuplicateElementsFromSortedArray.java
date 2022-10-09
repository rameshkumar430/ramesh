package com.ds.array;

import java.util.Scanner;

public class DuplicateElementsFromSortedArray {
    public static int[] removeDuplicateElements(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];

        return temp;

    }
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array (num) :: ");
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] result =removeDuplicateElements(arr);

        for(int i=0; i< result.length; i++){
            System.out.print(result[i]+" ");

    }
        //printing array elements
    }

}
