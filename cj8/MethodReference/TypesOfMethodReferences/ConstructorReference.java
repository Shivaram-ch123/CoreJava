package com.techouts.cj8.MethodReference.TypesOfMethodReferences;
import java.util.function.Supplier;
class Temp{
    String name;
    Temp(){
        name="Unknown";
    }
    Temp(String name){
        this.name=name;
    }
    Temp(String name ,int age){
        System.out.println("hello my name is : "+name+" my age is : "+age);
    }
}

interface Hello<A,B>{
    void fun(A a,B b);
}
public class ConstructorReference {
    public static void main(String[] args) {
        // calling constructor with 0 parameters using method reference
        Supplier<Temp> obj1=Temp::new;
        Temp ob1 = obj1.get();
        System.out.println(ob1.name);
        //.........


        //create a custom in terfacethat can cal n number of constructors

        Hello<String,Integer> h = Temp::new;
        h.fun("Rahul",12);


    }
}
