public class App {
    public static void main(String[] args) throws Exception {
        TestMultiPriority1 m1=new TestMultiPriority1();
        TestMultiPriority1 m2=new TestMultiPriority1();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
class TestMultiPriority1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
} 