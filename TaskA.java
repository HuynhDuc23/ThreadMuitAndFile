public class TaskA extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 999 ;i++){
            System.out.println("TaskA: "+i);
        }
    }
}
