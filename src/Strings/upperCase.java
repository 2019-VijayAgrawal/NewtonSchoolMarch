package Strings;

public class upperCase {
    public static void main(String[] args) {
        String s = "Abbcd";
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(0) ;
            if (Character.isUpperCase(first)){
               ss =  s.toUpperCase();

            }
        }
        System.out.println(ss);
        //System.out.println(s);

    }
}
