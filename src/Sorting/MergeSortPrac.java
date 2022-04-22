package Sorting;

public class MergeSortPrac {
    static void divide(int arr[],int l,int r){
         if (l<r){
            int mid = l+(r-l)/2;
            divide(arr,l,mid);
            divide(arr,mid+1,r);
            conquer(arr,l,mid,r);
        }

    }

    private static void conquer(int[] arr, int l, int mid, int r) {
        int index1 = l;
        int index2 = mid+1;
        int k=0;
        int mere[] = new int[r-l+1];
        while (index1 < mid+1 && index2 < r+1){
            if (arr[index1] <= arr[index2]){
                mere[k] = arr[index1];
                index1++;
            }
            else{
                mere[k] = arr[index2];
                index2++;
            }
            k++;
        }
        while (index1 < mid+1){
            mere[k++] = arr[index1++];
        }
        while (index2 < r+1){
            mere[k++] = arr[index2++];
        }
        for (int i = 0; i < mere.length; i++) {
            System.out.println(mere[i] +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,8,5};
        int l = 0;
        int r = arr.length-1;
        divide(arr,l,r);
        for (int i = 0; i < args.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
