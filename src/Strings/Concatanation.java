package Strings;

import java.util.Scanner;

public class Concatanation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            String str = sc.next();
        }
        String firstName = "Vijay";
        String lastName = "Agrahari";
        String fullName = firstName+"@"+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
