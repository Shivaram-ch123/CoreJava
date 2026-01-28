package org.techouts;

abstract class AbstractExample {
    abstract void Function4();

    int Sum(int a, int b) {
        return a + b;
    }

}

class ChildClass extends AbstractExample{
    void Function4() {
        System.out.println("Yo are in child class");
    }
    int Sum(int x,int y){
        return x*y;
    }
}

class AbstractClass{
    public static void main(String[] args) {

        /*
        abstract class contains :
        1. both abstract methods and non abstract methods
        2. classes that extends the abstract class must implement all the abstact methods
        3. it is a kind of blue print for other classes
        4. should contains abstract keyword at the front , can have static methods ,and final methods
        5. it can override the methods
         */
        ChildClass ch=new ChildClass();
        System.out.println(ch.Sum(10,20));
    }
}
