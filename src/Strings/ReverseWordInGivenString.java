package Strings;

public class ReverseWordInGivenString {
    public static void main(String[] args) {
        String s = "i like you very much";
        String[] ss = s.split(" ");
           String a = "";
        for (int i = ss.length-1 ; i >=0 ; i--) {
            a += " "+ss[i];
            System.out.print(ss[i]+" ");
        }
        System.out.print(a+" ");
    }
}
