package Hashing;

// int n = 4
//  Source -  Destination
// Chennai - Banglore
// Bombay   - Delhi
// Goa     -  Chennai
// Delhi   -  Goa


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Descussion
  Sou

 */
public class FindIterateFromTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_Of_Pairs = sc.nextInt();
        HashMap<String,String> hm = new HashMap<>();
        for (int i = 0; i < no_Of_Pairs; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            hm.put(s1,s2);
        }
//        for (Map.Entry<String,String> entry: hm.entrySet()){
//            System.out.println(entry.getKey() +","+entry.getValue());
//        }

        HashMap<String, Boolean> parc = new HashMap<>();
        for (String src:hm.keySet()){
            String dest = hm.get(src);
            parc.put(dest,false);
            if (parc.containsKey(src) == false){
                parc.put(src,true);
            }
        }
    }
}
