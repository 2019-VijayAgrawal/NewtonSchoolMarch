package Searching;

import java.util.Scanner;
import java.io.*;
//Input:
//        2
//        5 6
//        2 3 6 5 6
//        4 3
//        2 4 6 5
//
//        Output:
//        2 4
//        Not found
public class FindPositionsofXinarray {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findPosition(arr, n, x);
    }

}
    static void findPosition(int arr[],int n,int x){
        boolean found= false;
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                found = true;
                stringBuffer.append(i +" ");
            }
        }
        if(found==true)
        {
            System.out.println(stringBuffer.toString());
        }
        else{
            System.out.println("Not found");
        }
    }

}
