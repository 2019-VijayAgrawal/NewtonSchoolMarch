package Arrays;

public class FindElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr1.length;
        int key = 9;
        System.out.println("Index of the element is : " + pivotedBinarySearch(arr1, n, key));
    }

    private static int pivotedBinarySearch(int[] arr, int n, int key) {
        int low = 0;
        int high = n-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key){
                return mid;
            }
            else if (arr[low] <= arr[mid]){
                if (key >= arr[low] && key < arr[mid] ){
                    high = mid - 1;
                }
                else {
                    low = mid+1;
                }
            }
            else if (arr[mid] <= arr[high] ){
                if (key > arr[mid] && key <= arr[high]){
                    low = mid+1;
                }
                else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}
