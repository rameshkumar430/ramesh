package com.employee;

public class EmployeeService {



    public static Employee Validate(Employee employee) throws Exception {

        if (employee.getEmpName().equals("")) {
            throw new NullPointerException();
        } else if (employee.getEmpName().length() < 3) {
            throw new Exception("InvalidNameException");
        } else if (employee.getEmpAge() < 22) {
            throw new Exception("InvalidAgeException");
        }
        return employee;
    }
}
