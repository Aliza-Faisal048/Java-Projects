/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
public class Fine {
    int memberID;
    double fineAmount;
    String dueDate;

    Fine(int memberID, double fineAmount, String dueDate) {
        this.memberID = memberID;
        this.fineAmount = fineAmount;
        this.dueDate = dueDate;
    }

    void payFine() {
        System.out.println("Member ID " + memberID + " has paid a fine of $" + fineAmount);
        fineAmount = 0;
    }

    double getFineAmount() { return fineAmount; }

    void displayFineDetails() {
        System.out.println("Member ID: " + memberID + ", Fine: $" + fineAmount + ", Due Date: " + dueDate);
    }
}

