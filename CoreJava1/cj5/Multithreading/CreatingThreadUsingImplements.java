package Multithreading;

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("hello all");
    }
}
public class CreatingThreadUsingImplements {
    public static void main(String[] args) {
        // here we are having a temp class which implements Runnable(interface) which do not have the run method
        //Thread has a property that is Thread(Runnable r) and it can behave as a thread
        MyRunnable r=new MyRunnable();
        Thread t1=new Thread(r);
        t1.start();



        //using lamda function:
        Runnable task = () -> System.out.println("Thread is running using lambda");
        Thread t = new Thread(task);

    }
}
