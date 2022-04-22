package Strings;

import java.util.Scanner;

public class ConvertLowerCase {

    public static void main(String[] args) {
       String s = "Vijay Kumar";
        s = s.toLowerCase();
        System.out.println(s);
        s.split(s);
        System.out.println(s);
      s= s.substring(0,2);
        System.out.println(s);

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s2.codePointAt(0)>=97){
            s2 = s2.toUpperCase();

        }
        System.out.println(s1+" "+s2);
    }
}
