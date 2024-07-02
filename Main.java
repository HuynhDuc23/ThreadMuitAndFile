public class Main {
    public static void main(String[] args) {
        Thread taskA =  new TaskA() ;
        taskA.start();
        Thread taskB = new Thread(new TaskB());
        taskB.start();

    }
}
