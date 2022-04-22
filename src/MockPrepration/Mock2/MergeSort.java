package MockPrepration.Mock2;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,1,8};
        int l = 0;
        int r = arr.length-1;
        System.out.println(arr.length-1);
        divideMerge(arr,l,r);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

    }
    public static void divideMerge(int arr[],int l,int r){

        if (l>=r){
            return;
        }
        int mid = l+(r-l)/2;
          divideMerge(arr,l,mid);
          divideMerge(arr,mid+1,r);
          conquerMerge(arr,l,mid,r);

    }

    // 1 2 3 4
    // 5 6 7 8
    public static void conquerMerge(int[] arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1 ; i++) {
            L[i] = arr[l+i];
        }
        for (int j = 0; j < n2 ; j++) {
            R[j] = arr[mid+1+j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k++] = L[i++];
        }
        while (j < n2){
            arr[k++] = R[j++];
        }
    }

}
