package Assignment.Array2DMaths;
import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class ChessBoardAssig {
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count1 = 0;
        int count2 = 0;
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int [n][n];
        for(int i=0;i<n;i++){
            String s1 = br.readLine();
            String [] s2 = s1.split(" ");
            for(int j=0;j<n;j++){
                int value = Integer.parseInt(s2[j]);
                if((i+j)%2==0 && value == 1){
                    count1++;
                }
                if((i+j)%2!=0 && value == 0){
                    count1++;
                }
                if((i+j)%2==0 && value == 0){
                    count2++;
                }
                if((i+j)%2!=0 && value == 1){
                    count2++;
                }
            }
        }
        if(count1<count2){
            System.out.print(count1);
        }
        else{
            System.out.print(count2);
        }
    }
}