package com.objectsapi.exceptions;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            String welcome = "Welcome";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length - 1];
            System.out.println("Last char:" + lastChar);

//          String nothing = null;
//          System.out.println(nothing.length()); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of exceptions");
            e.printStackTrace();
            return;
/*         } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            e.printStackTrace();
            return;
*/
        } catch (Exception e) {
            System.out.println("Any exception");
        }

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Code ran success");
    }

    public static void doSomething() throws InterruptedException {
        Thread.sleep(1000);
    }
}