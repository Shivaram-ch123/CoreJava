class Room{

    public synchronized void Bathing() throws InterruptedException {
        System.out.println(Thread.currentThread()+" is accessing right now.....");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread()+" completed using this resource");
    }
}

public class RaceCondition {
    public static void main(String[] args) {
        //suppose we have multiple threads and what to access a resource then there is a competion btwn them and the resource might be mis handled
        // so using syncronised we can stop all the threads if one is utilizing the resource
        Room room =new Room();


        Thread t1=new Thread(){
            public void run(){
                try {
                    room.Bathing();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                try {
                    room.Bathing();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t1.start();
        t2.start();

    }
}
