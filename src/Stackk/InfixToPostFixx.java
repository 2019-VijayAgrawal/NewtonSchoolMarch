package Stackk;

import java.util.Stack;

public class InfixToPostFixx {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.print(infrxToPostFix(exp));
    }
  public static int prec(char ch){
       switch (ch){
           case '+':
           case '_':
            return 1;
           case '*':
           case '/':
               return 2;
           case '^'   :
               return 3;

       }
       return -1;
  }
    private static String infrxToPostFix(String exp) {
        Stack<Character> st = new Stack<>();
        String res = new String("");
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)){
               res += st.push(c);
            }
            else if (c == '('){
              res +=  st.push(c);
            }
            else if (c == ')'){
                while (!st.isEmpty() && st.peek() != '('){
                  res +=  st.pop();
                  st.pop();
                }
                st.pop();
            }
            else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())){
                    res += st.pop();
                }
                 st.pop();
              //  st.push(c);
            }
        }
        while (!st.isEmpty()){
            if (st.peek() == '('){
                return "Invalid Exp";

            }
            res += st.pop();
        }
        return res;
    }
}
