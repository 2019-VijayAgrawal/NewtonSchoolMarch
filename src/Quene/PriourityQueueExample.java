package Quene;

import java.util.PriorityQueue;

public class PriourityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(15);
        pq.add(20);
        pq.add(5);
        pq.add(4);
        pq.remove();
        System.out.println(pq+"pq");
        System.out.println(pq.size());
        pq.remove(15);
        System.out.println("Poll "+pq.poll());
        System.out.println("Priourity Queue "+pq);
        System.out.println("Poll2 "+pq.poll());
        System.out.println(pq);


    }
}
