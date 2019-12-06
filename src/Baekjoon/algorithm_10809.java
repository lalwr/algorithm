package Baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10809
public class algorithm_10809 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        for (char i = 97; i <= 122; i++) {
            String str = String.valueOf(i);
            System.out.print(text.indexOf(str) + " ");
        }
    }

}
