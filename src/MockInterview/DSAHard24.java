package MockInterview;

import java.util.HashMap;

/*
Given an array of integer and target, return the pair of indexes which element sum is like target
and time complexity should be at max O(Nlog(N))
Example:
input:[ 3,7,1,4,8,2] , target : 9
output:[ 2,4] or [1,5]
 */
public class DSAHard24 {
    public static void main(String[] args) {
        //int[] arr = {3,7,1,4,8,2};
        int[] arr = {8,1,4,3,2,1};
        int n = arr.length;;
        int sum = 7;
        findPairs(arr,n,sum);
    }

    private static void findPairs(int[] arr, int n, int sum) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int currSum = 0;
       int start = 0;
       int end = -1;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum - sum == 0){
                start = 0;
                end = i;
                System.out.println(start+","+end);
                break;
            }
            if (map.containsKey(currSum - sum)){
                start = map.get(currSum-sum)+1;
                end = i;
                System.out.println(start+","+end);
                break;
            }
            map.put(currSum,i);
        }

    }
}
