package org.techouts;

//1.single level
class Building{
    int HouseNo;
    int location;
    void Method1(){
        System.out.println("This is a building");
    }
}
class Room extends Building{
    int RoomColor;
    int NoOfWindows;

    void Method2(){
        System.out.println("This is a Room inside the building");
    }
}

//2.multilevel
class GrandFather{
    int habbits;
    int intelligency;
    void Method3(){
        System.out.println("GrandFather");
    }
}
class Father extends GrandFather{
    int habbits2;
    int intelligency2;
    void Method3(){
        System.out.println("Father");
    }
}
class Kid extends Father{
    int habbits3;
    int intelligency3;
    void Method3(){
        System.out.println("Kid");
    }
}


class Vechile{
    int wheels;
    int color;
    void Engine(){
        System.out.println("Its Engine Type");
    }
}
class Car extends Vechile{
    int ModelNo;

    void Engine(){
        System.out.println("Its Engine Type");
    }
}
class Bike extends Vechile{
    int price;
    void Engine(){
        System.out.println("Its Engine Type");
    }
}


public class TypesOfInheritance {
    public static void main(String[] args) {
        //Types of Inheritance :
        /*
        1. Single inheritance
        2. multilevel inheritance
        3. heirachial iniheritance
        4. multilevel -> not supported in java (we use interface)
         */
    }
}
