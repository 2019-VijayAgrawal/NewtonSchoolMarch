package TwoPointersAssig;

import java.util.Arrays;

public class TwoPointerExam1 {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5};
        int target = 8;
        int l = 0;
        int r = arr.length-1;
        Arrays.sort(arr);
        while (l < r){
            if ((arr[l]+arr[r]) == target){
                System.out.println(arr[l]+ " , "+arr[r]);
                return;
            }
            else if ((arr[l]+arr[r]) < target){
                l++;
            }
            else if ((arr[l] + arr[r]) > target){
                r--;
            }
        }
    }
}
