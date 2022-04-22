package Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int arr[] = {2,5,6,-1,8,9,3,-7,-2,0};
        int n = arr.length;
        int d = 2;
        rotateLeft(arr,2,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rightRotation(arr,d,n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
  static  void rotateLeft(int[] arr1,int d,int n){
      for (int i = 0; i < d; i++) {
          leftRotateArrayByOne(arr1,n);
      }
  }
    private static void leftRotateArrayByOne(int[] arr, int n) {
        int temp = arr[0];
        for (int j = 0; j < n-1; j++) {
            arr[j] = arr[j+1];
        }
        arr[n-1] = temp;
    }
    static void rightRotation(int[] arr,int d,int n){
        for (int i = 0; i < d; i++) {
            int tempp = arr[n-1];
            for (int j = 0; j < n-1; j++) {
             //  tempp = arr[n-1];
                arr[j] = arr[j+1];
            }
            arr[0] = tempp;
        }
    }
}
