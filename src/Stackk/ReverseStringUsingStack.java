package Stackk;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String name = "vijay";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            st.push(ch);
        }
        String s = "";
        for (int i = 0; i < name.length(); i++) {
            char p = st.pop();
            s += p;
        }
        System.out.println(s);
    }
}
