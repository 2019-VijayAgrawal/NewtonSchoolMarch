package MockPrepration.Mock2;

import java.util.Scanner;

public class StringComp {
    static String compress(String s){
        String str = s.charAt(0)+"";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
           char curr = s.charAt(i);
           char prev = s.charAt(i-1);
           if (curr == prev){
               count++;

           }
           else{
               if(count>=1){
                   str += count;
                   count = 1;
               }
               str = str+curr;
           }

        }
        if (count>=1){
            str +=count;
            //count = 1;
        }


       return str;
    }
    public static void main(String[] args) {
        String s = "aabcdd";
       // compress(s);
        System.out.println(compress(s));

    }
}
