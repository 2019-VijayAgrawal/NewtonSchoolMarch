package Sorting;

public class quickSortString {
    public static void main(String[] args) {
        String[] name = {"vijay","pooja","jay","aman"};
        quickSort(name,0,name.length-1);
        for (int i = 0; i < name.length ; i++) {
            System.out.println(name[i]+" ");
        }
    }

    private static void quickSort(String[] name, int low, int high) {
        if(low<high){
            int pi = partition(name,low,high);
            quickSort(name,low,pi-1);
            quickSort(name,pi+1,high);
        }
    }

    private static int partition(String[] name, int low, int high) {
        String pivot = name[high];
        int j = low - 1;
        for (int i = 0; i < name.length; i++) {
            if (name[i].compareTo(pivot) > 0){
              j++;
              String temp = name[j];
              name[j] = name[i];
              name[i] = temp;
            }
        }
        String tempp = name[j+1];
        name[j+1] = name[high];
        name[high] = tempp;
        return j+1;
    }

}
