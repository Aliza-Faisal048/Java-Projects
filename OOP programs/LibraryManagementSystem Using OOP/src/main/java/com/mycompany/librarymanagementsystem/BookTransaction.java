/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
public class BookTransaction extends BookClass {
    int memberID;
    String issueDate;
    String returnDate;
    private static int totalTransactions = 0;

    public BookTransaction() {
        totalTransactions++;
    }

    public static int getTotalTransactions() {
        return totalTransactions;
    }

    void setMemberID(int id) { this.memberID = id; }
    int getMemberID() { return memberID; }

    void setIssueDate(String date) { this.issueDate = date; }
    String getIssueDate() { return issueDate; }

    void setReturnDate(String date) { 
        this.returnDate = date; 
        setIssued(false);
    }
    String getReturnDate() { return returnDate; }

    void borrowBook(int memberID, String issueDate, String dueDate) {
        if (getIssued()) {
            System.out.println("Book " + getBookName() + " is already issued.");
        } else {
            setIssued(true);
            this.memberID = memberID;
            this.issueDate = issueDate;
            this.returnDate = null;
            System.out.println("Book " + getBookName() + " issued to Member ID " + memberID + " on " + issueDate + ", due by " + returnDate);
        }
    }

    void returnBook(String returnDate) {
        if (!getIssued()) {
            System.out.println("Book " + getBookName() + " was not issued.");
        } else {
            setReturnDate(returnDate);
            System.out.println("Book " + getBookName() + " returned by Member ID " + memberID + " on " + returnDate);
        }
    }
}

