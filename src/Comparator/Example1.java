package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Example1 {
    static class custom_comparator implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.rollNo - s2.rollNo;  //Solv Accending Order;
        }
    }
    static class Student{
        int rollNo;
        String name;

        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Student a[] = new Student[5];
        a[0] = new  Student(2,"Vijay");
        a[1] = new Student(1,"Jay");
        a[2] = new Student(4,"Pooja");
       a[3] = new Student(3,"Ram");
       a[4] = new Student(5,"Shyam");

        Arrays.sort(a,new custom_comparator());
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i].rollNo+" "+a[i].name);
        }

    }
}
