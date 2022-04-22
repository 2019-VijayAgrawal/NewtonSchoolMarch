package Assignment.Hashing;



import java.util.*;

public class maxLenOfSubString {

    public static void main(String []args){

        String s = "geeksforgeeks";
        int length = longSubstring(s);
        System.out.println("Substring length ="+ length);
    }
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online



    static int longSubstring(String s)
    {
        // initialization
        int a_pointer =0; // start of a window
        int b_pointer = 0; // end pointer
        int max = 0; // max size of substring

        HashSet<Character> hashSet = new HashSet(); // track repeatation
        while(a_pointer <= b_pointer  && b_pointer < s.length())
        {
            if(!hashSet.contains(s.charAt(b_pointer)))
            {
                hashSet.add(s.charAt(b_pointer));
                b_pointer ++;
                max = Math.max(max,hashSet.size());
            }
            else
            {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer ++;
            }
        }

        return max;
    }

}
