/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
public class BookClass {
    int bookID;
    String bookName;
    String author;
    boolean isIssued;
    private static int totalBooks = 0; 

    public BookClass() {
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
}

