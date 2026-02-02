import java.util.concurrent.locks.Lock;

class World{

    Object A=new Object();
    Object B=new Object();

    void fun1() throws InterruptedException {
        synchronized(A){
            Thread.sleep(2000);
            synchronized (B){
                System.out.println(Thread.currentThread().getName()+" is running");
            }
        }
    }
    void fun2() throws InterruptedException {
        synchronized(B){
            Thread.sleep(2000);
            synchronized (A){
                System.out.println(Thread.currentThread().getName()+" is running");
            }
        }
    }
}
public class DeadLock {
    public static void main(String[] args) {
        //if 2 or more threads are waiting on each other infinitely time

        World world=new World();

        Thread t1=new Thread(){
          public void run(){
              try {
                  world.fun1();
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Thread t2=new Thread(){
            public void run(){
                try {
                    world.fun2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t1.start();
        t2.start();

    }
}
