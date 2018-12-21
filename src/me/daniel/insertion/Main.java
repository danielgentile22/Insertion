package me.daniel.insertion;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(fibonacci(40));
        long end = System.currentTimeMillis();
        double timeS = (double) (end - start) / 1000;
        double timeM = timeS / 60;
        if (timeS < 60) {
            System.out.println("That took: " + timeS + " seconds!");
        } else if (timeS >= 60) {
            System.out.println("That took: " + timeM + " minutes!");
        }

        long start1 = System.currentTimeMillis();
        System.out.println(factorial(BigInteger.valueOf(10000)));
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static BigInteger factorial(BigInteger m) {
        if (m.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return m.multiply(factorial(m.subtract(BigInteger.ONE)));
        }
    }
}
