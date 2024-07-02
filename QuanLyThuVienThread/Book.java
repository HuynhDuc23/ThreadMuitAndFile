package QuanLyThuVienThread;

public class Book {
    private String title ;
    private  String Author ;
    private   boolean available ;

    public Book(String title, String author) {
        this.title = title;
        this.available = true;
        this.Author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title ;
    }

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }

    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author){
        this.Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", available=" + available +
                '}';
    }
}
