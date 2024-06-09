import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        StudentDB obj=new StudentDB();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Record Student#: "+(i+1));
            System.out.print("Enter Id: ");
            int id=sc.nextInt();
            System.out.print("Enter Name: ");
            String name=sc.next();
            System.out.print("Enter Email: ");
            String email=sc.next();
            System.out.print("Enter Gender: ");
            String gender=sc.next();
            obj.InsertStudent(id, name, email, gender);
            System.out.println("Record Inserted");
       }
       obj.DisplayRecord();
       sc.close();
    }
}
