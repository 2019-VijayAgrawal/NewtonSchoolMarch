package Hashing;

import java.util.HashMap;

public class LengthLongestSubArrayWithSumK {
    public static void main(String[] args) {
      //  int[] arr = {10 ,5, 2, 7, 1, 9};
        int[] arr = {-5 ,8 ,-14 ,2 ,4 ,12};
        int k = -5;
        lengthOfLongSubArrSumK(arr,k);
    }

    private static void lengthOfLongSubArrSumK(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = -1;
        int sum = 0;
        int targetSum = 0;
        int maxLen = 0;
        map.put(sum,i);
        while (i < arr.length-1){
            i++;
            sum = sum + arr[i];
            targetSum = sum-k;
            if (map.containsKey(targetSum)){
                int jIdx = map.get(targetSum);
                int len = i - jIdx;
                if(len > maxLen){
                    maxLen = len;
                }
               map.put(sum,map.getOrDefault(sum,0)+1);

            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);
    }
}
