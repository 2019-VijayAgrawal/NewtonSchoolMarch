package Stackk;

import java.util.Arrays;
import java.util.Stack;

public class stackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("c");
        stack.push("a");
        stack.push("b");

        Arrays.sort(new Stack[]{stack});
        System.out.println(stack);
    }
}
