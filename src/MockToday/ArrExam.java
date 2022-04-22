package MockToday;

import java.util.Scanner;

public class ArrExam {
    public static void main(String[] args) {
        int[] arr1 = {2,3,-1,5,6,-7,9,4,-2,0};
        int[] arr2 = {2,1,8,9,-5,-4,6,0,3,5,7};
        int n1 =arr1.length;
        int n2 = arr2.length;
       // int low = 0;
       // int high = n1-1;
        quickSortt(arr1,0,n1-1);
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        quickSortt(arr2,0,n2-1);
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i]+" ");
        }
        int i = 0;
        int j  = 0;
        int k = 0;
        int[] merge = new int[n1+n2];
        while (i<n1 && j<n2){
            if (arr1[i] >= arr2[j]){
                merge[k] = arr1[i];
                i++;
            }
            else{
                merge[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            merge[k++] = arr1[i++];
        }
        while (j<n2){
            merge[k++] = arr2[j++];
        }
        System.out.println();
        for (int l = 0; l < (n1+n2); l++) {
            System.out.print(merge[l]+" ");
        }
        int x = 9;
        //hi

     //   binarySearch(merge,0,high,x);
    }
public static int binarySearch(int[] arr,int low,int high,int x){
        if (low<=high){
            int mid = low+(high-low)/2;
            //if (arr[mid] == )
        }
        return  0;
}
    private static void quickSortt(int[] arr, int low, int high) {
        if(low<high){
            int p = partitionnn(arr,low,high);
            quickSortt(arr,low,p-1);
            quickSortt(arr,p+1,high);
        }
    }
  //  saurav.anand90@gmail.com
// 10 20
    private static int partitionnn(int[] arr, int low, int high) {
        int pivot = arr[high];
        int j = low-1;
        for (int i = low; i < high; i++) {
            if (arr[i] > pivot){
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
}
