/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
import javax.swing.*;
public class Book implements Reservable{

    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", bookName=" + bookName + ", author=" + author + ", isIssued=" + isIssued + ", isReserved=" + isReserved + ", reservedBy=" + reservedBy + '}';
    }
    private int bookID;
    private String bookName;
    private String author;
    private boolean isIssued;
    private static int totalBooks = 0; 
    private boolean isReserved;
    private String reservedBy = null;
    public Book(int id, String name, String authorName, boolean issued) {
        setBookID(id);
        setBookName(name);
        setAuthor(authorName);
        setIssued(issued);
        totalBooks++;
    }
    public static int getTotalBooks() { 
        return totalBooks;
    }
    public void setBookID(int id) { this.bookID = id; }
    public int getBookID() { return bookID; }
    public void setBookName(String name) { this.bookName = name; }
    public String getBookName() { return bookName; }
    public void setAuthor(String author) { this.author = author; }
    public String getAuthor() { return author; }
    public void setIssued(boolean issued) { this.isIssued = issued; }
    public boolean getIssued() { return isIssued; }
    public void displayBook() {
    System.out.println("Book ID: " + getBookID());
    System.out.println("Title: " + getBookName());
    System.out.println("Author: " + getAuthor());
    System.out.println("Issued: " + (getIssued() ? "Yes" : "No"));
    }
    public void reserve(String name) {
        if (!isReserved) {
            isReserved = true;
            reservedBy = name;
            System.out.println("Book reserved for: " + name);
        } else {
            System.out.println("Book already reserved by: " + reservedBy);
        }
    }
    public void cancelReservation() {
        if (isReserved) {
            System.out.println("Reservation cancelled for: " + reservedBy);
            isReserved = false;
            reservedBy = "";
        } else {
            System.out.println("No reservation to cancel.");
        }
    }
    public boolean isReserved() {
        return isReserved;
    }
}
