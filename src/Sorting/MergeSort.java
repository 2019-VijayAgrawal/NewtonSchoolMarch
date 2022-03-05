package Sorting;

public class MergeSort {
    //1 2 3 4 5 6 7
    //l=0, r=6,m=3

    // 3,27,38,43        9,10,82  here k=3,i=low or 3,j=9 or mid+1
    //x,y.43,3 =>l=2,r=3
    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1; //size of First Array
        int n2 = r-mid;//size of Second Array

        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid+1+i];
        }

        int i=0; //pointer for first temporary array
        int j=0;//pointer for first temporary array
        int k=l;//pointer for  Actual array
        //Merging
        while (i<n1 && j<n2){
            if (L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;

            }
            k++;
        }
        while (i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
   public static void mergeSort(int[] arr,int l,int r){
       if (l<r){
           int mid = l+(r-l)/2;
           mergeSort(arr,l,mid);
           mergeSort(arr,mid+1,r);
           merge(arr,l,mid,r);
       }
   }

//count +=(left.length-i);

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n =arr.length;
        //mergeSort(arr,0, arr.length-1);

//
       // mergeS(arr,0,n-1,n);
       // System.out.println(mergeS(arr,0,n-1,n));
        mergeS(arr,0,n-1,n);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static int[] mergeS(int[] arr,int l,int r,int n){
        mergeSort(arr,l,r);

        return  arr;
    }
}
