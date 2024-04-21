public class App {
    public static void main(String[] args) throws Exception {
        String str="salonee sinakhu shrestha";
        String[] strarr=str.split(" ");
        for (String s:strarr) {
            String stra="";
            for (int i=0;i<s.length();i++) {
                char c=s.charAt(i);
                if(i==0) {
                    stra=String.valueOf(c).toUpperCase();
                } else {
                    stra+=String.valueOf(c);
                }
            }
            System.out.print(stra+" ");
        }
    }
}
