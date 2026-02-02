import com.sun.jdi.Method;

class Temp{

    public synchronized void Method() {
        try {
            Thread.sleep(4000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(Thread.currentThread() +" is running");
    }
}


public class ThreadLifeCycles  {
    public static void main(String[] args) throws Exception {



        Temp t1=new Temp();
        Thread thread1=new Thread(){
            public void run(){
                t1.Method();
            }
        };
        System.out.println(thread1.getState()); //new
        thread1.start();//runnable
        System.out.println(thread1.getState());

        Thread thread2=new Thread(){
            public void run(){
                t1.Method();
            }
        };
        thread2.start();
        Thread.sleep(100);
        System.out.println(thread2.getState());

        thread1.join();
        System.out.println(thread1.getState()); // running(runnable)





    }
}
