import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Nutuk", 80, "Atatürk", "1923");
        Book book2 = new Book("Alacakaranlık", 150, "Kim", "2000");
        Book book3 = new Book("Harry Potter", 350, "Yazar", "2005");
        Book book4 = new Book("Cin Ali", 58, "Çizer", "2020");
        Book book5 = new Book("Ali Veli", 98, "Author", "1985");

        Set<Book> books1 = new TreeSet<>();

        books1.add(book1);
        books1.add(book2);
        books1.add(book3);
        books1.add(book4);
        books1.add(book5);

        //books.forEach(book -> System.out.println(book));
        for(Book book:books1){
            System.out.println(book);
        }

        System.out.println("------------------------------------------------");

        Set<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);

        books2.forEach(book -> System.out.println(book));
    }
}
