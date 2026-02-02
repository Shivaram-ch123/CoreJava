package ThreadLifeCycle;

public class Running {
    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(){
            public void run(){
                try {

                    Thread.sleep(3000);
                    System.out.println(currentThread().getState());
                    for (int i=0;i<100000;i++){

                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello thread is executing me right now");
            }
        };
        thread.start();

        // so in java running is just a concept , but even though the thead is running it will show as runnable
        // because jvm schedular cannot garentee that is the current thread is exactly executing at this secound





    }

}
