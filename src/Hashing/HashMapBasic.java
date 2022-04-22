package Hashing;

import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        int[] arr = {2,2,4,3,5,4};
        hashmap(arr);
    }

    private static void hashmap(int[] arr) {
     //Creation Of Hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer n = map.get(arr[i]);  // arr[i] how many times present in map
           // System.out.println(n);
            if (map.get(arr[i]) == null){ //a[i] is not present in map
                 map.put(arr[i], 1);
            }
            else {              //a[i] is already present in map
                 map.put(arr[i],++n );
            }
        }
        System.out.println(map);
    }
}
