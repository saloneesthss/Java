import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first digit:");
        int a=sc.nextInt();
        System.out.println("Enter second digit:");
        int b=sc.nextInt();
        Rectangle rect=new Rectangle(a,b);
        rect.Display();
        sc.close();
    }
}
class Rectangle {
    int first=0;
    int second=0;
    public Rectangle (int a, int b){
        first=a;
        second=b;
    }
    public void Display(){
        System.out.println("The sum is: "+(first+second));
    }
}
