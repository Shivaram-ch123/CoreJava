package ThreadLifeCycle;

public class NewState {
    public static void main(String[] args) {
        // Thread object is created but not started

        Runnable r1=()->{
            System.out.println("hello thread 1 started");
        };
        Thread thread=new Thread(r1);
        System.out.println(thread.getState());


    }
}
