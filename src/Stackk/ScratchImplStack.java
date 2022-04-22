package Stackk;
public class ScratchImplStack {
// Array implementation of stack

    //   [ , , , , , , , , , ]   top =-1  cap=10
    //                      t
    int[] arr;
    int top;
    int capacity;

    ScratchImplStack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        System.out.println("Inserting the element");
        top=top+1;
        arr[top]=x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        System.out.println("Removing the element");
        int topElement=arr[top];
        top--;
        return topElement;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top+1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        ScratchImplStack stack=new ScratchImplStack(10);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        stack.push(5);
        stack.push(6);

        System.out.println(stack.size());

        System.out.println(stack.isEmpty());
    }



}