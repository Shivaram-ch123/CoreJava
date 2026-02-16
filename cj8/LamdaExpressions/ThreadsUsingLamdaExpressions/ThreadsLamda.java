package com.techouts.cj8.LamdaExpressions.ThreadsUsingLamdaExpressions;

public class ThreadsLamda {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("Thread is running.....");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

    }
}
