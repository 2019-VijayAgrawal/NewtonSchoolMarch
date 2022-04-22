package Sorting;

public class BubbleSortExam {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
               // System.out.print(arr[j]+" ");
            }
          // System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
