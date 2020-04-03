package com.example.demo.arrays;

import java.math.BigInteger;

public class PrimePractice {


    public int countPrimes(int n) {
        long beginTime = System.currentTimeMillis();
        if (n <= 1) {
            return 0;
        }
        int count = 0;

        for (int i = n; i > 0; i--) {
            int myCount = 0;
            for (int j = i; j > 0; j--) {

                if ((i % j) == 0) {
                    myCount++;
                }
            }

            if (myCount == 2) {
                count++;
            }
        }
        System.out.println("Total exec time countPrimes = " + (System.currentTimeMillis() - beginTime));
        return count;
    }

    public int countPrimesOptimized(int n) {
        long time = System.currentTimeMillis();

        int count = 0;
        if (n <= 1) {
            return count;
        }
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Total exec time countPrimesOptimized = " + (System.currentTimeMillis() - time));
        return count;
    }

    public boolean isPrime(int n) {
        BigInteger bigInteger = new BigInteger((String.valueOf(n)));
        return bigInteger.isProbablePrime(1);
    }

}
