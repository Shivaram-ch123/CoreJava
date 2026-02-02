public class ThreadsCounting {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                for(int i=0;i<=10;i++){
                    System.out.println(i);
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                for(int i=0;i<=10;i++){
                    System.out.println(i);
                }
            }
        };

        t1.start();
        t2.start();
    }
}
