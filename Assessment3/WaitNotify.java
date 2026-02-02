class Building{
    public synchronized void help() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() +" is running");
        wait();
        System.out.println(Thread.currentThread().getName() +" is completed");


    }
    public synchronized void wake(){
        System.out.println("Notifying");
        notify();
    }
}

public class WaitNotify {
    public static void main(String[] args) {
        Building building=new Building();

        Thread t1=new Thread("thread1"){
            public void run(){
                try {
                    building.help();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t1.start();
        Thread t2=new Thread(){
            public void run(){
                building.wake();
            }
        };
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        t2.start();
    }
}
