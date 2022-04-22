package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//In ArrayList we can increase size of array dynamacally and also automatic memory size increases
// array list always add element at the end of array
// Complexity O(n)
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();  // create Empty array
        arrayList.add("Vijay");
        arrayList.add("jay");
        arrayList.add("Ram");
        arrayList.add("Shyam");
        arrayList.size();
        System.out.println(arrayList.size());

        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.add(1,"jaya");
        System.out.println(arrayList);

        ArrayList<String> newList = new ArrayList<>();
        newList.add("55");
        newList.add("100");

        arrayList.addAll(newList);
        System.out.println(arrayList);

        System.out.println(arrayList.get(3));
        //set Function
        arrayList.set(2,"pooja");
        System.out.println(arrayList);
        //Contains - true/False
        System.out.println(arrayList.contains("55")+" h ");
        System.out.println(arrayList.contains(150));

        //Tervering
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" The list is "+arrayList.get(i));
        }
        //for each loop
        for (String element : arrayList){
            System.out.println("The list is "+element);
        }

        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(" Iterator " +it.next());
        }

        arrayList.clear();
        System.out.println(arrayList+"List is now Empty");

    }

}
