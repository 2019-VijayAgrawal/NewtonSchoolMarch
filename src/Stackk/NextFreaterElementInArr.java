package Stackk;

import java.util.Stack;

public class NextFreaterElementInArr {
    //i/p- 2 5 9  3   1  12 6   8  7
    //o/p- 5 9 12 12  12 -1 8  -1  -1
    public static void main(String[] args) {
        int arr[] = {2,5,9,3,1,12,6,8,7};
        int n = arr.length;
     int ans[] =   findNextGreater(arr,n);
     for(int x : ans){
         System.out.print(x+" ");
     }
    }

    private static int[] findNextGreater(int[] arr, int n) {
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        nge[n-1]  = -1;
        for(int i = n-2; i >= 0; i--){
            while (st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if (st.size() == 0){
                nge[i] = -1;
            }else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
