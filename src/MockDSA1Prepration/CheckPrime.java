package MockDSA1Prepration;

import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int n){
        if (n<2){
            return false;
        }
        else if (n==2){
            return true;
        }
        else if (n%2==0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n) ; i+=2) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      // checkPrime(3);
        System.out.println(checkPrime(n));
    }
}
