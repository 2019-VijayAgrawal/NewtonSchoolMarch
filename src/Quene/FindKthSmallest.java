package Quene;

import java.util.PriorityQueue;

public class FindKthSmallest {
    public static void main(String[] args) {
        int[] arr = {30,40,50,60,10,20,5,6};
        int k = 3;
        System.out.println(findKthSmaalest(arr,k));
    }

    private static int findKthSmaalest(int[] arr, int k) {
        // create max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (pq.peek() > arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
