package MockPrepration.Mock2;

import static Sorting.QuickSort.partition;

public class QuickSortPrac {
     public static void quickSorts(int[] arr,int low,int high){
         if(low < high){
             int pi = partitionn(arr,low,high);
             quickSorts(arr,low,pi-1);
             quickSorts(arr,pi+1,high);
         }
     }

    private static int partitionn(int[] arr, int low, int high) {
         int pivot = arr[high];
         int j = low -1;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp2 = arr[j+1];
        arr[j+1] = arr[high];
        arr[high] = temp2;
        return j+1;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,8,5};
        int low = 0;
        int high = arr.length-1;
            quickSorts(arr,0,high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
