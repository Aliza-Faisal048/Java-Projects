/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
import javax.swing.*;
public class Librarian extends Employees {

    @Override
    public String toString() {
        return "Librarian{" + "personID=" + getPersonID() + ", personName=" + getPersonName() + "shiftTiming=" + shiftTiming + '}';
    }
    private String shiftTiming;
    private static int totalLibrarians = 0;
    
    public Librarian(int id, String name, String contact, String address, String dept, double sal, String shift) {
        super(id, name, contact, address, dept, sal);
        setShiftTiming(shift);
        totalLibrarians++;
    }
    public static int getTotalLibrarians() {
        return totalLibrarians;
    }
    void setShiftTiming(String shift) { this.shiftTiming = shift; }
    String getShiftTiming() { return shiftTiming; }
    
    void manageBooks() {
        System.out.println("Librarian " + getPersonName() + " is managing books.");
    }
    void assistMembers() {
        System.out.println("Librarian " + getPersonName() + " is assisting members.");
    }
    public void accessLibrary() {
        System.out.println(getPersonName() + " can manage books and assist members.");
    }
    public void displayDetails() {
    super.displayDetails();
    System.out.println("Shift Timing: " + getShiftTiming());
    }
}