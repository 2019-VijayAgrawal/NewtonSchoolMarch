package MockInterview;

import java.util.Stack;

public class mockStack {
    public static boolean balencedParenthesis(String s){
        //"({[]})"
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else if (ch == ')'){
                if (st.size() == 0 || st.peek() != '('){
                    return false;
                }
                else {
                    st.pop();
                }
            }
            else if (ch == '}' ){
                if (st.size() == 0 || st.peek() != '{'){
                    return false;
                }
                else {
                    st.pop();
                }
            }
            else if (ch == ']'){
                if (st.size() == 0 || st.peek() != '['){
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "({[]})";
        if (balencedParenthesis(s)){
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }

    }
}
