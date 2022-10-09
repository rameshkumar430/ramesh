package com.ds.patterns;

import java.util.Scanner;

public class PatternTriangeINverted {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        pattern(row);
    }
    private static void pattern(int row) {


        for (int i = 1; i <= 4; i++)
        {

            for (int j = 1; j<= row - i; j++) { System.out.print("  "); } for (int k = i; k >= 1; k--)
        {
            System.out.print(k+" ");
        }
            for (int l = 2; l <= i; l++) {
                System.out.print(l+" "); }
            System.out.println(); }

    }

}



