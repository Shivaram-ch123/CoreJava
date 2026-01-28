package org.techouts;

class Department{
    private int files;
    private int EmployeeDetals;

    public int getEmployeeDetals() {
        return EmployeeDetals;
    }

    public void setEmployeeDetals(int employeeDetals) {
        EmployeeDetals = employeeDetals;
    }

    public int getFiles() {
        return files;
    }

    public void setFiles(int files) {
        this.files = files;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        //encapsualtion steps
        // 1. make the data private , only access through the functions

        Department department=new Department();
        department.setFiles(2000);
        department.setEmployeeDetals(500);
        System.out.println(department.getEmployeeDetals());

    }
}
