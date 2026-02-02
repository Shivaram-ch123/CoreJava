package LamdaExpression.Variables_Captured_in_Lambdas;
class Temp{
    int variable=10;
    void dispalay(){
        variable+=1;
        Runnable r= () ->{
            System.out.println(variable);
        };
        r.run();
    }
}
public class InstanceVariables {
    public static void main(String[] args) {
        Temp t=new Temp();
        t.dispalay();
    }
}
