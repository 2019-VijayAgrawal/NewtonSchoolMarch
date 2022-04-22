
package Assignment.Hashing;

import java.util.HashMap;
import java.util.Map;

/*
{n=1}
{e=1, n=1}
{e=1, w=1, n=1}
{t=1, e=1, w=1, n=1}
{t=1, e=1, w=1, n=1, o=1}
{t=1, e=1, w=1, n=2, o=1}
{s=1, t=1, e=1, w=1, n=2, o=1}
{s=1, c=1, t=1, e=1, w=1, n=2, o=1}
{s=1, c=1, t=1, e=1, w=1, h=1, n=2, o=1}
{s=1, c=1, t=1, e=1, w=1, h=1, n=2, o=2}
{s=1, c=1, t=1, e=1, w=1, h=1, n=2, o=3}
{s=1, c=1, t=1, e=1, w=1, h=1, l=1, n=2, o=3}
*/
/*
Hashing - Post Class - First non- repeating character in a String
by Vijay Kumar
Question
Status
First non- repeating character in a String
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s, find the first non- repeating character in the string and return its index. If it does not exist, return -1.
Input
First line of the input contains the string s.

Constraints
1<= s. length <= 100000
Output
Print the index of the first non- repeating character in a string
* */
public class FirstNonRepeatingCharacterInString {

    public static void main(String[] args) {
        String s = "newtonschool";
        solution(s);
       // System.out.println(solution(s));
    }

    private static void solution(String s) {
        HashMap<Character,Integer> fmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (fmap.containsKey(ch)){
                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
            }
            else {
                fmap.put(ch,1);
            }
           // System.out.println(fmap);
        }
        for (int i = 0; i < s.length(); i++) {
            char chi = s.charAt(i);
            if (fmap.get(chi) == 1) {
                System.out.println(chi);
                return;
            }
//            for(Map.Entry<Character,Integer> entry: fmap.entrySet()){
//                if (entry.getValue() == 1){
//                    System.out.print(entry.getKey());
//                    return;
//                }
//            }

            //return;
        }
    }
}
