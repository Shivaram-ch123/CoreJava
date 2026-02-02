class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        Runnable r1=new MyThread();
        Thread thread=new Thread(r1);
        thread.start();
        // if we wwant to implement mo
    }
}
