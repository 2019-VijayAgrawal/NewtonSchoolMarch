package JavaCollection;

import java.util.Stack;

// Stack is FIFO,First In First Out from stack memory
public class StackLearn {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Horse");
        System.out.print(" Stack is --> "+animals);
        System.out.println();
        //Peak element means top element in stack
        animals.peek();
        System.out.println(" Top Element --> "+animals.peek());
        //Delete top element
        animals.pop();
        System.out.println(animals);
    }
}
