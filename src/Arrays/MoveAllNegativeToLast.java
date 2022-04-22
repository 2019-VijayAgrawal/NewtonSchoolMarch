package Arrays;

import java.util.ArrayList;

/*
Given an unsorted array of both negative and positive integer.
The task is place all negative element at the end of array
without changing the order of positive element and negative element
Input : arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 1  3  2  11  6  -1  -7  -5

 */
public class MoveAllNegativeToLast {
    public static void main(String[] args) {
       int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> postv = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                list.add(arr[i]);
            }
            else {
                postv.add(arr[i] );
            }
        }
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            postv.add(list.get(k));
            k++;
        }
           for(int ans:postv){
               System.out.print(ans+" ");
           }
    }
}
