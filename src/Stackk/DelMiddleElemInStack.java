package Stackk;

import java.util.Stack;

public class DelMiddleElemInStack {
    public static void main(String[] args) {
        String s = "vijay";
        Stack<Character> st = new Stack<>();
      int mid =  s.length()/2;
        for (int i = 0; i < s.length(); i++) {
            if(i == mid){
                st.pop();
            }
            st.push(s.charAt(i));
        }
    }
}
