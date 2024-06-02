import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list=new ArrayList<String>();  //Creating ArrayList
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Traversing list through Iterator
        Iterator <String> itr=list.iterator();  //Getting the Iterator
        while(itr.hasNext()) {  //Check
            System.out.println(itr.next());
        }
    }
}
