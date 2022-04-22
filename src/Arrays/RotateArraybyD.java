package Arrays;

public class RotateArraybyD {
    public static void main(String[] args) {
        int arr[] = {2,5,6,-1,8,9,3,-7,-2,0};
        int n = arr.length;
        int d = 1;;
        rotateByD(arr,d);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void rotateByD(int[] arr,int d){
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr);
            rightRoateByOne(arr);
        }
    }

    public static void leftRotateByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
    public static void rightRoateByOne(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n-1; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
