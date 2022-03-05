package Assignment.Array2DMaths;

import java.util.Scanner;

public class RoateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }

        for (int i = 0; i < n; i++) {
        int l = 0;
        int r = n-1;
        while (l<r){
            int temp = arr[i][l];
            arr[i][l] = arr[i][r];
            arr[i][r] = temp;
            l++;
            r--;
        }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
