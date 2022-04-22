package ModifierPractice2;

public class ModifierRohitSir {

    public static int a;

    // Access modifiers: control some access
    // -> class, attributes, contructor, methods
    // Non access modifiers : give some other functionality
    public static void main(String[] args) {
// Access Modifiers
        // public/default->  for class
        // public class-> class is accessible by any other class
        // default class -> dont specify any modifier

        // public/default/private/protected -> for attributes,methods,constructors
        //  public attributes/methods/constructors -> the code accessible from all the classes
        // private attributes/methods/constructors -> the code is only accessible within declared class
        // default attributes/methods/constructors -> the code is only accessible in same package
        // protected attributes/methods/constructors -> the code is accessible in the same package and subclasses
        // -> if its in same package( either inheritance/ not -> accesible)
        // -> if its in diffderent package (only inherited classes can access)

        // class A -> protected
        // class B extends A
        // class C extends B

      //  Inheritance obj = new Inheritance();
      //  obj.abc = 5;

        a=6;

        // Non Access Modifiers

        // final/abstract-> for class
        // final-> the class cannot be inherited
        // abstract -> the class's objects can not be created

        // final/static/abstract  + transient/synchronized/volatile-> attributes and methods
        // final  attributes/methods -> Cannot be changed
        // static attributes/methods ->belong to class, and not individual object
        // abstract methods ->  1> only in abstract classes , will not have any body, no abstract attribute






    }

}