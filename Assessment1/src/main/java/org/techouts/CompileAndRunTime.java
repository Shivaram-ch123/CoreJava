package org.techouts;


class MyClass2{
    int count;
    void First(){
        System.out.println("you are in the constructor");
    }
    void First(int age, String name){
        System.out.println("my age is : "+age+" and my name is : "+name);
    }
}

class Temperature1 extends MyClass2{
    void First(int age , String name){
        System.out.println("You are in the Temperature class : "+age +" "+name);
    }
}


public class CompileAndRunTime {
    public static void main(String[] args) {
        //1.compile time --> done at the compile time
        MyClass1 c1 = new MyClass1();
        c1.First(20,"shiva");

        //2.runtime polymorphism --> done at run time
        Temperature t1 = new Temperature();
        t1.First(20,"shiva");
    }
}




