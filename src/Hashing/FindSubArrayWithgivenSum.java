package Hashing;

import java.util.HashMap;

public class FindSubArrayWithgivenSum {
    public static void main(String[] args) {
        int[] a = {10,15,-5,15,-10,5};
        // int sum = 20;

        int sum = 30;
        findSubArray(a,sum);
    }

    private static void findSubArray(int[] a, int sum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int currSum = 0;
        int startindex = 0;
        int endIndex = -1;
        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if (currSum - sum == 0){
                startindex = 0;
                endIndex = i;
                System.out.println(" SubArrayFount At Start index "+startindex+" and end index At " + endIndex);
                break;
            }
            if (map.containsKey(currSum - sum)){
                startindex = map.get(currSum - sum)+1;
                endIndex = i;
                System.out.println(" SubArrayFount At Start index "+startindex+" and end index At " + endIndex);
                break;
            }
            map.put(currSum,i);
        }
    }
}

/*
public static Node reverse(Node head){
           Node prev = null;
           Node curr = head;
           while(curr != null){
               Node temp = curr.next;
               curr.next = prev;
               prev = curr;
               curr = temp;
           }
           head = prev;
           return head;
       }
 */