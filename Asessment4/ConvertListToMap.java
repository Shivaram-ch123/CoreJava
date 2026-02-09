package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
    int employeeId;
    String employeeName;
    Employee(int id,String name){
        employeeId=id;
        employeeName=name;
    }
}

class Department{
    int DepartmentId;
    String departmentName;
    List<Employee> list;
    Department(int id,String name){
        DepartmentId=id;
        departmentName=name;
        list=new ArrayList<>();
    }
}
public class ConvertListToMap {
    public static void main(String[] args) {
        List<Employee> highSchoolTeachers = new ArrayList<>();
        highSchoolTeachers.add(new Employee(1,"apple"));
        highSchoolTeachers.add(new Employee(2,"ball"));
        highSchoolTeachers.add(new Employee(3,"cat"));
        highSchoolTeachers.add(new Employee(4,"dog"));

        List<Employee> primarySchoolTeachers = new ArrayList<>();
        primarySchoolTeachers.add(new Employee(1,"social1"));
        primarySchoolTeachers.add(new Employee(2,"social2"));
        primarySchoolTeachers.add(new Employee(3,"social3"));
        primarySchoolTeachers.add(new Employee(4,"social4"));

        Department department1 = new Department(100,"HighSchool");
        department1.list = highSchoolTeachers;

        Department department2 = new Department(101,"PrimarySchool");
        department2.list = primarySchoolTeachers;

        Map<Department,List<Employee>> finalList = new HashMap<>();

        finalList.put(department1,highSchoolTeachers);
        finalList.put(department2,primarySchoolTeachers);















    }
}
