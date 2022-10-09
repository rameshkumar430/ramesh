package com.ds.patterns;

import java.util.Scanner;

public class PatternBasedOnNoOfLines {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int space = 1,n;
                n=scan.nextInt();
        pattern(n);
    }
    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
