import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String bookName;
    private int pageNumber;
    private String authorName;
    private String publishDate;

    public Book(String bookName, int pageNumber, String authorName, String publishDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book b) {
        return this.getBookName().compareTo(b.getBookName());
    }

    @Override
    public String toString() {
        String ret = "";
        ret += "Kitap ismi: " + this.bookName + "\n";
        ret += "Sayfa sayısı: " + this.pageNumber + "\n";
        ret += "Yazarın ismi: " + this.authorName + "\n";
        ret += "Yayın tarihi: " + this.publishDate + "\n";
        return ret;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
