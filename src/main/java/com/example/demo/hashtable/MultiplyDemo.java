package com.example.demo.hashtable;

import java.util.Arrays;

public class MultiplyDemo {

    public int[] product(int[] input) {
        int[] productA = new int[input.length];
        int[] productB = new int[input.length];
        productA[0] = 1;
        for (int index = 1; index < input.length; index++) {

            productA[index] = input[index - 1] * productA[index - 1];

        }
        // [ 2, 3, 4, 5]

        // [ 1, 2, 6, 24]
        productB[input.length - 1] = 1;
        for (int index = input.length - 2; index >= 0; index--) {

            productB[index] = input[index + 1] * productB[index + 1];

        }
        // [60,20,5,1 ]
        int[] answer = new int[input.length];
        System.out.println(Arrays.toString(productA));
        System.out.println(Arrays.toString(productB));
        for (int index = 0; index < input.length; index++) {
            answer[index] = productA[index] * productB[index];
        }
        return answer;
    }


    public int[] productOptimized(int[] input) {
        //[2,3,4,5]
        int len = input.length;
        int[] sum = new int[len];
        sum[0] = 1;
        for (int index = 1; index < input.length; index++) {

            sum[index] = input[index - 1];

        }

        int[] answer = new int[len];

        for (int index = len - 1; index <= 0; index--) {

            answer[index] = sum[index] * input[index];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MultiplyDemo().productOptimized(new int[]{2, 3, 4})));
    }

}
