package LamdaExpression.Variables_Captured_in_Lambdas;

class HelloWorld{
    static int a=200;

    void display(){
        a+=1;
        Runnable r=()->{
            System.out.println(a);
        };
        r.run();
    }
}
public class StaticVariables {
    public static void main(String[] args) {
        HelloWorld h=new HelloWorld();
        h.display();
    }
}
