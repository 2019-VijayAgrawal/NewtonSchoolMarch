package MentorClass;

import java.util.Arrays;
import java.util.Scanner;

//    Write a function that takes in a non-empty array of distinct integers and an
//    integer representing a target sum. If any two numbers in the input array sum
//    up to the target sum, the function should return them in an array, in any
//    order. If no two numbers sum up to the target sum, the function should return
//    an empty array.
//
//    Note that the target sum has to be obtained by summing two different integers
//    in the array; you can't add a single integer to itself in order to obtain the
//    target sum.
//
//    You can assume that there will be at most one pair of numbers summing up to
//    the target sum.
//
//[INPUT]:
//    array = [3, 5, -4, 8, 11, 1, -1, 6]
//
//    targetSum = 10
//
//            [output]:
//            [-1, 11]

//Approch 1 - TC= O(n^2)
//Apporch2 - O(n)
//Approch 3- O(nlogn)
public class Practice {
public static void main(String[] args){
    int[] arr = {3,5,-4,8,11,1,-1,6};
     int targetSum = 25;
     findPairs(arr,targetSum);

}

    private static boolean findPairs(int[] arr, int targetSum) {
        Arrays.sort(arr);
        //{-4,-1,1,3,5,6,8,11}
    int l=0;
    int r= arr.length-1;
//log reading
    while (l<r){
        if (arr[l]+arr[r] == targetSum){
            System.out.print("["+arr[l]+","+arr[r]+"]");
            return true;
        }

        else if (arr[l]+arr[r]<targetSum){
            l++;
           //System.out.println();
            //System.out.print("l="+l);
        }
        else {
            r--;
           // System.out.println();
           // System.out.print("r="+r);
        }
    }
    return true;
    }
}

//10
//i=1,2,4,8,16,
//i=2^0,2^1,2^2,2^3,2^4.......2^k || 2^k<n || k = log(n)  TC=O(log(n))
//log2(n) = kLon2