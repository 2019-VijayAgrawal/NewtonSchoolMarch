package Assignment.SlidingWindow;
import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
/*
Subarray Product
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array, A of N integers. Find the product of maximum values for every subarray of size K. Print the answer modulo 1000000007.

A subarray is any contiguous sequence of elements in an array.
Input
First line contains two integers N and K, denoting the size of array and the size of subarray respectively.
Next line contains N integers denoting the elements of the array.

1 <= K <= N <= 1000000
1 <= A[i] <= 1000000
Output
Print a single integer denoting the product of maximums for every subarray of size K modulo 1000000007
Example
Sample Input 1:
6 4
1 5 2 3 6 4

Sample Output 1:
180

Explanation:
For subarray [1, 5, 2, 3], maximum = 5
For subarray [5, 2, 3, 6], maximum = 6
For subarray [2, 3, 6, 4], maximum = 6
Therefore, ans = 5*6*6 = 180
 */
public class SubArrayProduct  {
    public static void maxSubArrayProduct(long[]arr,int n , int k){
        Deque<Integer> dq= new LinkedList<>();
        long product = 1;
        long modulo = 1000000007;
        for(int i =0;i<k;i++){
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        product=(product*arr[dq.peekFirst()])%modulo;
        for(int i =k; i<n; i++){
            if(!dq.isEmpty() && dq.peekFirst()==i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            product=(product*arr[dq.peekFirst()])%modulo;
        }
        System.out.println(product);
    }
    public static void main (String[] args) throws IOException{
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        long [] arr = new long[n];
        for(int i =0; i<n; i++){
            arr[i]= Long.parseLong(br.readLine());
        }
        maxSubArrayProduct(arr,n,k);
        //System.out.print(subArrayProduct(arr,k));
    }
}