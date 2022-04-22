package Arrays;

import java.util.HashMap;

public class SubArrayGivenSumUsingSlidingWindow {
    public static void main(String[] args) {
       // SubarraySum arraysum = new SubarraySum();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
       // subArraySum(arr, n, sum);
        System.out.println();
        findSubArray(arr,n,sum);
    }
 private static void findSubArray(int[] arr,int n,int sum){
     HashMap<Integer,Integer> map= new HashMap<>();
     int start = 0;
     for (int i = 0; i <n ; i++) {
         if (map.containsKey(sum-arr[i])){
             start = map.get(sum-arr[i])+1;

             System.out.println(start+","+i);
             map.put(arr[i],start);
         }
        map.put(arr[i],i );
     }
 }
    private static void subArraySum(int[] arr, int n, int sum) {
        int start = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++) {

            currSum+=arr[i];
            while (currSum > sum && start < i){
                currSum = currSum - arr[start];
                start++;
            }
            if (currSum == sum){
                System.out.print(start+","+i);
                System.out.println();
                //break;
            }
        }
    }
}
