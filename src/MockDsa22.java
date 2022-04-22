public class MockDsa22 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,9,1,10,15};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        bubbleSort(arr);
        int search = 4;
       int low = 0;
       int high = arr.length-1;
        System.out.println();
        System.out.println( binarySearchh(arr,low,high,search));
    }
   //

   // https://www.linkedin.com/in/codeplayer/


    private static int binarySearchh(int[] arr, int low, int high,  int search) {
        int mid = low +(high-low)/2;
        while (low <= high){

            if (arr[mid] == search){
                return mid;
            }
            else if(arr[mid] > search){
                high = mid-1;
               // return binarySearchh(arr,low,mid-1,search);
            }
            else {
                low = mid+1;
              //  return binarySearchh(arr,mid+1,high,search);
            }
        }
        return mid;
    }

    /*
     2 3 5 8 9 1 10 15
     first pass-
     2 3 5 8 9 1 10 15
     seconf pass

     */
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                   // System.out.print(arr[j]+" ");
                }
            }
          //  System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
