package org.techouts;

class GrandParent{
    int variable1=10;
    void Method(){
        System.out.println("Hello from Grandparent!!!");
    }

}
class Child extends GrandParent{
    int variable2=120;
    //from here we can use child class properties and also the parent class properties
    //at the same time
    Child(){
        super(); // here we can call the parent constructor explicitly...
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        //inheritance means , child getting the properties and behaviour from parent class
        // using extends keyword

        Child child1 = new Child();
        child1.Method(); // we can access the parent class methods and variables

    }
}
