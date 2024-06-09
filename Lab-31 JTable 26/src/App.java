import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame f=new JFrame();
        String data[][]={{"101","Salonee","60000"}, {"102","Simran","70000"}, {"103","Seokjin","70000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }
}
