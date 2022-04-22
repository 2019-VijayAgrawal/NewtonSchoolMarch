package Quene;

import java.util.PriorityQueue;

public class FindKthLargest {
    public static void main(String[] args) {
        int[] arr = {30,40,50,60,10,20,5};
        int k = 3;
        System.out.println(findKthLargestElem(arr,k));
    }

    private static int findKthLargestElem(int[] arr, int k) {
        //Creating min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if (k > arr.length){
            return -1;
        }
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
