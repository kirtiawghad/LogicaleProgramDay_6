package com.bl;

public class CouponNumber {
    public static void main(String[] args) {

        char[] chars1="abcdfghijklmmopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max = 100000000;
        int random = (int)(Math.random()*max);
        StringBuffer sr = new StringBuffer();

        while (random > 0){
            sr.append(chars1[random % chars1.length]);
            random = random / chars1.length;
        }

        String capecode = sr.toString();
        System.out.println("copon code" + " " + capecode);

    }
}