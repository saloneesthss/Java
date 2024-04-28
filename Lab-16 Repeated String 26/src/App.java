public class App {
    public static void main(String[] args) throws Exception {
        String input="Programming logic";
        char[] characters=input.toCharArray();
        int length=characters.length;

        System.out.println("Duplicate Characters: ");
        for (int i=0;i<length;i++) {
            for (int j=i+1;j<length;j++) {
                if (characters[i]==characters[j]) {
                    System.out.println(characters[i]);
                    break;
                }
            }
        }
    }
}