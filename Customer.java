public class Customer extends Thread{
    private final int id ;
    private final Buffer buffer ;

    public Customer(int id, Buffer buffer) {
        this.id = id;
        this.buffer = buffer;
    }

    @Override
    public void run() {
       while (true){
           try {
               if(buffer.getCapacity()>0){
                   System.out.println("Khach Hang Vua Mua Hang :" + id);
                   buffer.removeProduct(id);
               }
               sleep((long)Math.random()*100);
           }catch(Exception ex){
               System.out.println(ex.getMessage());
           }
       }
    }
}
