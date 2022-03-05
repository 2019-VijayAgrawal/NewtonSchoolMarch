package Strings;

import java.util.Scanner;

public class SumOfLargeTwoNumber {
    public static String addString(String str1,String str2){
        String res = "";
        int i = str1.length()-1;
        int j = str2.length()-1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0){
            int iVal = i >= 0 ? str1.charAt(i) - '0' : 0;
            int jVal = j >= 0 ? str2.charAt(j) - '0' : 0;
            i--;
            j--;
            int sum = iVal + jVal + carry;
            res = sum%10 + res;
            carry = sum/10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        //;
        System.out.println(addString(str1,str2));
    }
}
