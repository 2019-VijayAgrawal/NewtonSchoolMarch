public class Mock95 {
    //        6, 6, 3, 3, 1, -1
//
//        O(n) time
    public static void main(String[] args) {
        int input[] = {7, 5, 6, 2, 3, 1};
        findMaxArr(input);

    }

    private static void findMaxArr(int[] input) {
        int n = input.length;
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int i = 0;
         int k = n-2;
            int j = n-1;
            //7, 5, 6, 2, 3, 1
            while (j > 0){
                max = Math.max(max,input[j]);
                j--;
                arr[k] = max;
                System.out.println(max);
                k--;
;            }
        arr[n-1] = -1;
        System.out.println();
        for (int x = 0; x < n; x++) {
            System.out.print(arr[x]+" ");
        }
       //System.out.println(max);
    }
}
