/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagementsystem;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Effective Java", "Joshua Bloch", false);
        Book book2 = new Book(102, "Clean Code", "Robert C. Martin", true);
        ArrayList<Book> b1Books = new ArrayList<>();
        b1Books.add(book1);
        b1Books.add(book2);
        
        Book book3 = new Book(103, "Introduction to Algorithms", "Thomas H. Cormen", false);
        Book book4 = new Book(101, "Introduction to Java", "James Gosling", false);
        ArrayList<Book> b2Books = new ArrayList<>();
        b2Books.add(book3);
        b2Books.add(book4);

        Members mem1 = new Members("2023-01-15", "2026-01-15", 301, "David Miller", "555-999-8888", "90 Cedar Lane");
        Members mem2 = new Members("2024-03-01", "2027-03-01", 302, "Emma Watson", "444-222-3333", "21 Birch Road");
        ArrayList<Members> b1Members = new ArrayList<>();
        b1Members.add(mem1);
        b1Members.add(mem2);
        
        Members mem3 = new Members("2022-07-10", "2025-07-10", 303, "Frank Green", "666-444-5555", "64 Spruce Ct");
        Members mem4 = new Members("2023-06-10", "2025-05-23", 304, "Ayesha Naeem", "777-334-5555", "27 Wellsbury");
        ArrayList<Members> b2Members = new ArrayList<>();
        b2Members.add(mem3);
        b2Members.add(mem4);
        
        Librarian lib1 = new Librarian(201, "Alice Walker", "999-111-2222", "45 Oak Ave", "Circulation", 55000.00, "Morning");
        Librarian lib2 = new Librarian(202, "Brian Adams", "888-333-4444", "12 Pine St", "Reference", 60000.00, "Evening");
        ArrayList<Librarian> b1Librarian = new ArrayList<>();
        b1Librarian.add(lib1);
        b1Librarian.add(lib2);
        
        Librarian lib3 = new Librarian(203, "Clara Lee", "777-555-6666", "78 Maple Blvd", "Cataloging", 58000.00, "Night");
        Librarian lib4 = new Librarian(204, "Fatima Noor", "03012345678", "Lahore", "Library Services", 62000.00, "Night");
        ArrayList<Librarian> b2Librarian = new ArrayList<>();
        b2Librarian.add(lib3);
        b2Librarian.add(lib4);
        
        branch branch1 = new branch("B001", "Downtown Branch", "123 Main St", 1234567890, b1Books, b1Members, b1Librarian);
        branch branch2 = new branch("B002", "Uptown Branch", "456 High St", 987654321, b2Books, b2Members, b2Librarian);
        ArrayList<branch> branches = new ArrayList<>();
        branches.add(branch1);
        branches.add(branch2);

        Library system = new Library("National Library of Pakistan", branches);
        //  Display sample data
        System.out.println("Library Management System Demo:");
        System.out.println("--------------------------------");

        System.out.println("Branches:");
        for (branch b : system.getBranches()) {
            System.out.println(" - " + b.getName() + " at " + b.getAddress() + "have: ");
            for(Book books: b.getBooks()){
                System.out.println("Book: " + books);
            }
            for(Members members: b.getMembers()){
                System.out.println("Member: " + members);
            } 
            for(Librarian librarians: b.getLibrarian()){
                System.out.println("Librarian: " + librarians);
            }
        }
        int count = 0;
        for (branch b : system.getBranches()){
        System.out.println("Total books in branch " + b);
            for(Book books: b.getBooks()){
                count++;
            }
        }
        count = 0;
        for (branch b : system.getBranches()){
        System.out.println("Total members in branch " + b);    
            for(Members members: b.getMembers()){
                count++;
            }
        }
        count = 0;
        for (branch b : system.getBranches()){
        System.out.println("Total librarians in branch " + b);    
            for(Librarian librarians: b.getLibrarian()){
                count++;
            }
        }
    }
}

