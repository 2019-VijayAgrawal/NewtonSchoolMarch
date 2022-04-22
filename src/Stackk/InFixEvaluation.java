package Stackk;

import java.util.Stack;

public class InFixEvaluation {
    public static void main(String[] args) {
        String exp = "a*(b-c)/d+e";
        evaluation(exp);
    }

    private static void evaluation(String exp) {
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> oprators = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i) ;
            if (ch == '(') {
                oprators.push(ch);
            }
            else if (Character.isLetterOrDigit(ch)){
                prefix.push(ch+"");
                postfix.push(ch+"");
            }
            else if (ch == ')'){
                while (oprators.size() > 0 && oprators.peek() != '('){
                    char op = oprators.pop();
                    String postV2 = postfix.pop();
                    String postV1 = postfix.pop();

                    String postVres = postV1 + postV2 + op;
                    postfix.push(postVres);
                    String preV2 = prefix.pop();
                    String preV1 = prefix.pop();
                    String preVres = op + preV1 + preV2;
                    prefix.push(preVres);
                }
                oprators.pop();
            }
            else {
                while (oprators.size() > 0 && precdence(ch) <= precdence(oprators.peek())){
                    char op = oprators.pop();
                    String postV2 = postfix.pop();
                    String postV1 = postfix.pop();
                    String res = postV1 + postV2 + op;
                    postfix.push(res);

                    String preV2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String respre = op + prev1 + preV2;
                    prefix.push(respre);

                }
                oprators.push(ch);

            }

        }
        while (oprators.size() > 0){
            char op = oprators.pop();
            String postV2 = postfix.pop();
            String postV1 = postfix.pop();
            String res = postV1 + postV2 + op;
            postfix.push(res);

            String preV2 = prefix.pop();
            String prev1 = prefix.pop();
            String respre = op + prev1 + preV2;
            prefix.push(respre);
        }
        System.out.println(prefix.pop());
        System.out.println(postfix.pop());
    }
    static int precdence(char ch){
        if (ch == '+' || ch == '-'){
            return 1;
        }
        else if (ch == '*' || ch == '/'){
            return 2;
        }
        else {
            return 0;
        }
    }
}
