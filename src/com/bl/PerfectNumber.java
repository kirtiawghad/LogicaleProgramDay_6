package com.bl;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num;
        int sum=0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i=1; i<num; i++){
            if (num % i == 0){
                sum = sum + i;
            }
        }

        if (num == sum){
            System.out.println("Perfect Number");
        }else {
            System.out.println("not Perfect num");
        }
    }
}
