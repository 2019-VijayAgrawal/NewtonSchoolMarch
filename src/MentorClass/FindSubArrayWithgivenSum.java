package MentorClass;

public class FindSubArrayWithgivenSum {
    public static void main(String[] args) {
        int[] a = {1,4,20,3,10,5};
        int target = 33;
        int sum = 0;
        int left = 0;
        int right = 0;
        while (left < right){
            sum += a[right];
                if(sum == target){
                    System.out.println(left+" , "+right);
                }
                else if (sum < target){
                    right++;
                }
                else {
                    left++;
                }

        }

    }
}
