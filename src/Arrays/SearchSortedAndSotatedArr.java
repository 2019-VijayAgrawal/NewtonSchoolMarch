package Arrays;

public class SearchSortedAndSotatedArr {
    public static void main(String[] args) {
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr1.length;
        int k = 1;
        System.out.println(binarySearch(arr1,n,k));
    }

    private static int binarySearch(int[] arr1, int n, int key) {
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (arr1[mid] == key){
                return mid;
            }
            else if (arr1[low] <= arr1[mid]){
                // left part sorted
                if (arr1[low] <= key && arr1[mid] > key){
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else {
               //right part sorted
               if (key > arr1[mid] && key <= arr1[high]){
                   low = mid + 1;
               }
               else {
                   high = mid -1;
               }
            }
        }
        return -1;
    }
}
