package QuanLyThuVienThread;

public class Student extends Thread {
    private Library library ;
    private String title ;

    public Student(Library library,String title) {
        this.library = library;
        this.title = title ;
    }

    @Override
    public void run() {
       for(int i = 0 ; i < 5 ; i++){
           library.brrowBook(this.title);
           try {
               sleep((long)Math.random()*100);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           library.returnBook(this.title);
       }
    }
}
