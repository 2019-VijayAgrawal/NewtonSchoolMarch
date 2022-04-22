package Assignment.Array2DMaths;

import ModifiersPractice.Main;

import java.util.Arrays;

public class kthSmallestDiff {
    public static void main(String[] args) {
        int [] a= {1, 3, 4 ,1 ,3, 8};
        int n = a.length;
        int k = 3;
        int size = n*(n-1) / 2;
        int[] diff = new int[size];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                ///  diff[k] =(int) a[i][j];
               // count++;
               // System.out.println(a[i] +" , "+a[j]);

                diff[count++] = Math.abs((int)(a[i]-a[j]));

        }
    }
        Arrays.sort(diff);
        for (int i = 0; i < size; i++) {
            System.out.print(diff[i]+" ");
        }
        //System.out.println(count+" c ") ;
    }
}
