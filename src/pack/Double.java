package pack;

import book_Shildt.Glava8;

public class Double {

    public static void main(String[] args) {
        Glava8 book[] = new Glava8[2];

        book[0] = new Glava8("Java", "Gerbert Shildt", 2018);
        book[1] = new Glava8("Second book", "Gerbert Shildt", 2020);

        for (int i = 0; i < book.length; i++) {
            book[i].show();
        }
    }
}

class ExtBook extends Glava8 {
    private String publisher;

    public ExtBook(String title, String autor, int pubDate, String publisher){
        super(title, autor, pubDate);
        this.publisher = publisher;
    }

    public void show(){
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getPubDate(){
        return pubDate;
    }
    public void setPubDate(int pubDate){
        this.pubDate = pubDate;
    }
}

class ProtectedDemo{

    public static void main(String[] args) {
        ExtBook book[] = new ExtBook[2];

        book[0] = new ExtBook("Java", "Gerbert Shildt", 2018, "Minsk");
        book[1] = new ExtBook("Second book", "Gerbert", 2020, "Moscow");

        for (int i = 0; i < book.length; i++) {
            book[i].show();
        }


        System.out.println("Выбор книги по параметру (поиск в библиотеке).");
        String autor = "Gerbert";

        for (int i = 0; i <book.length ; i++) {
            if (book[i].getAutor() == autor) book[i].getTitle();
        }
    }
}