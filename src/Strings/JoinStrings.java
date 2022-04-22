package Strings;

import java.util.Scanner;

public class JoinStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  byte t = sc.nextByte();
        String str = sc.next();
        String str2 = sc.next();
        String s = str + str2;
        System.out.println(s.substring(1,3));

        String ss = "abs";
        StringBuilder sb = new StringBuilder("");
        sb.append("a");

    }
}
