package Recursion;

public class RecursionBasic {
    public static void main(String[] args) {
        int n = 9;
        //printNum(n);
        System.out.println();
        printNumReverse(n);
    }

    private static void printNumReverse(int n) {
        if (n<0)
            return;
        else {
            printNumReverse(n-1);
        }

        System.out.print(n+" ");
    }

    private static void printNum(int n) {
        if (n < 0)
            return;
        System.out.print(n+" ");
        printNum(n-1);
    }
}
