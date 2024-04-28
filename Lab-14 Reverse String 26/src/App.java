public class App {
    public static void main(String[] args) throws Exception {
        String str="hello";
        int i=str.length();
        while (i>0) {
            System.out.println(str.charAt(i-1));
            i--;
        }
    }
}