package MockDSA1Prepration;

public class ArrayMinAndMax {
    public static void main(String[] args) {
        int[] arr = {2,1,3,8,5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.println(max);
        System.out.println(min);
    }
}
