package Hashing;

import java.util.HashMap;

public class HashingExam2 {
    static void hashMao(int[] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {
            Integer n = hashMap.get(arr[i]);
            /* If this is first occurrence of element Insert the element */
            if (hashMap.get(arr[i]) == null)
            {
                hashMap.put(arr[i], 1);
            }
            /* If element is already present in hash map Increment the count of element by 1 */
            else
            {
                hashMap.put(arr[i], ++n);
            }
        }
        /* Display HashMap */
        System.out.println(hashMap);

    }
    public static void main(String[] args) {
        int[] arr = {3,3,5,1,2,8};
        hashMao(arr);
    }
}
