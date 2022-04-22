package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*
2 5 5 6 3 2 3 2 4 5 2 2 2 2 3 6
2 5 5 6 = 3
5 5 6 3 = 3
5 6 3 2 = 4
6 3 2 3 =  3
3 2 3 2 = 2
2 3 2 4 = 3
3 2 4 5 = 4
2 4 5 2 = 3
4 5 2 2 = 3
5 2 2 2 = 2
2 2 2 2 = 1
2 2 2 3 = 2
2 2 3 6 = 3


for i=0 to k-1;
for j=0,i = k-1 to
int k = 4
int i=0
 */
public class DistnictElemInWindowSizeK {
    private static ArrayList<Integer> solution(int[] arr, int k) {
       ArrayList<Integer> list = new ArrayList<>();
       HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = -1;
        while (i<k-1){
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
            i++;
        }
        //i = k-1
        while (i < arr.length){
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
            list.add(map.size());
            i++;
            //release
            j++;
            int freq = map.get(arr[j]);
            if (freq == 1){
                map.remove(arr[j]);
            }else {
                map.put(arr[j],freq-1);
            }
        }


        return list;
    }
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        int arrr[] = {2 ,5 ,5 ,6, 3, 2, 3 ,2 ,4 ,5 ,2 ,2 ,2 ,2 ,3, 6};
        int n = arrr.length;
        int k = 6;
        ArrayList<Integer> ans = solution(arrr,k);
        for(int a:ans){
            System.out.print(a+" ");
        }
    }


}
