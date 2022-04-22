package Assignment.Hashing;
/*
Subarrays with equal 1s and 0s
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array arr[] of size N containing 0s and 1s only. The task is to count the subarrays having an equal number of 0s and 1s.
Input
The first line of the input contains an integer N denoting the size of the array and the second line contains N space-separated 0s and 1s.

Constraints:-
1 <= N <= 10^6
0 <= A[i] <= 1
Output
For each test case, print the count of required sub-arrays in new line.
Example
Sample Input
7
1 0 0 1 0 1 1

Sample Output
8

The index range for the 8 sub-arrays are:
(0, 1), (2, 3), (0, 3), (3, 4), (4, 5)
(2, 5), (0, 5), (1, 6)
*/
    import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

    // don't change the name of this class
// you can add inner classes if needed
    public class SubarrayEqual1n0 {
        public static void main(String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            //Jupitar Note
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(countSubarrays(arr, n));
        }
        private static long countSubarrays(int[] arr, int n) {
            long count = 0;

            HashMap<Long, Integer> map = new HashMap<>();
            map.put((long)0, 1);
            long sum = 0;
            for (int i = 0; i < n; i++) {

                if (arr[i] == 0) {
                    sum += -1;

                } else if(arr[i] == 1){
                    sum += 1;
                }
                if (map.containsKey(sum)) {
                    count += map.get(sum);
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
            return count;
        }
    }