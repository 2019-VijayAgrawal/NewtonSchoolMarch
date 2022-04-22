package Assignment.StringsBasic;

public class checkIfFirstLetterCaps {
    public static void main(String[] args) {
        String s = "Vijay Kumar";
        if (Character.isUpperCase(s.charAt(0))){
            String str = s.toUpperCase();
            System.out.println(str);
        }

    }
}
