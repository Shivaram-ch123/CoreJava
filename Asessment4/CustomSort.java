package com.techouts.Asessment4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeClass{
    int salary;
    String name;
    EmployeeClass(int s,String n){
        salary=s;
        name=n;
    }
}
public class CustomSort {
    public static void main(String[] args) {

        EmployeeClass employee1=new EmployeeClass(1000,"apple");
        EmployeeClass employee2=new EmployeeClass(2000,"orange");
        EmployeeClass employee3=new EmployeeClass(2000,"zebra");
        EmployeeClass employee4=new EmployeeClass(2000,"crocodile");
        List<EmployeeClass> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Collections.sort(list,(a,b)->{
            if(a.salary != b.salary){
                return b.salary-a.salary;
            }
            else{
                boolean aIsGreater=true;
                //if(a.name.length() > b.name.length())return
                return 0;
            }
        });
    }
}
