package Assignment.Array2DMaths;

/*Matrix ZigZag Traversal
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a 2d matrix of size M*N, print the zig traversal of the matrix as shown:-

Consider a matrix of size 5*4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20

ZigZag traversal:-

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
Input
First line of input contains two integers M and N. Next M lines contains N space- separated integers each.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[i][j] <= 100000
Output
Print the zig- zag traversal of the matrix as shown.
Example
Sample Input:-
4 3
1 2 3
4 5 6
7 8 9
10 11 12

Sample Output:-
1
4 2
7 5 3
10 8 6
11 9
12*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class ZigzagMattrix {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i =0 ;i<n;i++){
            for(int j=0 ; j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        if(n==1){
            for(int j=0 ;j<m ;j++){
                System.out.println( matrix[0][j]+" ");
            }
        }
        else if(m==1){
            for(int i=0 ;i<n ;i++){
                System.out.println( matrix[i][0]+" ");
            }
        }else{
            for(int x =0 ;x<n;x++){
                int i=x;
                for(int j=0 ; j<m&&i>=0;j++){
                    System.out.print( matrix[i][j]+" ");
                    i--;
                }
                System.out.println();
            }
            for(int x =0 ;x<n-1;x++){
                int i=n-1;
                for(int j=x+1 ; j<m&&i>=x;j++){
                    System.out.print( matrix[i][j]+" ");
                    i--;
                }
                System.out.println();
            }

        }


    }
}