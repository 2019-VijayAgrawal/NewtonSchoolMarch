package MockInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class MockHard {
    public static void main(String[] args) {
        int arr[] = {2,5,6,-1,8,9,3,-7,-2,0};
        // o/ p - -2,0,2,6,8   5,-1,9,3,-7
        //-2,5,0,-1,2,9,3,-7,6,8
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        //TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0){
              list.add(arr[i]);
             // treeSet.add(arr[i]);
            }
        }
        Collections.sort(list);
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0){
                arr[i] = list.get(k);
                k++;
            }

        }
       for (int a : arr){
           System.out.print(a+" ");
       }

    }
}
