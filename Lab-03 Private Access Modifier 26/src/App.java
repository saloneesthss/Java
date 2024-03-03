public class App {
    private int length;
    private int breadth;
    public App(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public void Area(){
        System.out.println(length*breadth);
    }
    public static void main(String[] args) throws Exception {
        App am=new App(5, 6);
        am.Area();
    }
}
