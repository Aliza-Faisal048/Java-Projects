/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import javax.swing.*;

public class Members extends Person {

    @Override
    public String toString() {
        return "Members{" + "personID=" + getPersonID() + ", personName=" + getPersonName() + "joinDate=" + joinDate + ", membershipExpire=" + membershipExpire + '}';
    }
    public Members(String joinDate, String expireDate, int id, String name, String contact, String address) {
        super(id, name, contact, address);
        setJoinDate(joinDate);
        setMembershipExpire(expireDate);
        totalMembers++;
    }
    private String joinDate;
    private String membershipExpire;

    
    private static int totalMembers = 0;
    
    public static int getTotalMembers() {
        return totalMembers;
    }
    public void setJoinDate(String date) { this.joinDate = date; }
    public String getJoinDate() { return joinDate; }
    public void setMembershipExpire(String date) { this.membershipExpire = date; }
    public String getMembershipExpire() { return membershipExpire; }
    public double calculateFine(int overdueDays) {
        return overdueDays * 2.0;
    }
    public void accessLibrary() {
        System.out.println(getPersonName() + " can borrow and return books.");
    }
    public void displayDetails() {
    System.out.println("Member ID: " + getPersonID());
    System.out.println("Name: " + getPersonName());
    System.out.println("Contact: " + getPersonContact());
    System.out.println("Address: " + getPersonAddress());
    System.out.println("Join Date: " + getJoinDate());
    System.out.println("Membership Expiry: " + getMembershipExpire());
    }
    public int getAllowedBorrowDays() {
        return 15; 
    }
    
}

