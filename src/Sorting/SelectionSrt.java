package Sorting;

public class SelectionSrt {
    public static void main(String[] args) {
        int[] arr = {10,40,30,20,50};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
