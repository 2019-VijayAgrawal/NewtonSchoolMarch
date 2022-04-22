package Assignment.Hashing;

import java.util.HashSet;
import java.util.Scanner;

import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class LongestUniqueCharactersSubstring {
    static int longestUniqueChar(String s){
        HashSet<Character> hs = new HashSet<>();
        int aPointer = 0;
        int bPointer = 0;
        int max = 0;
        while(aPointer < s.length()){
//            if (!Character.isDigit(s.charAt(aPointer))
//                    && !Character.isLetter(s.charAt(aPointer))
//                    && !Character.isWhitespace(s.charAt(aPointer))) {
                // Incrementing the countr for spl
                // characters by unity


                if (!hs.contains(s.charAt(aPointer))) {
                    hs.add(s.charAt(aPointer));
                    aPointer++;
                    max = Math.max(hs.size(), max);
                    //System.out.print(hs+" ");
                } else {
                    hs.remove(s.charAt(bPointer));
                    // System.out.print(hs+" ");
                    bPointer++;
                }
            //}
        }

        return max;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        // longestUniqueChar(s);
        System.out.print(longestUniqueChar(s));
    }
}