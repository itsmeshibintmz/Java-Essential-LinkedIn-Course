package com.objectsapi.exceptions;

public class HandlingException {
    public static void main(String[] args) {
        try {
            String welcome = "Welcome";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length];
            System.out.println("Last char:" + lastChar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Code ran success");
    }
}