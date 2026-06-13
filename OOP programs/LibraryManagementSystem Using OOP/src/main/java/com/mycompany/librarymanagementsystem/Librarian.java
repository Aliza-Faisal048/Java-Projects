/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
public class Librarian extends Employees {
    String shiftTiming;
    private static int totalLibrarians = 0;

    public Librarian() {
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
}

