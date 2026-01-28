package org.techouts;
class Employee{
    int EmployeeId;
    int age;
}

class Company{
    Employee e1;

    void Method10(Employee e1){
        this.e1=e1;
        System.out.println("company has a employee : "+e1.EmployeeId);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        /*gendrally aggregation  means if a class has another class , but they are never
        depend on each other.
         even if one does not exist the other can exist , there is no dependency

         */
        Employee employee = new Employee();
        employee.EmployeeId=101;
        Company company=new Company(); // use a relation between classes , independent
        company.Method10(employee);

    }
}
