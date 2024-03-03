public class App {
    int num=10;
    public App() {
        System.out.println("Inside constructor");
    }
    public App(int num) {
        this();
        this.num=num;
    }
    void display() {
        this.show();
        System.out.println("num: "+this.num);
    }
    void show() {
        System.out.println("Inside show method");
    }
    public static void main(String[] args) throws Exception {
        App obj=new App(100);
        obj.display();
    }
}
