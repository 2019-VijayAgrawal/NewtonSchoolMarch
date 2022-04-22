package OOPS.Polimorphism.Interface;
class A implements MultipleInterfaceExample.I1, MultipleInterfaceExample.I2 {
    public void f1(){

    }

    @Override
    public void f2() {

    }
    public void F3Self(){

    }
}
class B extends A implements MultipleInterfaceExample.I3, MultipleInterfaceExample.I4 {
    @Override
    public void f2() {

    }
}
public class MultipleInterfaceExam{
    public static void main(String[] args) {
        A obj = new A();
        obj.f1();
        obj.f2();
        obj.F3Self();

        MultipleInterfaceExample.I1 objj = new A(); // call only I1 interface method
        objj.f1();
//        objj.f2();
//        objj.f3();
    }
}
