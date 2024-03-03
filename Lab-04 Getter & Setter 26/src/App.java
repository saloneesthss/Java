public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rect= new Rectangle();
        rect.setLength(5);
        rect.setBreadth(5);
        System.out.println("The area is: "+rect.getLength()*rect.getBreadth());
    }
}
class Rectangle{
    private int length;
    private int breadth;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
