package ThreadLifeCycle;

public class Blocked {
    public static void main(String[] args) {
        //A thread is in BLOCKED state when it wants to enter a synchronized block/method but another thread already holds the lock.
        Demo obj = new Demo();

        Thread t1 = new Thread(() -> obj.method(), "Thread-1");
        Thread t2 = new Thread(() -> obj.method(), "Thread-2");

        t1.start();
        t2.start(); // t2 will be BLOCKED until t1 releases the lock
        for(int i=0;i<10;i++)System.out.println(t2.getState());
    }
}


class Demo {
    synchronized void method() {
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

