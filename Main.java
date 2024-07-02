import QuanLyThuVienThread.Book;
import QuanLyThuVienThread.Library;
import QuanLyThuVienThread.Student;

public class Main {
    public static void main(String[] args) {
//        Counter cus1 =  new Counter();
//
//        Thread th1 =  new Thread(cus1);
//        Thread th2 =  new Thread(cus1);
//
//        // bất đồng bộ , 2 thread cùng truy cập vào tài nguyên đồng thời cus1 , do có async nên
//        // 1 trong 2 thread cần chờ xong thì mới thực hiện tính toán
//        th1.start();
//        th2.start();
//        try{
//            th1.join(); // chờ cho tiến trình xử lý xong thì mới tới dòng tiếp theo
//            th2.join();
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println(cus1.Getcount());
        Library lib =  new Library() ;
        Book b1 =  new Book("TT","HUYNHDUC");
        Book b2 =  new Book("TT2","HUYNHDUC2");
        Book b3 =  new Book("TT3","HUYNHDUC3");
        Book b4 =  new Book("TT4","HUYNHDUC4");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addBook(b4);
        System.out.println("Danh Sach Sach");
        lib.displayBooks();

        Thread st = new Student(lib,"TT");
        Thread st2 = new Student(lib,"TT2");
        Thread st3 = new Student(lib,"TT3");
        Thread st4 = new Student(lib,"TT3");
        st.start();
        st2.start();
        st3.start();
        st4.start();




    }
}
