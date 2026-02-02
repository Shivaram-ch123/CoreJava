class MyClass{
    int count=0;

    public synchronized void method(){
        for(int i=0;i<5;i++){
            count++;
            System.out.println(count);
        }
    }
}
public class ThreadSyncronization {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();

        Thread thread1=new Thread(){
          public void run(){
              myClass.method();
          }
        };

        Thread thread2=new Thread(){
            public void run(){
                myClass.method();
            }
        };

        thread1.start();
        thread2.start();
    } // here gendrally after the use of one variable only other variable will access the count
}
