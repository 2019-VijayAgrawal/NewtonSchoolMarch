package Assignment;

public class SortMergeAndQuick {
    static void quickSort(int[] arr,int low,int high){
        if (low<high){
            int p = partitionn(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

     static int partitionn(int[] arr, int low, int high) {
        int pivot = arr[high];
        int j = low-1;
        for (int i = low; i < high; i++) {
            if(arr[i] <= pivot){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int tempp = arr[j+1];
        arr[j+1] = arr[high];
        arr[high] = tempp;

        return j+1;
    }

    public static void main(String[] args) {
        int [] a = {3,2,1,8,5};
        int n = a.length;

        System.out.println("QuickSort");
        quickSort(a,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("mergeSort");
        mergeDevide(a,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    static void mergeDevide(int[] a,int l,int r){
        if(l<r){
            int m = l+(r-l)/2;
            mergeDevide(a,l,m);
            mergeDevide(a,m+1,r);
            mergeConquer(a,l,m,r);
        }
    }

    private static void mergeConquer(int[] a, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        for (int i = 0; i < n1; i++) {
            L[i] = a[l+i];
        }
        int[] R = new int[n2];
        for (int i = 0; i < n2; i++) {
            R[i] = a[m+1+i];
        }
        int i=0,j=0,k=l;
        while (i<n1 && j<n2){
            if (L[i] <= R[j]){
              a[k] = L[i];
              i++;
            }
            else{
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            a[k++] = L[i++];
        }
        while (j<n2){
            a[k++] = R[j++];
        }
    }
}
