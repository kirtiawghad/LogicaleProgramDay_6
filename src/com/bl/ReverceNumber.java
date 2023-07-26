package com.bl;

import java.util.Scanner;

public class ReverceNumber {
    public static void main(String[] args) {
        int num,reminder,reverce=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (; num!=0; num/=10){
            reminder = num % 10;
            reverce = reverce * 10 + reminder;

        }

        System.out.println(reverce);
    }
}
