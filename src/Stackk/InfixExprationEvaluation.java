package Stackk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixExprationEvaluation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        System.out.println(t);
        String exp = br.readLine();

        Stack<Integer> oprends = new Stack<>();
        Stack<Character> optors = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if ( ch == '('){
                optors.push(ch);
            }
            else if (Character.isDigit(ch)){
                oprends.push(ch-'0');
            }
            else if (ch == ')'){
                while (optors.peek() != '('){
                 char optor =   optors.pop();
                    int v2 = oprends.pop();
                    int v1 = oprends.pop();

                    int opv = opration(v1,v2,optor);
                    oprends.push(opv);
                }
                optors.pop();  // pop ')'
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                //ch want to higher priourity to solve first
                while (optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())){
                    char optor = optors.pop();
                    int v2 = oprends.pop();
                    int v1 = oprends.pop();

                    int opv = opration(v1,v2,optor);
                    oprends.push(opv);
                }
                optors.push(ch); //last me apne oprator ko push kr denge
            }

        }

        while (optors.size() != 0){
            char optor = optors.pop();
            int v2 = oprends.pop();
            int v1 = oprends.pop();

            int opv = opration(v1,v2,optor);
            oprends.push(opv);
        }
        System.out.println(oprends.peek());
    }
    public static int precedence(char optor){
        if (optor == '+'){
            return 1;
        } else if (optor == '-'){
            return 1;
        }else if (optor == '*'){
            return 2;
        }else {
            return 2;
        }
    }
    public static int opration(int v1,int v2,char optor){
        if (optor == '+'){
            return v2+v1;
        }else if(optor == '-'){
            return v1-v2;
        }else if (optor == '*'){
            return v2*v1;
        }else {
            return v1/v2;
        }
    }
}
