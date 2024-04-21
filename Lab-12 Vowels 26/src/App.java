import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String is = scanner.nextLine();
        scanner.close();
        is = is.toLowerCase();
        int vCount =0;
        for (int i=0; i< is.length(); i++){
            char ch = is.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch== '0' || ch == 'u') {
                vCount++;
            }
        }
        System.out.println("Number of Vowels:" +vCount);
    }
}