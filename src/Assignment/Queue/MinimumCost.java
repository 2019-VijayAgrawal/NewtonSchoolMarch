package Assignment.Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumCost {
    static void minmCostOfrope(int[] a,int n){
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
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            minmCostOfrope(a,n);
            //System.out.print(minmCostOfrope(a,n));
            //System.out.println();
        }
    }
}
