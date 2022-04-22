package MockPrepration.Mock2;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
public class Flames {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        StringBuffer str1 = new StringBuffer(sc.next());
        StringBuffer str2 = new StringBuffer(sc.next());
       // System.out.println(str1);
        //System.out.println(str2);
       // System.out.println(str1.length()+str2.length());
        for(int i=0; i < str1.length(); i++){
            char ch_i = str1.charAt(i);
            for(int j=0;j<str2.length();j++){
                char ch_j = str2.charAt(j);
                if(ch_i == ch_j){
                    str1.deleteCharAt(i);
                   // System.out.println(str1);
                    str2.deleteCharAt(j);
                  //  System.out.println(str2);
                    i--;
                    j--;
                    break;
                }
            }


        }
        System.out.println(str1);
        System.out.println(str2);

        int len = (str1.length() + str2.length()) % 6;

        switch(len){
            case 1:
                System.out.print("Friends");
                break;
            case 2:
                System.out.print("Love");
                break;
            case 3:
                System.out.print("Affection");
                break;
            case 4:
                System.out.print("Marriage");
                break;
            case 5:
                System.out.print("Enemy");
                break;
            case 0:
                System.out.print("Siblings");
                break;
            default:
                break;


        }


    }
}