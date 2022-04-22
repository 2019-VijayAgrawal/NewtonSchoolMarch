package Strings;

public class StringCompration {
    public static void main(String[] args) {
        String s = "aaabbccd";
        //String result = ""
        String result = s.charAt(0)+"";
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if (curr != prev){
                result += curr;
            }

        }
        System.out.println(result);
        String result2 = s.charAt(0)+"";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if (curr == prev){
                count++;
            }
            else{
                if (count >=1){
                    result2 +=count;
                    count = 1;
                }
                result2 = result2 + curr;
            }
            if (curr>=1){
                result2 +=count;
            }
        }
        String num1 = "123";
        String num2 = "241";
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        String res = "";
        while (i>=0 || j>=0 || carry!=0){
        int iVal = i>=0?num1.charAt(i)-'0':0;
        int jVal = j>=0?num2.charAt(j)-'0':0;
        i--;j--;
        int sum = iVal + jVal + carry;
        res += sum%10;
        carry = sum/10;
        }
        System.out.println(res);
    }
}
