class Hello{
    void method1()throws InterruptedException{
        method2();
    }
    void method2()throws InterruptedException{
        method3();
    }
    void method3() throws InterruptedException{
        Thread.sleep(2000);
    }
}
public class ExceptionPropagation {
    public static void main(String[] args) {
        Hello hello=new Hello();

        try{
            hello.method1();;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (InterruptedException e){
            System.out.println(e);
        }finally {
            System.out.println("Program ran successfully");
        }
    }
}
