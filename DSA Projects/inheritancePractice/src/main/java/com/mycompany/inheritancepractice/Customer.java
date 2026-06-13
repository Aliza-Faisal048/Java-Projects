/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritancepractice;
import java.util.*;
public class Customer extends Person{
    int customerID;
    String mailAddress;
    Scanner sc = new Scanner(System.in);
    public void addRecord(){
        addPersonRecord();
        System.out.println("Enter customer ID: ");
        customerID = sc.nextInt();
        System.out.println("Enter mailing address: ");
        mailAddress = sc.nextLine();
    }
    public void showRecord(){
        showPersonRecord();
        System.out.println("Customer ID: " + customerID);
        System.out.println("Mailing address: " + mailAddress);
    }
}
