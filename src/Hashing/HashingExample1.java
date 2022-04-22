package Hashing;

import java.util.Hashtable;

public class HashingExample1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
        hashtable.put(5,"Pooja");
        hashtable.put(1,"Vijay");
        hashtable.put(2,"Jay");
        System.out.println(hashtable);
    }
}
