package com.ds.array;

import java.util.Scanner;

public class FirstNTerms {
    public static void main(String[] args)
    {


        Scanner s = new Scanner(System.in);

        System.out.println("Enter the nth value of the series");
        int n=s.nextInt();

        for(int i = 1; i<=n; i++)
        {
            System.out.print(i*i*i + " ");
        }
    }
}
