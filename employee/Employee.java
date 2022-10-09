package com.employee;

public class Employee {

    public  String empName;
    public  int EmpAge;

    public Employee(String empName, int empAge) {
        this.empName = empName;
        EmpAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int empAge) {
        EmpAge = empAge;
    }

    public static void main(String[] args) throws Exception {
        Employee employee=new Employee("nu",21);
        EmployeeService service=new EmployeeService();
        service.Validate(employee);

    }

}
