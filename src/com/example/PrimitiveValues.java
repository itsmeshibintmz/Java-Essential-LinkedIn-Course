package com.example;

public class PrimitiveValues {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1;
        System.out.println(Byte.MAX_VALUE);
        b = 126;
        ++b;
        System.out.println(b);
        ++b;
        System.out.println(b);
        System.out.println(sh);
        sh = 32766;
        ++sh;
        System.out.println(sh);
        ++sh;
        System.out.println(sh);
        ++sh;
        System.out.println(sh);
        sh = 32767;
        System.out.println(sh);
        if(sh <= Short.MAX_VALUE) {
            ++sh;
            System.out.println(sh);
        }
        else {
            System.out.println("Overflow");
        }
    }
}
