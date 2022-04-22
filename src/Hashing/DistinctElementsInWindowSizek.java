package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctElementsInWindowSizek {
    static ArrayList solution(int[] arr,int k){
   ArrayList<Integer> arrayList = new ArrayList<>();
   HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < k-1; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }
        for (int j = 0,i = k-1; i < arr.length;){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 ); // Aquire
            arrayList.add(map.size());
            //release
            int freq = map.get(arr[j]);
            if (freq == 1){
                map.remove(arr[j]);
            }else {
                map.put(arr[j],freq-1);
            }
            i++;
            j++;
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,5,6,3,2,3,2,4,5,2,2,2,2,5,6};
        int k = 4;
        ArrayList<Integer> ans = solution(arr,k);
        for (int a : ans){
            System.out.print(a+" ");
        }
    }
}
