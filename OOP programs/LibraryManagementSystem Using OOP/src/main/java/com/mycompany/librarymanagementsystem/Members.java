/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
public class Members extends Person {
    String joinDate;
    String membershipExpire;
    private static int totalMembers = 0;

    public Members() {
        totalMembers++;
    }

    public static int getTotalMembers() {
        return totalMembers;
    }

    public void setJoinDate(String date) { this.joinDate = date; }
    public String getJoinDate() { return joinDate; }

    public void setMembershipExpire(String date) { this.membershipExpire = date; }
    public String getMembershipExpire() { return membershipExpire; }
}
