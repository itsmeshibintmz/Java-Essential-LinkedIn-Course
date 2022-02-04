package com.example;

public class BigDecimal {
    private final String strValue;

    public BigDecimal(String strValue) {
        this.strValue = strValue;
    }

    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        double value = 0.12;
        double pSum = value + value + value;
        System.out.println(pSum);
        String strValue = Double.toString(value);
        System.out.println(strValue);
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bSum);
    }

    private BigDecimal add(BigDecimal bigValue) {
        return new BigDecimal(strValue + bigValue.strValue);
    }
}
