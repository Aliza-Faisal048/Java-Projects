/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
public abstract class Person {

    @Override
    public String toString() {
        return "Person{" + "personID=" + personID + ", personName=" + personName + ", personContact=" + personContact + ", personAddress=" + personAddress + '}';
    }
    private int personID;
    String personName;
    private String personContact;
    private String personAddress;
    public Person(int id, String name, String contact, String address) {
        setPersonID(id);
        setPersonName(name);
        setPersonContact(contact);
        setPersonAddress(address);
    }

    public void setPersonID(int id) { this.personID = id; }
    public int getPersonID() { return personID; }
    public void setPersonName(String name) { this.personName = name; }
    public String getPersonName() { return personName; }
    public void setPersonContact(String contact) { this.personContact = contact; }
    public String getPersonContact() { return personContact; }
    public void setPersonAddress(String address) { this.personAddress = address; }
    public String getPersonAddress() { return personAddress; }
    public double calculateFine(int overdueDays) {
        return 0; 
    }
    public void accessLibrary() {
        System.out.println(getPersonName() + " has general access to the library.");
    }
    public abstract void displayDetails();
    public abstract int getAllowedBorrowDays();
}

