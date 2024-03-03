public class App {
    private String author;
    private String title;
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String a) {
        this.author=a;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String t){
        this.title=t;
    }
    public static void main(String[] args) {
        App gs=new App();
        gs.setAuthor("Salonee Shrestha");
        gs.setTitle("Ms.");
        System.out.println(gs.getTitle()+" "+gs.getAuthor());
    }
}
