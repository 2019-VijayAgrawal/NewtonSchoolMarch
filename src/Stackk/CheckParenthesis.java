package Stackk;

import java.util.Stack;

public class CheckParenthesis {
    public static void main(String[] args) {
        String s = "([{}])";
        if (balneced(s)){
            System.out.println("Balanced Parenthesis");
        }else {
            System.out.println("Not Balanced Paranthesis");
        }
    }

    private static boolean balneced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if (ch == ')'){
                if (st.size() == 0){
                    return false;
                }else if (st.peek() != '('){
                    return false;
                }else {
                    st.pop();
                }
            }
            else if (ch == '}'){
                if (st.isEmpty()){
                    return false;
                }
                else if (st.peek() != '{'){
                    return false;
                }
                else {
                    st.pop();
                }
            }
            else if (ch == ']'){
                if (st.size() == 0){
                    return false;
                }
                else if (st.peek() != '['){
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }
        return true;
    }
}
