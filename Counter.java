public class Counter extends Thread{
    private int count = 0 ;

    @Override
    public  void run() {
       for(int i = 0 ; i < 1000 ;i++){
           increment();
       }
    }
    public synchronized   void increment() {
        count++;
    }
    public int Getcount(){
        return this.count;
    }
}
