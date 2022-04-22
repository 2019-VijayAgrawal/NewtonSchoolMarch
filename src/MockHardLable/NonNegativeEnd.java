package MockHardLable;

import java.util.ArrayList;

public class NonNegativeEnd {
    public static void main(String[] args) {
      //  Input :
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
       // Output : 1  3  2  11  6  -1  -7  -5
        int j = 1;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
         for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < 0){
                list.add(arr[i] );
            }
            else {
                list2.add(arr[i] );
                arr[i] = arr[i];
            }

        }

        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }
        for(int ans : list2){
            System.out.print(ans+" ");
        }
    }
}
