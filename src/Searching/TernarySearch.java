package Searching;

public class TernarySearch {
    public static int ternarySearch(int l,int r,int key,int a[]){
        if (r>=l){
           int mid1 = l+(r-l)/3;
           int mid2 = r-(r-l)/3;
           if (a[mid1] == key){
               return mid1;
           }
           if (a[mid2] == key){
               return mid2;
           }
           if (key<a[mid1]){
               return ternarySearch(l,mid1-1,key,a);
           }
           else if (key>a[mid2]){
               return ternarySearch(mid2+1,r,key,a);
               }
           else {
               return ternarySearch(mid1+1,mid2-1,key,a);
           }
        }
        //Key not found
        return -1;
    }
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int l=0,r=9;
        int key = 5;
        int search = ternarySearch(l,r,key,arr);
        System.out.println("Index Of "+key+" is found "+search);
        key = 50;
        search = ternarySearch(l,r,key,arr);
        System.out.println("Index Of "+key+" is found "+search);
    }
}
