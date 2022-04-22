package TwoPointersAssig;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        // Your code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 2 3 3 5 8
        System.out.print(maxprofitGain(arr,n));
    }

    private static int maxprofitGain(int[] arr,int n) {
        int profit = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                profit  += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }
}

