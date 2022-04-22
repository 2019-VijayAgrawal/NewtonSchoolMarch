package Strings;

public class StringComp {
    public static void main(String[] args) {
        String str = "aabbccd";
        String s = str.charAt(0)+"";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if (curr == prev){
                count++;
            }else {
                if (count > 1){
                    s += count;
                    count = 1;
                }
                s += curr;
            }

        }
        if (count > 1){
            s += count;
        }
        System.out.println(s);
        String a = "124";
        String b = "246";
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        String res = "";
        while (i >= 0 || j >= 0 || carry!=0){
            int iVal = i >= 0 ? a.charAt(i) - '0' : 0;
            int jVal = j >= 0 ? b.charAt(i) - '0':0;
            i--;j--;
            int sum = iVal + jVal + carry;
            carry = sum / 10;
              res = sum % 10 + res;
        }
        System.out.println(res);
    }
}
