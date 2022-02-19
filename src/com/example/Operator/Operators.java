package com.example.Operator;

public class Operators {
    public static void main(String[] args) {
        int intValue;
        intValue = 10;
        intValue++; // Increment by 1
        intValue--; // Decrement by 1
        intValue += 5;

        System.out.println(intValue++); // Postfix
        System.out.println(++intValue); // Prefix

        String s1 = "hello";
        String s2 = "hello";
        if (s1.equals(s2)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
    }
}
