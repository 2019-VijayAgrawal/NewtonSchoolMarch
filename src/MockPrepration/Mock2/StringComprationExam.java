package MockPrepration.Mock2;

import java.util.Scanner;

public class StringComprationExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ch = s.charAt(0) + "";

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)){
                ch = ch + s.charAt(i);
            }

        }
        System.out.println(ch);



    }
}
