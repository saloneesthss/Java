import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.print("Enter your balance: ");
            double balance=scanner.nextDouble();
            System.out.print("Enter withdrawl amount: ");
            double withdrawl=scanner.nextDouble();
            //Check if withdrawl amount is valid
            if (withdrawl>balance) {
                throw new MyCustomException("Insufficient balance");
            }
            double remBalance=balance-withdrawl;
            System.out.println("Remaining balance: "+ remBalance);
        } catch (MyCustomException ex) {
            System.out.println("Error: "+ ex.getMessage());
        } catch (Exception ex) {
            System.out.println("An error occured: "+ ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
