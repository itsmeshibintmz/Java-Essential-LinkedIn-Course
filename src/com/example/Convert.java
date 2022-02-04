package com.example;

public class Convert {
    public static void main(String[] args) {
        short sh = 100;
        int i = sh;
        System.out.println(i);
         // short sh2 = i;
        // java: incompatible types: possible lossy conversion from int to short
        short sh2 = (short) i;
        System.out.println(sh2);
        short sh3 = 3000;
        byte b1 = (byte) sh3;
        System.out.println(b1);
        double doubleValue = 3.9999999d;
        int intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}
