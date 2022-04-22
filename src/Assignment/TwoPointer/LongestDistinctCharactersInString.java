package Assignment.TwoPointer;

import java.util.HashMap;
import java.util.Scanner;
/*
Longest Distinct characters in string
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S, you have to find the length of the longest substring of S containing all unique characters, i.e, no character is repeating within that substring.
For example, for input string S = "abca", the output is 3 as "abc" is the longest substring with all distinct characters.
Input
The first line of input contains an integer T denoting the number of test cases.
The first and the only line of each test case contains the string S.

Constraints:
1 ≤ T ≤ 100
1 ≤ length of S ≤ 1000
Output
Print length of longest substring containing all the distinct characters of string.
Note: The output substring should have all distinct characters.
Example
Sample Input:
2
abababcdefababcdab
gccksfvrgccks

Sample Output:
6
7
 */
public class LongestDistinctCharactersInString {
    private static int longestDistCharInString(String s) {
         int maxLen = 0;
         HashMap<Character,Integer> map = new HashMap<>();
         int i = -1;
         int j =-1;

         while (true){
             boolean f1 = false;
             boolean f2 = false;
             while (i < s.length()-1){
                 f1 = true;
                 i++;
                 char ch = s.charAt(i);
                 map.put(ch,map.getOrDefault(ch,0)+1);
                 if (map.get(ch) == 2){
                     break;
                 }
                 else {
                     int len = i - j;
                     if (maxLen < len){
                         maxLen = len;
                     }
                 }
             }
             while (j < i){
                 f2 = true;
                 j++;
                 char ch = s.charAt(j);
                 map.put(ch,map.get(ch)-1);
                 if (map.get(ch) == 1){
                     break;
                 }
             }
             if (f1 == false && f2== false){
                 break;
             }
         }
         return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            // longestDistCharInString(s);
            System.out.println(longestDistCharInString(s));
        }
    }


}
