package Assignment.Array2DMaths;

import java.util.Scanner;

public class BooleanMattrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][] arr = new int[n][m];

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            //int[][] modifyArr = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j] == 1){
                        for(int k=0;k<m;k++){
                            arr[i][k] = 1;
                        }
                        //modifyArr[i][j] = arr[i][j];

                    }
                    // modifyArr[i][j] = 1;
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}
