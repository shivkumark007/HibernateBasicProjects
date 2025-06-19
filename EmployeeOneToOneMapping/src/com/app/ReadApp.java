package com.app;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOFactory;
import com.entity.Employee;
import java.util.List;

public class ReadApp {
    public static void main(String[] args) {
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();

        List<Employee> employees = dao.getAllEmployee();

        if (employees.isEmpty()) {
            System.out.println("Employee Data is not Found in the Database: ");
        } else {
            System.out.println("------------------Employee List--------------------------");
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }
}
