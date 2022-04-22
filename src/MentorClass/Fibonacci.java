package MentorClass;

import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int n){
        int dp[] = new int[1000];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        if (dp[n] != -1){
            return dp[n];
        }
        dp[n] = fibonacci(n-1) + fibonacci(n-2);
      return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
