package org.techouts;
class Example0{
    int cnt1;
}
class Example1{
    Example1(){
        Example0 obj1 = new Example0();
        System.out.println("obj created");
    }
}
public class Composition {
    public static void main(String[] args) {
        //composition means one cannot exist without other , purely dependent(owns a relation)
        Example1 example1 = new Example1();
        // comparision  btwn aggregation and composion : composition is purely depends
        // but aggregation means either classes exist without other (has a relation)
    }
}
