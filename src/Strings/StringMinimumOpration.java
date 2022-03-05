package Strings;

import java.util.Scanner;

public class StringMinimumOpration {
    static int countOccurrence(String s) {
        int count=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=s.charAt(i+1)) {
                ++count;

            }
        }
        return count;
    }
    public static void main(String args[]) {
       // System.out.print(countOccurrence("abaa"));
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] arr=new String[n];

        //Display default value after declaring
        System.out.println("Default values of given String array: ");
        for(int i=0; i<arr.length; i++){

            while (arr.length<2){
                arr[i] = sc.next();
            }
        }//find
        for(int i=0; i<arr.length; i++){
            while (arr.length<2){
               // System.out.println(arr[i]);
            }

        }
    }

}
