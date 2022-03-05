package Sorting;
import java.util.Scanner;
public class QuickSort {
    public static void swapArr(int a,int b ){
        int temp = a;
        a=b;
        b= temp;
    }
    static void quickSort(int[] arr,int low,int high){
        if (low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p);
            quickSort(arr,p+1,high);
        }
    }
    public static int  partition(int[] arr,int low,int high){
     int pivot = arr[high];
      int j=(low-1);
      for(int i=low;i<high;i++){
          if (arr[i]<=pivot){
              j++;
              int temp = arr[j];
              arr[j] = arr[i];
              arr[i]  = temp;
          }

          //10 80 30 90 40 50 70
          //i=0 --> 10 80 30 90 40 50 70 j++,j=0
          //i=1-->10 30 80 90 40 50 70  j++,j=1
          //i=2--> 10 30 80 90 40 50 70    j=1
          //i=3--> 10 30 80 90 40 50 70    j=1
          //i=4 -->40<70 true -->j++ or j=2 a[j] or a[2] = 80 swap(80,a[4])--> 10 30 40 90 80 50 70
          //i=5 -->50<70 true --> j++ or j=3 ,a[j]=90 swap(90,50) --> 10 30 40 50 80 90 70
          //loop end
          //a[j+1] ==a[3+1] = 80 swap(80,70) -->10 30 40 50 70 90 80
      }
        int temp = arr[j+1];
        arr[j+1] = arr[high];
        arr[high] = temp;
           return j+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }
          quickSort(arr,0,n-1);
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
