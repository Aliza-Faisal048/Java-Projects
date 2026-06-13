/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritancepractice;
import java.util.*;
public class Person {
    String name;
    String email;
    int ContactNo;
    Scanner sc = new Scanner(System.in);
    public Person fun(){
        return this;
    }
    public void addPersonRecord(){
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter email: ");
        email = sc.nextLine();
        System.out.println("Enter contact number: ");
        ContactNo = sc.nextInt();
    }
    public void showPersonRecord(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Contact Number: " + ContactNo);
    }
}
