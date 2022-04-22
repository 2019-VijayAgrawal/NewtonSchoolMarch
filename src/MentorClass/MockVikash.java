package MentorClass;

public class MockVikash {
    // three largest number from array
    public static void main(String[] args) {
      //  int[] arr = {141,1,17,-7,-17,-27,18,541,8,7,7};
        int[] arr = {641,1,17,-7,-17,-27,18,541,8,7,7};
        int n = arr.length;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        System.out.println(arr[n-3]+" "+arr[n-2]+" "+ arr[n-1]);

        int[] arr2 = {141,1,17,-7,-17,-27,18,541,8,7,7};
        int n2 = arr2.length;

    }
}
