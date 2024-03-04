public class App {
    public static void main(String[] args) throws Exception {
        Circle c=new Circle(); 
        c.draw();
        Rectangle r=new Rectangle();
        r.draw();
    }
}
abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}