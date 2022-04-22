package MockDSA1Prepration;

public class CheckPalinDrome {
    public static void main(String[] args) {
        String str = "madam";
        String s1 = "({[]})";
       // checkPalindrome(str);
       // System.out.println(checkPalindrome(str));
        String str2 = "aabbcc";
        System.out.println(compression(str2));
        System.out.println(checkPalindrome(str));

    }
    //aabb
   static String compression(String str){
        String s = str.charAt(0)+"";
       for (int i = 1; i < str.length(); i++) {
           char  curr = str.charAt(i);
          char prev = str.charAt(i-1);
          if (curr != prev){
              s +=curr;
          }

       }
       return  s;
   }
    private static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
          //  boolean found false;
            char firt = str.charAt(0);
            char last = str.charAt(str.length()-1);
            while (firt <= last){
                if (firt == last){
                    return true;
                }
                firt++;
                last--;
            }
        }
        return false;
    }
}
