package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayUserInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
       // String line = br.readLine(); // to read multiple integers line
       // String[] strs = line.trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
    }
}
