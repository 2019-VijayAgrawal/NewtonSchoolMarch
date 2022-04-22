package MentorClass;

public class findthreeMinElement {
    public static void main(String[] args) {
        int[] arr = {141,1,17,-7,-17,-27,18,541,8,7,7};
        int n = arr.length;
        for (int i = 0; i < 3; i++) {
            for (int j = i+ 1; j < n-1; j++) {
               if (arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               }
            }
        }
        System.out.println(arr[2]+" "+arr[1]+" "+arr[0]);
    }
}
