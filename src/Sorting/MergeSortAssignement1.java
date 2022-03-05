package Sorting;

public class MergeSortAssignement1 {
    public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
        // You can have your own function where you will use
        // start and end position for divide purpose
        if (start<end){
            int mid = start+(end-start)/2;
            implementMergeSort(arr,start,mid);
            implementMergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);

        }
        return arr;
    }
    static  int count =0;
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
                count +=(n1-i);
                j++;
            }

            k++;
            System.out.println(arr[k]+" j");
        }
        System.out.println("Count is "+count);
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
    public static void main(String[] args) {
        int arr[] = {1,1,3,2,2};
        int n =arr.length;
        implementMergeSort(arr,0, arr.length-1);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
