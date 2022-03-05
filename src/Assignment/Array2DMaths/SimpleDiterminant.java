package Assignment.Array2DMaths;

import java.util.Scanner;

public class SimpleDiterminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int mul = arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
        System.out.println(mul);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // System.out.println(arr[i][j]);
            }
        }
    }
}
