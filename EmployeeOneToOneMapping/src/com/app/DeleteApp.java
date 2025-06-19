package com.app;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOFactory;

public class DeleteApp {
    public static void main(String[] args) {
        int id = 1;

        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();
        dao.deleteEmployee(id);
        System.out.println("Delete Operation completed: ");
    }
}
