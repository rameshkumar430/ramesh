package com.ds.patterns;

import java.util.Scanner;

public class PatternTriange {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        pattern(row);
    }
    private static void pattern(int row) {


        for (int i = row; i >= 1; i--)
        {

            for (int j = 0; j<= row - i; j++) { System.out.print("  "); } for (int k = i; k >= 1; k--)
        {
            System.out.print(k+" ");
        }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l+ " ");
            }

            System.out.println();
        }

    }
}



