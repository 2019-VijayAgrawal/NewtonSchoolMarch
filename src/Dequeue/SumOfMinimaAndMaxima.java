package Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class SumOfMinimaAndMaxima {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 ,4 ,5};
        int k = 3;
        System.out.print(SumOfMinMax(arr,k));
    }

    private static int SumOfMinMax(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        Deque<Integer> smallest = new LinkedList<>();
        Deque<Integer> max = new LinkedList<>();
        int i = 0;
        for(; i < k;i++){
            while(!smallest.isEmpty() && arr[smallest.peekLast()] >= arr[i]){
                smallest.removeLast();
            }
            while(!max.isEmpty() && arr[max.peekLast()] <= arr[i]){
                max.removeLast();
            }
            smallest.addLast(i);
            max.addLast(i);
        }
        for(; i < n; i++){
            sum += arr[smallest.peekFirst()] + arr[max.peekFirst()];


        while(!smallest.isEmpty() && smallest.peekFirst() <= i-k){
            smallest.removeFirst();
        }
        while(!max.isEmpty() && max.peekFirst() <= i-k){
            max.removeFirst();
        }
        while(!smallest.isEmpty() && arr[smallest.peekLast()] >= arr[i]){
            smallest.removeLast();
        }
        while(!max.isEmpty() && arr[max.peekLast()] <= arr[i]){
            max.removeLast();
        }
        smallest.addLast(i);
        max.addLast(i);
    }
    sum += arr[smallest.peekFirst()] + arr[max.peekFirst()];
		return sum;
    }
}
