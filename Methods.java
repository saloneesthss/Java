import java.util.Scanner;

public class Methods {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first digit");
        int a=sc.nextInt();
        System.out.println("Enter second digit");
        int b=sc.nextInt();
        System.out.println("Enter 1 for addition, 2 for subraction, 3 for multiplication and 4 for division:");
        int c=sc.nextInt();
        Calculations calc=new Calculations();
        switch (c){
            case 1:
                int add=calc.Add(a, b);
                System.out.println(add);
                break;
            case 2:
                int sub=calc.Sub(a, b);
                System.out.println(sub);
                break;
            case 3:
                int mul=calc.Mul(a, b);
                System.out.println(mul);
                break;
            case 4:
                int div=calc.Div(a, b);
                System.out.println(div);
                break;

        }
        sc.close();
    }
}
class Calculations{
    public int Add(int x, int y){
        return x+y;
    }
    public int Sub(int x, int y){
        return x-y;
    }
    public int Mul(int x, int y){
        return x*y;
    }
    public int Div(int x, int y){
        return x/y;
    }
}
