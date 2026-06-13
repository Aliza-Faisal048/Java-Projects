/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
public class Employees extends Person {
    String department;
    double salary;
    private static int totalEmployees = 0;

    public Employees() {
        totalEmployees++;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public void setDepartment(String dept) { this.department = dept; }
    public String getDepartment() { return department; }

    public void setSalary(double salary) { this.salary = salary; }
    public double getSalary() { return salary; }
}
