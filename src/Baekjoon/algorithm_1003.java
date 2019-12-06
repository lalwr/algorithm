package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1003
public class algorithm_1003 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] dp = new int[41][2];
        dp[0][0] = 1;
        dp[1][1] = 1;


        for (int i = 0 ; i < T ; i++)
        {
            fibonacci(dp, Integer.parseInt(br.readLine()));

        }
    }


    public static void  fibonacci(int[][] dp, int n)
    {
        if(n >= 2){
            for(int i=2; i<= n; i++){
                dp[i][0] = dp[i-1][0] + dp[i-2][0];
                dp[i][1] = dp[i-1][1] + dp[i-2][1];
            }
        }
        System.out.println(dp[n][0] + " " + dp[n][1]);
    }
}
