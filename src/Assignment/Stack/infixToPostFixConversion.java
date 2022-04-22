package Assignment.Stack;

import java.util.Stack;

public class infixToPostFixConversion {
    public static void main(String[] args) {

     String s =   " 2 1 + 3 *";
        System.out.println(convertPostFixToInfix(s));
    }
    private static Character convertPostFixToInfix(String s) {
        Stack<Character> oprand = new Stack<>();
        Stack<Integer> oprator = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(0);
            if (Character.isDigit(ch)){
                oprator.push(ch-'0');
            }

        }

        return null;
    }
    private static int opration(int v1,int v2,char ch){
        if (ch == '+'){
            return v1+v2;
        }
        else if (ch == '-'){
            return v1-v2;
        }
        else if (ch == '*'){
            return v1*v2;
        }
        else {
            return v1/v2;
        }
    }
}
