package MockInterview;

import java.util.Set;
import java.util.TreeSet;

public class MockDSA2Medium {
    /*
    Assignment/AAA_DSA_Mock_Inter,view_Questions/DSA-2/Dev_Mittal_DSA2_Asked_Question.txt
    1. Find the number of elements smaller than a given number in a sorted array.
    2. Write a class for linked list and create a sample linked list using O(n) time

     */
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(8);
        treeSet.add(5);
       // System.out.println(treeSet);

      int arr[] = { 2 ,4 ,7,9,12,15 };
      int k = 10;
    //  findNumberOfElemSmaller(arr,k);
        System.out.println(findNumberOfElemSmaller(arr,k));
    }

    private static int findNumberOfElemSmaller(int[] arr, int k) {
           int low = 0;
           int high = arr.length-1;
           int ans = 0;
           while (low <= high){
               int mid = low + (high-low)/2;

               if (arr[mid] <  k){
                   low = mid+1;
                   ans = mid+1;
               }
               else {
                   high = mid -1;
               }
           }
          return ans;
    }
}
