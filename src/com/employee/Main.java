package com.employee;

import java.util.ArrayList;
import java.util.List;

public class Main extends EmployeeRecord {

    public static void main(String[] args) {

        EmployeeRecord empl1 = new EmployeeRecord("John", 1, null);
        EmployeeRecord empl2 = new EmployeeRecord("Smith",2, 1);
        EmployeeRecord empl3 = new EmployeeRecord("Jack",3, 1);

        List<EmployeeRecord> employees = new ArrayList<>();
        employees.add(empl1);
        employees.add(empl2);
        employees.add(empl3);

        EmployeeRecord manager = new EmployeeRecord();
        manager = manager.buildHierarchy(employees);

        System.out.println(manager.toString());

    }
}
