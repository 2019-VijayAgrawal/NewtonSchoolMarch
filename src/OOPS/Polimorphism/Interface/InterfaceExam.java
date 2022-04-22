package OOPS.Polimorphism.Interface;

public class InterfaceExam implements interfaceExample{
    @Override
    public void vijayName() {
        System.out.println("Vijay");
    }

    @Override
    public void vijayAge() {
        System.out.println("24");
    }

    public static void main(String[] args) {
        InterfaceExam obj = new InterfaceExam();
        obj.vijayName();
        obj.vijayAge();
        //Obj of interface can not be created but reference is created
//        interfaceExample obj = new interfaceExample() {
//            @Override
//            public void vijayName() {
//
//            }
//
//            @Override
//            public void vijayAge() {
//
//            }
  //      }
        interfaceExample objinterface = new InterfaceExam();
        objinterface.vijayName(); // only call that interface method
    }
}
