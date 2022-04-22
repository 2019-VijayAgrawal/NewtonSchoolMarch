package MentorClass;

class ThreeLargestNum {
    public static void main(String[] args) {
        int[] arr = {141,1,17,-7,17,-27,18,541,8,7,7};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (first<arr[i]){
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second){
                third = second;
                second = arr[i];
            }
            else if(arr[i]>third){
                third = arr[i];
            }
        }
        System.out.println(third+","+second+","+first);
    }
}
