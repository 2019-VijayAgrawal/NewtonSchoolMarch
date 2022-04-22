package Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class SubArrayProduct {
    public static void main(String[] args) {
        int a[] = {1 ,5, 2, 3, 6, 4};
        int k = 4;
        System.out.print(subArrayProduct(a,k));
    }

    private static int subArrayProduct(int[] a, int k) {
        Deque<Integer> dq = new LinkedList<>();
      //  dq.getFirst();

        int n = a.length;
        int pro = 1;
        int i = 0;
        for (; i < k; i++) {
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(;i < n;i++){
            pro = pro*a[dq.peekFirst()];
            while (!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        pro = pro*a[dq.peekFirst()];
        return pro;
    }
}
