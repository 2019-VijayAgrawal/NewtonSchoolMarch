package Strings;

import java.util.Scanner;

public class StringArraylength2 {
    static String equalString(String str) {
       String s= str.charAt(0)+"";
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if (curr != prev){
                curr = prev;
                System.out.println(curr);
            }
            s +=curr;
            prev = curr;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i <n ; i++) {
            s[i] = sc.next();
        }
        String str = "";
        for (int i = 0; i < n; i++) {
            str += s[i];
        }
        //System.out.println(str+" -->v");
        System.out.println(equalString(str));
//        while (n-->0){
//            String[] strings = new String[2];
//            for (int i = 0; i <2 ; i++) {
//                strings[i] = sc.next();
//            }
//            for (int i = 0; i < 2; i++) {
//                System.out.println(strings[i]);
//            }
//        }
    }
}
