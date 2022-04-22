package OOPS.Polimorphism.Abstraction;
abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY) {

    }
    abstract void draw();
    abstract void resize();
}
  //  Each nonabstract subclass of GraphicObject, such as Circle and Rectangle, must provide implementations for the draw and resize methods:

class Circle extends GraphicObject {
    void draw() {
        System.out.println("Draw a circle");
    }
    void resize() {
        System.out.println("radious is 20");
    }
}
class Rectangle extends GraphicObject {
    void draw() {
        System.out.println("Draw a rectangle");
    }

    void resize() {
        System.out.println("reacgle area 64");
    }
}
public class AbstractClassExam {
    public static void main(String[] args) {
  //      GraphObject obj = new GraphObject() ; --> Not Possible

        Circle obj = new Circle();
        obj.draw();
        obj.resize();

        Rectangle ob = new Rectangle();
        ob.draw();
        ob.resize();

    }
}
