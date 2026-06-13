/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
public class Supplier extends Person {
    String companyName;
    private static int totalSuppliers = 0;

    public Supplier() {
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
    public void displayInfo() {
        System.out.println("Supplier ID: " + personID);
        System.out.println("Company Name: " + companyName);
        System.out.println("Contact Number: " + personContact);
    }
}

