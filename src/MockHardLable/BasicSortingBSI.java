package MockHardLable;

public class BasicSortingBSI {
    public static void main(String[] args) {
        int[] a = {3,5,7,8,9,10,12,1,6,-5,-8};
        bubbleSort(a);
        System.out.println();
        selectionSort(a);
        System.out.println();
        insertionSort(a);
        int low = 0;
        int high = a.length-1;
        int search = 5;
       // binarSearch(a,low,high,search);
        System.out.println();
        System.out.println("Searcg founf at index ->"+binarSearch(a,low,high,search));
    }

    private static int binarSearch(int[] a, int low, int high, int search) {
        //int ans = 0;
        if (low <= high){
            int mid = low + (high-low)/2;
            if (a[mid] == search){
                return mid;
            }
            else if (a[mid] > search){
                return binarSearch(a,low,mid-1,search);
            }
            else{
                return binarSearch(a,mid+1,high,search);
            }
        }
        return -1;
    }

    private static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i-1;
            while (a[j] > a[i] && j>=0){
                a[j+1] =a[j];
                j--;
            }
            a[j+1] = a[i];
         }

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[i]){
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
         }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
