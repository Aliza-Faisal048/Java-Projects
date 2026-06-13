/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
import javax.swing.*;
public class Suppliers extends Person {
    private String companyName;
    private static int totalSuppliers = 0;
    
    public Suppliers(int id, String name, String contact, String address, String company) {
        super(id, name, contact, address);
        setCompanyName(company);
        totalSuppliers++;
    }
    public static int getTotalSuppliers() {
        return totalSuppliers;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void accessLibrary() {
        System.out.println(getPersonName() + " can deliver new books to the inventory section.");
    }
    public void displayDetails() {
    System.out.println("Supplier ID: " + getPersonID());
    System.out.println("Name: " + getPersonName());
    System.out.println("Contact: " + getPersonContact());
    System.out.println("Address: " + getPersonAddress());
    System.out.println("Company: " + getCompanyName());
    }
    public int getAllowedBorrowDays() {
        return 0; 
    }
    
}

