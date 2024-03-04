public class App {
    public static void main(String[] args) throws Exception {
        Circle cir=new Circle();
        cir.draw();
    }
}
interface Drawable {
    void draw();
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}