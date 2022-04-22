package Sorting;

public class SortsStrings {
    static String[] name = {"vijay","pooja","jay","aman"};
    public static void main(String[] args) {
        for (int i = 0; i < name.length; i++) {
            for (int j = i+1; j < name.length; j++) {
                if (name[i].compareTo(name[j])>0){  //name[i] = vijay  v ka unicode  p ke unicode se jyada h so pos value
                     String temp =    name[i];              //name[j] = pooja
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
