package Baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11720
public class algorithm_11720 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String value = sc.next();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int v = Integer.parseInt(value.substring(i, i + 1));
            sum += v;
        }
        System.out.println(sum);
    }

}
