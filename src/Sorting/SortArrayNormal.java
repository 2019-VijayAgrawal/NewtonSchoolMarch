package Sorting;

import java.util.Scanner;

public class SortArrayNormal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++)
        {
            int j = i;
            int current = a[i];
            while ((j > 0) && (a[j-1] > current))   //returns true when both conditions are true
            {
                a[j] = a[j-1];
                j--;
            }
            a[j] = current;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
