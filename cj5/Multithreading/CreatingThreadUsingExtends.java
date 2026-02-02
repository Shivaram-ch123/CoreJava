package Multithreading;

class Mythread extends Thread{

    public void run(){
        System.out.println("Hello thread 1 si running");
    }
}

public class CreatingThreadUsingExtends {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.run();

        // usinig anonymus :  bracket to bracket
        //          new ClassOrInterfaceType(constructorArgumentsIfAny) {
        //              // Body of the anonymous class
        //              // Can override methods here
        //          };

        Thread t2=new Thread(){
            public void run(){
                System.out.println("Hello thread 1 si running");
            }
        };
    }
}
