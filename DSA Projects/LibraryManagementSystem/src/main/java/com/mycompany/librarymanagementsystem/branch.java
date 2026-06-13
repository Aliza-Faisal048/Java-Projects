/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
import java.util.*;
public class branch {

    @Override
    public String toString() {
        return "branch{" + "branchId=" + branchId + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", books=" + books + ", members=" + members + ", librarian=" + librarian + '}';
    }
    private String branchId, name, address; 
    private int phoneNumber;
    ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Members> getMembers() {
        return members;
    }

    public ArrayList<Librarian> getLibrarian() {
        return librarian;
    }
    ArrayList<Members> members;
    ArrayList<Librarian> librarian;

    public branch(String branchId, String name, String address, int phoneNumber, ArrayList<Book> books, ArrayList<Members> members, ArrayList<Librarian> librarian) {
        this.branchId = branchId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.books = books;
        this.librarian = librarian;
        this.members = members;
    }

    public String getBranchId() { return branchId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getPhoneNumber() { return phoneNumber; }
}
