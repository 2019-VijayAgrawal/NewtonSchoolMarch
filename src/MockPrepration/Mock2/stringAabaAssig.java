package MockPrepration.Mock2;
import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class stringAabaAssig {
    static int abba(String s,int n){
       int a = 0;
       int b = 0;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'a'){
                a++;
            }
            else{
                b++;
            }
        }
        int res = Math.min(a,b);
        return res;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          String s= sc.next();
         // abba(s,n);
        System.out.println(abba(s,n));
    }
}
