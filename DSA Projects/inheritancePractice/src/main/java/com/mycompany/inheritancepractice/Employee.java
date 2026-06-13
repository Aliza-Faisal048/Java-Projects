/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritancepractice;
import java.util.*;
public class Employee extends Person{
    int empID;
    int salary;
    Scanner sc = new Scanner(System.in);
    public void addRecord(){
        addPersonRecord();
        System.out.println("Enter empID: ");
        empID = sc.nextInt();
        System.out.println("Enter salary: ");
        salary = sc.nextInt();
    }
    public void showRecord(){
        showPersonRecord();
        System.out.println("Employee ID: " + empID);
        System.out.println("Salary: " + salary);
    }
}
