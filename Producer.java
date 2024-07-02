public class Producer extends Thread{
    private final int id ;
    private final Buffer buffer ;

    public Producer(int id, Buffer buffer) {
        this.id = id;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 0 ;
       while (true){
               try {
                   if(buffer.getCapacity() > buffer.getSizeProducts()) {
                       buffer.addProduct(i++, id);
                       sleep((long) Math.random() * 100);
                   }
               }catch(Exception ex){
                  ex.getMessage();
               }

       }
    }
}
