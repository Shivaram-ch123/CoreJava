package org.techouts;
class Student{
    int rollno;
    int age;
    int marks;
}

class Teacher{
    int subject;
    int name;

    void Teaches(Student s1){
        System.out.println("Teacher teaches to : "+s1.rollno);
    }
}

public class Assosiation {
    public static void main(String[] args) {
        /*gendrally assosiation means if a class uses another class , but they are never
        depend on each other
         even if one does not exist the other can exist , there is no dependency

         */
        Student student1 = new Student();
        Teacher teacher = new Teacher();
        teacher.Teaches(student1); // use a relation between classes , independent

    }
}
