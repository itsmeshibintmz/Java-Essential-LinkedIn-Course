package com.example;
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
    }
    public static void main(String[] args) {
        // Write your code here
        /* for (String s :
                args) {
            System.out.println(s);
        }
        */
        Main m = new Main();
        m.mathClass();
    }
}