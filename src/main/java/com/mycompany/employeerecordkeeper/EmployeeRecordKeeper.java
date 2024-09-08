/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeerecordkeeper;

/**
 *
 * @author msaad
 */
public class EmployeeRecordKeeper {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        displayEmployee(emp1);
        displayEmployee(emp2);
        displayEmployee(emp3);
        
    }
    
    public static void displayEmployee(Employee emp)
    {
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("ID number: " + emp.getIdNumber());
        System.out.println("Position: " + emp.getPosition() + "\n");
    }
}
