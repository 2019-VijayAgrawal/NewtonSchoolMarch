package MockInterview;

public class CheckPlaindrome {
    public static void main(String[] args) {
        String s = "madamm";
      //  checkPalindrome(s);
        String ss = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            ss += s.charAt(i);
        }
        if (s.equals(ss)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Panindrome");
        }

    }
}
