package com.bl;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int num, a=0,b=1,c;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i=1; i<=num; i++){
            System.out.println(a + " ");
            c = a+b;
            a = b;
            b = c;

        }

    }
}
