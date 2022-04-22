package mockEasy22;

import java.util.Scanner;

public class lengthOfLast {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
        String s1 =" vijay kumar agrahri ";
        s1 = s1.trim();
        String[] ss = s1.split(" ");
        System.out.println(ss.length);
        String z = "";
        for (int i = ss.length-1; i >= 0; i--) {
           System.out.print(ss[i]+" ");
        }

       // System.out.println(ss[ss.length-1].length());
       // System.out.println("b");
    }
}
