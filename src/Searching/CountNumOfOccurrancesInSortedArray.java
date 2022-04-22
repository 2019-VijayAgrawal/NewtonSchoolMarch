package Searching;

import ModifiersPractice.Main;

public class CountNumOfOccurrancesInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 2;
        System.out.println(countOccurnces(arr,n,x));
    }

    private static int countOccurnces(int[] arr, int n, int x) {
        int indx = binarySearchh(arr,0,n-1,x);
        int count = 1;
         if (indx == -1){
             return 0;
         }
         int left = indx - 1;
         while (left >= 0 && arr[left] == x){
             count++;
             left--;
         }
         int right = indx + 1;
         while (right < n && arr[right] == x){
             count++;
             right++;
         }
        return count;
    }

    private static int binarySearchh(int[] arr, int l, int r, int x) {
        if( l <= r){
            int mid = l + (r-l)/2;
            if (arr[mid] == x){
                return mid;
            }
            else if (arr[mid] > x){
              //  r = mid-1;
                return binarySearchh(arr,l,mid-1,x);
            }
            else {
               // l = mid + 1;
                return binarySearchh(arr,mid+1,r,x);
            }
        }
        return -1;
    }
}
