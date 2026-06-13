/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagementsystem;
import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Add Employee");
            System.out.println("4. Add Librarian");
            System.out.println("5. Issue/Return Book");
            System.out.println("6. Add Supplier");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> {
                    BookClass book = new BookClass();
                    System.out.print("Enter Book ID: ");
                    book.setBookID(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    book.setBookName(sc.nextLine());
                    System.out.print("Enter Author: ");
                    book.setAuthor(sc.nextLine());
//                    System.out.print("Is the book issued? (true/false): ");
//                    book.setIssued(sc.nextBoolean());
                    System.out.println("Book Added: " + book.getBookName() + " by " + book.getAuthor());
                }

                case 2 -> {
                    Members member = new Members();
                    System.out.print("Enter Member ID: ");
                    member.setPersonID(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Member Name: ");
                    member.setPersonName(sc.nextLine());
                    System.out.print("Enter Contact: ");
                    member.setPersonContact(sc.nextLine());
                    System.out.print("Enter Address: ");
                    member.setPersonAddress(sc.nextLine());
                    System.out.print("Enter Join Date: ");
                    member.setJoinDate(sc.nextLine());
                    System.out.print("Enter Membership Expiry Date: ");
                    member.setMembershipExpire(sc.nextLine());
                    System.out.println("Member Added: " + member.getPersonName());
                }

                case 3 -> {
                    Employees employee = new Employees();
                    System.out.print("Enter Employee ID: ");
                    employee.setPersonID(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    employee.setPersonName(sc.nextLine());
                    System.out.print("Enter Department: ");
                    employee.setDepartment(sc.nextLine());
                    System.out.print("Enter Salary: ");
                    employee.setSalary(sc.nextDouble());
                    System.out.println("Employee Added: " + employee.getPersonName());
                }

                case 4 -> {
                    Librarian librarian = new Librarian();
                    System.out.print("Enter Librarian ID: ");
                    librarian.setPersonID(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Librarian Name: ");
                    librarian.setPersonName(sc.nextLine());
                    System.out.print("Enter Librarian Contact: ");
                    librarian.setPersonContact(sc.nextLine());
                    System.out.print("Enter Shift Timing: ");
                    librarian.setShiftTiming(sc.nextLine());
                    System.out.println("Librarian Added: " + librarian.getPersonName());
                }

                case 5 -> {
                    BookTransaction transaction = new BookTransaction();
                    System.out.print("Enter Book ID: ");
                    transaction.setBookID(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Member ID: ");
                    transaction.setMemberID(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Issue Date: ");
                    transaction.setIssueDate(sc.nextLine());
                    System.out.println("Book Issued: " + transaction.getBookID() + " to Member ID " + transaction.getMemberID());
                }

                case 6 -> {
                    Supplier supplier = new Supplier();
                    System.out.print("Enter Supplier ID: ");
                    supplier.setPersonID(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Supplier Name: ");
                    supplier.setPersonName(sc.nextLine());
                    System.out.print("Enter Supplier Contact: ");
                    supplier.setPersonContact(sc.nextLine());
                    System.out.print("Enter Company Name: ");
                    supplier.setCompanyName(sc.nextLine());
                    System.out.println("Supplier Added: " + supplier.getPersonName() + " of company: " + supplier.getCompanyName());
                }
                case 7 -> {
                    Librarystats.displayStatistics();
}
                
                default -> System.out.println("Invalid choice! Please enter a valid option.");
            }
        sc.close();
    }
}

