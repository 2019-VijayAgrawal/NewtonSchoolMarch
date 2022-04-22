package mockEasy22;

import javax.swing.*;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s ="Vijay kumar agrahari";
        String s1 = "";
        for (int i = s.length()-1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        System.out.println(s1);
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (!Character.isWhitespace(s1.charAt(i))){
                s2 += s1.charAt(i);
            }
            else if (Character.isWhitespace(s1.charAt(i))){
               break;
            }
        }
        System.out.println(s2.length());
    }
}
