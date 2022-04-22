package Arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madamm";
        int l = 0;
        int r = s.length()-1;
        boolean check = true;
        while (l <= r){
            if (s.charAt(l) != s.charAt(r)){
                check = false;
            }
            l++;
            r--;
        }
        if (check){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
