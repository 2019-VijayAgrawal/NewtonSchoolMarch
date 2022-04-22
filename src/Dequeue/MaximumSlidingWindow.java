package Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {4,3,1,2,5,3,4,7,1,9};
        int a[] = {1 ,2, 3 ,1 ,4 ,5 ,2, 3 ,6};
/*
k = 4
1-> 4 3 1 2 ->1>2 so --> 4 3 2 --> maxm
 */
        int k = 3;
        int ans[] = solution(a,k);
        for (int x:ans) {
            System.out.println(x+" ");
        }
    }

    private static int[] solution(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> dq = new LinkedList<>();
        int ans[]  = new  int[n-k+1];
        int i = 0;
        for(; i<k; i++){
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (; i < n; i++) {
            ans[i-k] = arr[dq.peekFirst()];
            while (!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[i-k] = arr[dq.peekFirst()];
        return ans;
    }
}