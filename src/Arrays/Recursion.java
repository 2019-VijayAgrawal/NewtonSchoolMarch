package Arrays;

public class Recursion {
    static void printarray(int[] arr, int index, int arrLen) {
        if (index >= arrLen) {
            //System.out.println(sum);
            return;
        }
        System.out.println(arr[index]);
        printarray(arr, index+1, arrLen);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 8};
        printarray(arr, 0, arr.length);

    }
}
