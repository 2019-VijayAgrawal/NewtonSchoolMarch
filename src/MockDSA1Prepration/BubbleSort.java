package MockDSA1Prepration;

public class BubbleSort {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Vijay");

        StringBuilder stringBuilder = new StringBuilder();


        stringBuilder.append("Vijayk");
        System.out.println(stringBuilder.toString());

        System.out.println(stringBuffer.toString());

        int[] arr = {5 ,4 ,3 ,10, 6 ,7};
        // i=0 to n-1 -->outer loop
        //j=0 to n-1 -->inner loop
       //  4,5,3,10,6,7
        // 4,3,5,10,7
        // 4,3,5,10,7
        //4,3,5,10,7


       // second
        // i=1
        //j=0 -->
        //3,4,5,10,7
        //3,4,5,10,7
        //3,4,5,10,7
        //3,4,5,10.7
        //3,4,5,10,7

        //Third
        //i=2
        //j=0 to n-1



        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1; j++) {
               if (arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }

        }
        for (int j = 0; j < arr.length ; j++) {
            System.out.println(arr[j]);
        }
    }
}
