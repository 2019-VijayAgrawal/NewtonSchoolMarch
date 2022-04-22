package MockInterview;
public class GameCircle {
    public static int findTheWinner(int n, int k) {
        int count = 0;
        //1 2 3 4 5
        // 1 3 4 5
        // 1 3 5
        // 3 5
        // 3
        for(int i = 1; i <= n;i++){
            for (int j = 1; j <= k; j++) {
                if (j == k){
                    j = j+1;

                }
                count = j;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n,k));
    }
}
