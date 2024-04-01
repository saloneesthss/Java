public class App {
    public static void main(String[] args) throws Exception {
        Animal a=new Dog();
        Dog d=new Dog();
        a.eat();
        d.move();
    }
}
class Animal {
    public void eat() {
        System.out.println("Eat all eatables.");
    }
}
class Dog extends Animal{
    public void eat() {
        super.eat();
        System.out.println("Dog likes eating bones.");
    }
    public void move() {
        System.out.println("Dog move.");
    }
}