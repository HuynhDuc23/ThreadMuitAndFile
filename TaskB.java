public class TaskB implements Runnable{
    @Override
    public void run() {
        for (int i = 1 ; i < 999 ;i++){
            System.out.println("TaskB :"+ i);
        }
    }
}
