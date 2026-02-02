package ThreadLifeCycle;

public class Waiting {
    public static void main(String[] args) throws InterruptedException {
        //A thread is in WAITING state when it is waiting indefinitely for another thread to signal it.
        //Unlike BLOCKED, it is not waiting for a lock to enter a synchronized block; it is waiting for a signal.

        //Thread releases the lock on the object when it calls wait().
        //Methods that can cause WAITING:
        //Object.wait() (without timeout)
        //Thread.join() (without timeout)

        Demo1 obj = new Demo1();

        Thread t1 = new Thread(() -> obj.waitDemo(), "Thread-1");
        t1.start();

        Thread.sleep(1000); // let t1 enter WAITING

        Thread t2 = new Thread(() -> obj.notifyDemo(), "Thread-2");
        t2.start();

        //If multiple threads are waiting on the same object (called wait()), then:
        //When notify() is called → only one thread wakes up (which one is chosen is up to JVM).
        //When notifyAll() is called → all waiting threads wake up, but they still have to compete for the lock to continue.
    }
}

class Demo1 {
    synchronized void waitDemo() {
        try {
            System.out.println(Thread.currentThread().getName() + " is WAITING");
            wait(); // thread enters WAITING state
            System.out.println(Thread.currentThread().getName() + " is notified and running");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    synchronized void notifyDemo() {
        notify(); // wakes up waiting thread
    }
}
