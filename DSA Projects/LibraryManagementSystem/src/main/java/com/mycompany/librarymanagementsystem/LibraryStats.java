/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
public class LibraryStats {
    public static void displayStatistics() {
        System.out.println("Library Statistics:");
        System.out.println("Total Books: " + Book.getTotalBooks());
        System.out.println("Total Members: " + Members.getTotalMembers());
        System.out.println("Total Employees: " + Employees.getTotalEmployees());
        System.out.println("Total Librarians: " + Librarian.getTotalLibrarians());
        System.out.println("Total Transactions: " + BookTransaction.getTotalTransactions());
        System.out.println("Total Suppliers: " + Suppliers.getTotalSuppliers());
    }
}

