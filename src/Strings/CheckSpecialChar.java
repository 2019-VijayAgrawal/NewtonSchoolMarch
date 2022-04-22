package Strings;

public class CheckSpecialChar {
    public static void main(String[] args) {
        String s = "!#$GeeeksforGeeks.Computer.Science.Portal!!";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch) && !Character.isWhitespace(ch) && !Character.isLetter(ch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
