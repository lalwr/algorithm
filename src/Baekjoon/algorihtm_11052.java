package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11052
public class algorihtm_11052 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int set[] = new int[n+1];
        int dp[] = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i <= n; i++){
            set[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i <= n; i++){
            for(int j=1; j <= i; j++){
                dp[i] = dp[i] > dp[i-j]+set[j] ? dp[i] : dp[i-j]+set[j];
            }
        }

        System.out.println(dp[n]);



    }
}