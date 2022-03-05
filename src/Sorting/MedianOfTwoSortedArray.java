package Sorting;

import java.util.Scanner;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[n];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

    }
    public static void median(int[] A,int[] B,int n,int m){
        int[] merge = new int[m+n];
        for (int i = 0; i < (m+n); i++) {

        }
    }
}
