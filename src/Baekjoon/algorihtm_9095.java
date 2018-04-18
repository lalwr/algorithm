package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/9095
public class algorihtm_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int result = 0;
        int dp[] = new int[11];
        int j = 0;

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i =0; i<cnt; i++){
            int num = Integer.parseInt(br.readLine());
                for(j =4; j <= num ; j++){
                    dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
                }
            System.out.println(dp[num]);
        }
    }
}
/*
풀이
1 : 1 -> 1개
2 : 1+1, 2 -> 2개
3 : 1+1+1, 2+1, 1+2, 3 -> 4개
4 : 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1 -> 7개
5 : 1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+2+1+1, 2+1+1+1, 2+2+1, 1+2+2, 2+1+2, 3+1+1, 1+3+1, 1+1+3, 3+2, 2+3 -> 13개
*/
