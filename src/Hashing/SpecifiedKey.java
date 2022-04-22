package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SpecifiedKey {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Vijay");
        map.put(2,"Jay");
        map.put(3,"ram");
        map.get(2);
        System.out.println(map.get(1));

        for (Map.Entry x:map.entrySet()){
            System.out.print(x.getKey()+" "+x.getValue());
        }
        System.out.println();
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("j","Vijayy");
        System.out.println(map1.get("j"));

        System.out.println("Map2");

        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(4,"A");
        map2.put(5,"B");
        map2.put(6,"C");
       for (Map.Entry x:map2.entrySet()){
           System.out.println(x.getKey()+" "+x.getValue());
       }
        System.out.println();
        System.out.println("Size of HashMap -> "+map2.size());;

        System.out.println("map+map2");
        map2.putAll(map);
        System.out.println(map2);

        map.clear();
        System.out.println(map);
        if (map2.containsKey(2)){
            System.out.println("Pooja");
        }
        if (map2.containsKey(20)){
            System.out.println("Pooja");
        }
        System.out.println("clone Or Instance Copy");
        HashMap<Integer,Integer> map3 = new HashMap<>();
        map3 = (HashMap)map2.clone();
        System.out.println(map3);

        System.out.println("HashSet Example ");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println(hashSet);
        System.out.println("Not print Duplicate Value");
        hashSet.add(10);
        System.out.println(hashSet);
        System.out.println("Remove 20 -");
        hashSet.remove(20);
        System.out.println(hashSet);

    }
}
