package Assignment.SlidingWindow;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

    // don't change the name of this class
// you can add inner classes if needed
/*
Maximum of all subarrays of size K
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.


Problem asked in Amazon, Flipkart.
Input
The first line of each test case contains a single integer N denoting the size of array and the size of subarray K. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Constraints:
1 ≤ N ≤ 10^5
1 ≤ K ≤ N
0 ≤ A[i] <= 10^5
Output
Print the maximum for every subarray of size K.
Example
Sample Input:
9 3
1 2 3 1 4 5 2 3 6

Sample Output:
3 3 4 5 5 5 6

Explanation:
Starting from the first subarray of size k = 3, we have 3 as maximum. Moving the window forward, maximum element are as 3, 4, 5, 5, 5 and 6.
 */
    public class MaxmOfAllSubArrayOfSizeK {
        static int[] maximumSubArr(int[] arr,int k){
            Deque<Integer> dq = new LinkedList<>();
            int n = arr.length;
            int[] ans = new int[n-k+1];
            int i = 0;
            for(;i < k;i++){
                while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                    dq.removeLast();
                }
                dq.addLast(i);
            }
            for(;i<n;i++){
                ans[i-k]  = arr[dq.peekFirst()];
                while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
                    dq.removeFirst();
                }
                while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                    dq.removeLast();
                }
                dq.addLast(i);
            }
            ans[i-k]  = arr[dq.peekFirst()];
            return ans;
        }
        public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int ans[] =	  maximumSubArr(a,k);
            for(int x:ans){
                System.out.print(x+" ");
            }

        }
    }
