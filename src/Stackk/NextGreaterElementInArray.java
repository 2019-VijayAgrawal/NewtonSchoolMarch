package Stackk;

import java.util.Stack;

public class NextGreaterElementInArray {
        //         2 5 9  3   1  12 6  8  7
  // next greater  5 9 12 12  12 -1 8 -1 -1
    public static void main(String[] args) {
        int arr[] = {2,5,9,3,1,12,6,8,7};
         int nge[] = solve(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(nge[i] + " ");
        }
    }

    private static int[] solve(int[] arr) {
        int [] nge = new  int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0); // push 0 // a[0] element in stack that is 2
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]){
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
}
