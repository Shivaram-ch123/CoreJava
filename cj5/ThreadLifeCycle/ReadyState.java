package ThreadLifeCycle;

public class ReadyState {
    public static void main(String[] args) {

        Thread thread = new Thread(){
            public void run(){
                System.out.println("hello thread 1 is rady to run........");
            }
        };
        thread.start();
        System.out.println(thread.getState());
    }
}
