public class App {
    public static void main(String[] args) throws Exception {
        String str="liril";
        String mstr="";
        int i=str.length();
        while (i>0) {
            mstr+=str.charAt(i-1);
            i--;
        }
        if(str.equals(mstr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
