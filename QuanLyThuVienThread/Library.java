package QuanLyThuVienThread;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }
    public synchronized void addBook(Book book){
        this.books.add(book);
        System.out.println("Add Book Sucessfully" + book.getTitle());
    }
    // muon sach
    public synchronized void brrowBook(String title){
        for(var item : this.books){
            if(item.getTitle().equals(title)){
               if(item.isAvailable()){
                   item.setAvailable(false);
                   System.out.println("Cho muon sach " + item.getTitle());
                   return ;
               }
            }
        }
        System.out.println("Sach nay da co nguoi muon, vui long chon sach khac");
    }
    public synchronized void returnBook(String title){
        for(var item : this.books){
            if(item.getTitle().equals(title)){
                if(!item.isAvailable()){
                    item.setAvailable(true);
                    System.out.println("Ban da tra sach thanh cong " + item.getTitle());
                }
            }
        }
        System.out.println("Ban khong the tra sach , vi quyen sach nay da co trong thu vien");
    }
    public void displayBooks(){
        for(var item : this.books){
            System.out.println(item.toString());
            System.out.println("------------");
        }
    }
}
