import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream in=null;
        FileOutputStream out=null;
        try {
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int c;
            while ((c=in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            throw e;
        }
        finally {
            in.close();
            out.close();
            System.out.println("File write done successfully.");
        }
    }
}
