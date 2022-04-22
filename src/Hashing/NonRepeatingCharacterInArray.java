package Hashing;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacterInArray {
    public static void main(String[] args) {
        int[] arr = {9,4,9,6,7,4,};
        int n = arr.length;
        findnonReapting(arr,n);
    }

    private static void findnonReapting(int[] arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
       for (Map.Entry<Integer,Integer> entry : map.entrySet()){
           if (entry.getValue() == 1){
               System.out.print(entry.getKey());
           }
       }
    }
}
