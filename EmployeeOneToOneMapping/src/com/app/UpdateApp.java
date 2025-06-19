package com.app;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOFactory;
import com.entity.Department;
import com.entity.Employee;

public class UpdateApp {
    public static void main(String[] args) {
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();
     
        
        
     //   dao.getEmployeeById(int id);
        
        Employee employee = new Employee();
        employee.setId(1);  
        employee.setName("Sharad");
        employee.setSalary(456783);        
        
        Department dept = new Department();
         dept.setdId(2);
        
      //  System.out.println(dept.getName());
        
        dept.setName("Politics");

        employee.setDepartment(dept);

        dao.updateEmployee(employee);
        
        System.out.println("Update Completed: ");
    }
}
