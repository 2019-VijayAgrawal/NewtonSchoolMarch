//package MockDSA1Prepration;
//
//import java.util.Scanner;
//public class ComprationString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        sc.close();
//    }
//    //a a a b b c c c d d a e e f
//    public static String compration(String str){
//        String s = str.charAt(0)+"";
//
//        for (int i = 1; i < str.length(); i++) {
//            char current = str.charAt(i);
//            char previous = str.charAt(i-1);
//            int count =1;
//            if (current==previous){
//                count++;
//            }else {
//                s +=count;
//            }
//        }
//
//
//
