package Assignment.StringsBasic;

public class CheckSecondWordFirstLetterIfCaps {
    public static void main(String[] args) {
        String s = "Vijay Kumar Afrahari";
        s.trim();
        String[] s1 = s.split("");

     int x =   s1[s1.length-1].length();
        System.out.println(x);
        System.out.println(s1[1]);
    }
}
