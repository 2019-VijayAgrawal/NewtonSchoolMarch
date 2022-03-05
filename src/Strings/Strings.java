package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        String str = "Vijay";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
      //  String name = sc.next();//for one word
       // System.out.println("Your name is : "+name);
        String intro = sc.nextLine(); // more than one word with space
        System.out.println("Your name is : "+intro);
    }
}
