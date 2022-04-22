package JavaCollection;

import java.util.LinkedList;
import java.util.Queue;

public class QueneExample {
    public static void main(String[] args) {
        Queue<Integer> queue  = new LinkedList<>();
        //Add Element
        queue.offer(5);
        queue.offer(10);
        queue.offer(15);
        queue.offer(20);
        System.out.println(queue);
        //delete First Entered element
        //queue.poll();
        System.out.println(queue.poll());
        //NextDelete Element
        System.out.println(queue.peek());
    }
}
