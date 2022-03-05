package MentorClass;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {
        //Creating HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Vijay");
        hashSet.add("Jay");
        hashSet.add("Pooja");
        Iterator<String> i=hashSet.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
