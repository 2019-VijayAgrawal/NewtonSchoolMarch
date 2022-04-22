public class MockTest94 {
    public static void main(String[] args) {
        int arr[] = {-1, -1, 5, 45, 67};
        int k = 34;
        //find out snaller element than k
        /*
        output = 3
        O(n) time
        array is sorted
         */
        int left = 0;
        int right = arr.length-1;
        int search = k;

        System.out.println(binarySerach(arr,left,right,k));
      //  binarySerach(arr,left,right,search);
    }

    private static int binarySerach(int[] arr, int left, int right, int k) {
        int count = 0;
       while (left <= right){
           int mid = left + (right-left)/2;
           if (arr[mid] < k){
               count = mid + 1;
               left = mid+1;
           }
           else {
               right = mid -1;
           }
       }
      return count;
    }
}
