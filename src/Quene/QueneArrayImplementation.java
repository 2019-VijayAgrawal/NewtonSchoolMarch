package Quene;

import java.util.Queue;

public class QueneArrayImplementation {
    static class Queue{
       static int[] arr;
       static int size;

       static int rear = -1;
       //front already -1
       Queue(int n){
           arr = new int[n];
           this.size = n;
       }
       public static boolean isEmpty(){
           return rear == -1;
       }
       public static void enqueue(int data){
           if (rear == size-1){
               System.out.println("Queue is full");
           }
           rear++;
           arr[rear] = data;
       }

       public static int dequeue(){
           if (isEmpty()){
               return -1;
           }
           int front = arr[0];
           for (int i = 0; i < size; i++) {
               arr[i] = arr[i+1];
           }
           rear--;
           return front;
       }
       public static void front(){
           if (isEmpty()){
               System.out.println("Queue is Empty");
           }
           System.out.println(arr[0]);
       }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(10);

     }
}
