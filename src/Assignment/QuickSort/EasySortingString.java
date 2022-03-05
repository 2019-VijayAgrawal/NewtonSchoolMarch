package Assignment.QuickSort;

import java.util.Scanner;

/*An array of 5 string is given where each string contains 2 characters, Now you have to sort these strings using insertion sort, like in a dictionary.
Input
Input contains 5 strings of length 2 separated by spaces.
String contains only uppercase English letters.
Output
Print the sorted array.*/
/*INPUT :
AS KF ER DD JK

OUTPUT :
AS DD ER JK KF*/
public class EasySortingString {
    public static void sortString(String[] str,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }


            }
        }
        for(int i=0;i<n;i++){
            System.out.print(str[i]+" ");
        }
    }
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] str1 = new String[n];
        for(int i=0;i<n;i++){
            str1[i] = sc.next();
        }
        sortString(str1,n);
    }
}
