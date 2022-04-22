package MockHardLable;

public class MergeAndQuickSort {
    static void quickSort(int[] a,int low,int high){
        if(low < high){
            int pi = parttition(a,low,high);
            quickSort(a,low,pi-1);
            quickSort(a,pi+1,high);
        }
    }

    private static int parttition(int[] a, int low, int high) {
        int pivot = a[high];
        int j = low - 1;
        for (int i = low; i < high; i++) {
            if (a[i] < pivot){
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp2 = a[j+1];
        a[j+1] = a[high];
        a[high] = temp2;
        return j+1;
    }

    public static void main(String[] args) {
        int[] a = {3,5,7,8,9,10,12,1,6,-5,-8};
        int n = a.length;
        int low = 0;
        int high = a.length-1;
        mergeSortDivide(a,low,high);
        for (int l = 0; l < a.length; l++) {
            System.out.print(a[l]+" ");
        }
        System.out.println();
        quickSort(a,low,high);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
    }

    private static void mergeSortDivide(int[] a, int low, int high) {
        if (low < high){
            int mid = low+(high-low)/2;
            mergeSortDivide(a,low,mid);
            mergeSortDivide(a,mid+1,high);
            mergeConquer(a,low,mid,high);
        }
    }

    private static void mergeConquer(int[] a, int low, int mid, int high) {
        int n1 = mid-low+1;
        int n2 = high-mid;
        int L[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            L[i] = a[low+i];
        }
        int[] R = new int[n2];
        for (int j = 0; j < n2; j++) {
            R[j] = a[mid+1+j];
        }
        int i = 0;
        int j=0;
        int k = low;
        while (i<n1 && j<n2){
            if (L[i] < R[j]){
                a[k] = L[i];
                i++;
            }
            else{
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            a[k++] = L[i++];
        }
        while (j < n2){
            a[k++] = R[j++];
        }

    }
}
