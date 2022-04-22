package Hashing;
import java.util.*;

public class LongestDistinctCharactersInString {

    static int longestUniqueSubsttr(String s)
    {

        // Creating a set to store the last positions of occurrence
        HashMap<Character, Integer> map = new HashMap<>();
        int maximum_length = 0;

        // starting the initial point of window to index 0
        int start = 0;

        for(int i = 0; i < s.length(); i++)
        {
            // Checking if we have already seen the element or not
            char ch = s.charAt(i);
           if (map.containsKey(ch) == false){
               map.put(ch,map.getOrDefault(ch,0)+1);
               int len = map.size();
               if (maximum_length < len){
                   maximum_length = len;
               }
           }
        }
        return maximum_length;
    }

    // Driver code
    public static void main(String []args)
    {
        String s = "gccksfvrgccks";
        System.out.println("The input String is " + s);
        int length = longestUniqueSubsttr(s);
        System.out.println("The length of the longest non-repeating character substring is " + length);
    }
}

// This code is contributed by rutvik_56.
