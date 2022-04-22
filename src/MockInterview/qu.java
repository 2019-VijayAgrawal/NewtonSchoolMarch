package MockInterview;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class qu {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Front "+queue.poll());
        //queue.remove();
        System.out.println("Delete "+queue.remove());


        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.poll());
        int a = q.remove();
        System.out.println(a+" Delete");

    }
}
