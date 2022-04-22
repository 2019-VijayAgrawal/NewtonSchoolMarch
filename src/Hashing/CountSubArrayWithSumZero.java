package Hashing;

import java.util.HashMap;

public class CountSubArrayWithSumZero {
    public static void main(String[] args) {
        int[] arr = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
        System.out.println(countSubbArray(arr));
    }

    private static int countSubbArray(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int countSubArray = 0;
        int i = -1;
        int sum = 0;
        map.put(sum,i);
        while (i < arr.length-1){
            i++;
            sum = sum + arr[i];
            if (map.containsKey(sum) == false){
                map.put(sum,1);
            }else {
                countSubArray = countSubArray + map.get(sum);
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        return countSubArray;
    }
}
