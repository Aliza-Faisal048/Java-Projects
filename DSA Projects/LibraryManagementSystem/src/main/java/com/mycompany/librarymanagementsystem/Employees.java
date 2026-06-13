/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
import javax.swing.*;
public class Employees extends Person {

    @Override
    public String toString() {
        return "Employees{" + "personID=" + getPersonID() + ", personName=" + getPersonName() + "department=" + department + ", salary=" + salary + '}';
    }
    private String department;
    private double salary;    
    private static int totalEmployees = 0;
    
    public Employees(int id, String name, String contact, String address, String dept, double sal) {
        super(id, name, contact, address);
        setDepartment(dept);
        setSalary(sal);
        totalEmployees++;
    }
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    public void setPersonName(String name){
        super.setPersonName(name);
    }
    public void setDepartment(String dept) { this.department = dept; }
    public String getDepartment() { return department; }
    public void setSalary(double salary) { this.salary = salary; }
    public double getSalary() { return salary; }  
    
    public double calculateFine(int overdueDays) {
        return overdueDays * 1.0;
    }
    public void displayDetails() {
    System.out.println("Employee ID: " + getPersonID());
    System.out.println("Name: " + getPersonName());
    System.out.println("Contact: " + getPersonContact());
    System.out.println("Address: " + getPersonAddress());
    System.out.println("Department: " + getDepartment());
    System.out.println("Salary: $" + getSalary());
    }
    public int getAllowedBorrowDays() {
        return 10;
    }
    
}




