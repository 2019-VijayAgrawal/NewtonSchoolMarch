package Quene;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> dq = new LinkedList<>();
        dq.add(10);
        dq.add(20);
        dq.add(5);

        System.out.println(dq);
        dq.addFirst(21);
        System.out.println(dq);
        dq.addLast(22);
        System.out.println(dq);
        System.out.println("Size = "+dq.size());
        System.out.println(dq.remove());
        System.out.println(dq);
        System.out.println("First Remove "+dq.removeFirst());
        System.out.println(dq);
        System.out.println("Remove Last "+dq.removeLast());
        System.out.println(dq);
        dq.addLast(55);
        System.out.println(dq);
        dq.addFirst(60);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.contains(20));
        System.out.println(dq.pollFirst());
        dq.clear();
        System.out.println(dq);
    }
}
