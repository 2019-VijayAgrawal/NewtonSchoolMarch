package MockPrepration.Mock2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int search = 2;
       // binarySearch(arr,low,high,search);
        System.out.println(binarySearch(arr,low,high,search));
    }

    private static int binarySearch(int[] arr, int low, int high,int search) {

        if (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == search){
                return mid;
            }
            else if (arr[mid] > search){
                return binarySearch(arr,low,mid-1,search);
            }
            else{
                return binarySearch(arr,mid+1,high,search);
            }
        }
        return -1;
    }
}
