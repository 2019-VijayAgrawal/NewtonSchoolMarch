package Assignment.Stack;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
/*
Stack - In Class - Pair Hate (Contest)
by Vijay Kumar
Question
Status
Pair Hate (Contest)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S you have to remove all pairs of identical letters, which are consecutive. If after the removal there appear new pairs, remove them as well. Repeat this untill no adjacent letter in the string is same.
Note that deleting of the consecutive identical letters can be done in any order, as any order leads to the same result.
Input
The input data consists of a single string S.

Constraints:
1 <= |S| <= 100000
S contains lowercase english letters only.
Output
Print the given string after it is processed. It is guaranteed that the result will contain at least one character.
 */
    public class PairHate {
        static void pairHate(String s){
            Stack<Character> st = new Stack<>();
            StringBuilder res = new StringBuilder("");
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(!st.isEmpty() && st.peek() == ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            while(!st.isEmpty()){
                res.append(st.pop());
            }

            System.out.print(res.reverse().toString());
        }
        public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            pairHate(s);
        }
    }
