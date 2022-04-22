package Assignment.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;
/*Print Squared Sorted Array
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an sorted array Arr[] of size N, containing both negative and positive integers, you need to print the squared sorted output.

Note Try using two pointer approach
Input
The first line of input contains T, denoting the number of test cases. Each testcase contains 2 lines. The first line contains N size of array. Second line contains elements of array separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10000
-10000 <= A[i] <= 10000

Sum of N over all testcases does not exceed 10^6
Output
For each test case you need to print the sorted squared output in new line
Example
Input:
1
5
-7 -2 3 4 6

Output:
4 9 16 36 49*/
public class PrintSquaredSortedArr {
    static int[] squaredSortedArr(int[] nums){
        int[] squar = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int index = nums.length - 1;
        while(i <= j){
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];
            if(val1 > val2){
                squar[index] = val1;
                i++;
            }
            else{
                squar[index] = val2;
                j--;
            }
            index--;
        }
        return squar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            int[] res = squaredSortedArr(nums);
            for(int i = 0; i < n; i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}
