package Strings;

import java.util.Scanner;

public class Flames {
//    static String removeChar(StringBuffer str1,StringBuffer str2){
//        for (int i = 0; i < str1.length(); i++) {
//            for (int j = 0; j < str2.length(); j++) {
//                if (str1.charAt(i) == str2.charAt(j)){
//                    str1.deleteCharAt(i);
//                    str2.deleteCharAt(j);
//                }
//            }
//        }
//        return str1,str2;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str1 = new StringBuffer(sc.next());
        StringBuffer str2 = new StringBuffer(sc.next());
        for (int i = 0; i < str1.length(); i++) {
            char chi = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                char chj = str2.charAt(j);
                if (chi == chj){
                    str1.deleteCharAt(i);
                    str2.deleteCharAt(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        str1 = str1.append(str2);
        System.out.println( str1+" , "+str2);
       // System.out.println( str2);
    }
}
