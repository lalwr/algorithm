package Baekjoon;

import java.io.IOException;

// https://www.acmicpc.net/problem/4673
public class algorithm_4673 {
    public static void main(String [] args){
        final int size  = 10000;
        int arr[] = new int[size];
        int check[] = new int[size];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            check[i] = 0;
        }

        for (int i = 1; i < arr.length; i++) {
            int sum = 0;
            int value = arr[i];
            String v = String.valueOf(value);
            for (int j = 0; j < v.length(); j++) {
                sum += Integer.parseInt(v.substring(j, j + 1));
            }
            int c = value + sum;
            if (c < size) {
                check[c] = 1;
            }
        }

        for (int i = 1; i < check.length; i++) {
            int v = check[i];
            if (v != 1) {
                System.out.println(i);
            }
        }
    }

}
