
package Quene;

   import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

    // don't change the name of this class
// you can add inner classes if needed
    public class MinimumCostOfRopes {
        static int minmCostOfrope(int[] a,int n){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i =0; i < n;i++){
                pq.add(a[i]);
            }
            int ans = 0;
            while(pq.size() > 1){
                int first = pq.poll();
                int second = pq.poll();
                int sum = first + second;
                ans += sum;
                pq.add(sum);
            }
          //  System.out.println(ans);
            return ans;
        }
        public static void main (String[] args) {
            // Your code herezz
            Scanner sc = new Scanner(System.in);
            //BufferedReader br = new BufferedReader(new InputStream(System.in));
            //int t = Integer.parseInt();
            // int t = sc.nextInt();
            byte t = sc.nextByte();
            // int j = 1;
            for (int j = 1; j <=t ; j++) {
                int n = sc.nextInt();
                int[] ar = new int[n];
                for(int i=0;i<n;i++){
                    ar[i] = sc.nextInt();
                }
                System.out.println();
                System.out.println(minmCostOfrope(ar,n));
                System.out.println();
                System.out.println(minmCostOfrope(ar,n));
              //  minmCostOfrope(ar,n);
                //++;
            }

//            2
//            4
//            4 3 2 6
//            5
//            4 2 7 6 9

    }
}
