import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Student st=new Student();
        st.id=1;
        st.name="Salonee";
        st.address="Bhaktapur";
        try {
            FileOutputStream out=new FileOutputStream("input.txt");
            ObjectOutputStream obout=new ObjectOutputStream(out);
            obout.writeObject(st);
            obout.close();
            out.close();
            System.out.println("Object is Serialized.");
            FileInputStream in=new FileInputStream("input.txt");
            ObjectInputStream obinput=new ObjectInputStream(in);
            st=(Student)obinput.readObject();
            in.close();
            obinput.close();
        } catch (IOException e) {
            e.getMessage();
        }
        System.out.println(st.name+" "+st.address+" "+st.id);
    }
}
class Student implements Serializable {
    public String name="";
    public String address="";
    public int id=0;
}