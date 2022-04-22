package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class LengthLargestSubArrContiguousElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
/*
 9 2 7 5 6 23 24 22 23 19 17 16 18 39 0
    i=0    i=0,j=1    j=2
min= 9       2         2
max = 9      9         9


    i=  j      min     max      max -min     j-i      max-min = j-i
    0           9       9
         1       2      9           7         1-0      9-2   =  1-0 (false)
         2       2      9            7        2-0        7   =   2-0 f
         3       2      9             7        3-0       7    =   3   f
         4       2       23          21         4-0       21   =   4  f
         5        2       24          22         5         22   =   5  f
         6
         7


 */
    private static int solution(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int min = arr[i];
            HashSet<Integer> cd = new HashSet<>();
            cd.add(arr[i]);
            for (int j = i+1; j < arr.length; j++) {
                if (cd.contains(arr[j])){
                    break;
                }
                cd.add(arr[j]);
                min = Math.min(min,arr[j]);
                max = Math.max(max,arr[j]);
                if (max - min == j - i){
                     int len = j-i+1;
                     if (len > ans){
                         ans = len;
                     }
                }
            }
        }
        return 0;
    }
}
