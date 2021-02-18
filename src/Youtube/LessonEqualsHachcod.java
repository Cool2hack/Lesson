package Youtube;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Book{
    String autor;
    String name;
}

class Ticket{
    int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

public class LessonEqualsHachcod {
    int value;

    public static void main(String[] args) {
        int value;
        Ticket ticket = new Ticket();
        ticket.number = 101;
        Book book = new Book();
        book.autor = "Dale Karnegi";
        book.name = "Book_Name";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);

        Ticket ticket1 = new Ticket();
        ticket1.number = 101;

        Book karnegiBook = library.get(ticket1);
        System.out.println(karnegiBook.autor);

//        System.out.println(book.hashCode());
//        System.out.println(new Youtube.Book().hashCode());
//        System.out.println(book.equals(new Youtube.Book()));
//        System.out.println(book == new Youtube.Book());
    }
}

