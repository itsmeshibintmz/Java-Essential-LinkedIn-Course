package com.example;

import java.sql.SQLOutput;

public class Main {
    public void mathClass() {
        int intValue1 = 56;
        int intValue2 = 42;
        int result1 = intValue1 + intValue2;
        System.out.println(result1);
        int result2 = intValue1 - intValue2;
        System.out.println(result2);
        int result3 = intValue1 * intValue2;
        System.out.println(result3);
        int result4 = intValue1 / intValue2;
        System.out.println(result4);
        double result5 = (double) intValue1 / (double) intValue2;
        System.out.println(result5);
        long rounded = Math.round(result5);
        System.out.println(rounded);
        int neg = -5;
        double absValue = Math.abs(neg);
        System.out.println(absValue);
    }
    public void booleanValues() {
        boolean b1 = true;
        boolean b2 = false;
        boolean reversed =!b2;
        System.out.println(reversed);
        reversed = !reversed;
        System.out.println(reversed);
        int i = 0;
        System.out.println(i);
        boolean b3 = (i!=0);
        System.out.println(b3);
        String s = "true";
        boolean b4 = Boolean.parseBoolean(s);
        System.out.println(b4);
        boolean b5 = Boolean.parseBoolean("xyz");
        System.out.println(b5);
    }
    public static void main(String[] args) {
        // Write your code here
        /* for (String s :
                args) {
            System.out.println(s);
        }
        */
        Main m = new Main();
        // m.mathClass();
        m.booleanValues();
    }
}