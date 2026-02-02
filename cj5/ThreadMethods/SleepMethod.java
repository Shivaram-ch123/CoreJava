package ThreadMethods;

public class SleepMethod {
    public static void main(String[] args) {
        Thread thread=new Thread(){
            public void run(){
                try {

                    Thread.sleep(3000); // here sleep is a static method , so you dont need to call by using its obj name , you can call directly
                    //using the class name, who ever calls that that thread will stops for a while
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

        //ok all the other synchronised blocks will be locked thats why this is called as lock on the object?
    }
}
