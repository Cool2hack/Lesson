package book_Shildt;

public class Glava8 {
    protected String title;
    protected String autor;
    protected int pubDate;

    public Glava8(String title, String autor, int pubDate){
        this.title = title;
        this.autor = autor;
        this.pubDate = pubDate;
    }

    public void show(){
        System.out.println(title);
        System.out.println(autor);
        System.out.println(pubDate);
    }
}
