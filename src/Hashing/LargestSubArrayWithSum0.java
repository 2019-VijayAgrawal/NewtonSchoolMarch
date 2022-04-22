package Hashing;

import java.util.HashMap;

public class LargestSubArrayWithSum0 {
    public static void main(String[] args) {
        int[] arr = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
       // int sum = 0;
        largestSubArraySum(arr);
    }

    private static void largestSubArraySum(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = -1;
        int sum = 0;
        map.put(sum,i);
        while (i < arr.length-1){
            i++;
            sum += arr[i];
            if (map.containsKey(sum) == false){
                map.put(sum,i);
            }
            else{
                int jindex = map.get(sum); // vo wala sum kis index pr aaya tha
                int len = i - jindex;
                if (maxLen < len){
                    maxLen = len;
                }
            }
        }
        System.out.println(maxLen);

    }
}
