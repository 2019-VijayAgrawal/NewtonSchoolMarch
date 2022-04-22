package Strings;

import java.util.Scanner;
import  java.util.*;

public class lengthOfLastWord {
    public static void main(String[] args) {

        String s = " vijay kumar agrahari jjj ";
        String[] arr = s.split(" ");
        for(String s1:arr){
            System.out.print(s1+" ");
        }
        System.out.println();
            for (int i = arr.length-1; i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        System.out.println();
       System.out.println(arr[arr.length-1].length());
    }
}
