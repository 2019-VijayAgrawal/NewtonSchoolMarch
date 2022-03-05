public class DebuggerLearn {
    public static void main(String[] args) {
        int arr[] = {2,5,7,81};

        System.out.println(getSum(arr));

    }
    public static int getSum(int arr[]){
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
             sum +=  arr[i];
        }
        sum = sum+3;
        return sum;
    }
}
