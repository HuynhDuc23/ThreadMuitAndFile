public class Main {
    public static void main(String[] args) {
//        Thread taskA =  new TaskA() ;
//        taskA.start();
//        Thread taskB = new Thread(new TaskB());
//        taskB.start();

      Buffer buffer = new Buffer(50);
      Thread pro =  new Producer(333 , buffer);
      Thread cus = new Customer(1, buffer);
      pro.start();
      cus.start();

    }
}
