package Assignment.Hashing;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

/*
Longest Unique characters Substring
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s, find the length of the longest substring without repeating characters.

Note : String contains spaces also.
Input
First Line contains input of the string.

Constraints
0 <= string. length <= 50000
s consists of English letters, digits, symbols and spaces.
Output
Print the length of the longest substring without repeating characters.
Example
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */

public class LongestUniqCharInString {
    public static void findLongestSubstring(String str)
    {
        int i;
        int n = str.length();

        int st = 0;

        int currlen = 0;

        int maxlen = 0;

        int start = 0;

        HashMap<Character,
                Integer> pos = new HashMap<Character,
                Integer>();

        pos.put(str.charAt(0), 0);

        for (i = 1; i < n; i++)
        {
            if (!pos.containsKey(str.charAt(i)))
            {
                pos.put(str.charAt(i), i);
            }
            else
            {
                if (pos.get(str.charAt(i)) >= st)
                {
                    currlen = i - st;
                    if (maxlen < currlen)
                    {
                        maxlen = currlen;
                        start = st;
                    }
                    st = pos.get(str.charAt(i)) + 1;
                }
                pos.replace(str.charAt(i), i);
            }
        }
        if (maxlen < i - st)
        {
            maxlen = i - st;
            start = st;
        }

        int length= str.substring(start,
                start +
                        maxlen).length();
        System.out.print(length);
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        // longestUniqueChar(s);
        findLongestSubstring(s);
    }
}