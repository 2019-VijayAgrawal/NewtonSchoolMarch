package MockPrepration.Mock2;

import java.util.Scanner;

public class AddNumString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
       // addnumString(num1,num2);
        System.out.println(addnum(num1,num2));

    }

    private static String addnum(String num1, String num2) {
        String res = "";
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0){
            int iVal = i >= 0 ? num1.charAt(i) - '0' : 0;
            int jVal = j >= 0 ? num2.charAt(j) - '0' : 0;
            i--;
            j--;
            int sum = iVal + jVal + carry;
            res = sum % 10 + res;
            carry = sum / 10;
        }
        return res;
//        int i = num1.length()-1; //last element
//        int j = num2.length()-1; // last element of num2
//        int carry = 0;
//        String res = "";
//        while (i>=0 || j>=0 || carry!=0){
//            int iVal = i>=0 ? num1.charAt(i)-'0' : 0;
//            int jVal = j>=0 ? num2.charAt(j)+'0' : 0;
//            i--;
//            j--;
//            int sum = iVal + jVal + carry;
//            res = res + (sum%10);
//            carry = sum/10;
//
//        }
//        return  res;
    }
}
