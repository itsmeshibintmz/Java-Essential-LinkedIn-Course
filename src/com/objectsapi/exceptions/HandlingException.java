package com.objectsapi.exceptions;

public class HandlingException {
    public static void main(String[] args) {
        String welcome = "Welcome";
        char[] chars = welcome.toCharArray();
        char lastChar = chars[chars.length - 1];
        System.out.println("Last char:" + lastChar);
    }
}