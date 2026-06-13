package com.mycompany.hotelsystem;
import java.util.*;
import javax.swing.*;

class Guest extends person {

  String checkInDate;
  String checkOutDate;
  int stayDuration;
  int numberOfPersons;
  String bookingSource;
  boolean bookingStatus;
  double TotalBill;

  // constructor
  public Guest(int id, String firstName, String lastName, int age, String contactNo, String gender, String address, String email, String checkInDate, String checkOutDate, int stayDuration, int numberOfPersons, String bookingSource, boolean bookingStatus) {
    super(id, firstName, lastName, age, contactNo, gender, address, email);
    setCheckInDate(checkInDate);
    setCheckOutDate(checkOutDate);
    setStayDuration(stayDuration);
    setNumberOfPersons(numberOfPersons);
    setBookingSource(bookingSource);
    setBookingStatus(bookingStatus);
  }

 

  public void setCheckInDate(String checkInDate) {
    this.checkInDate = checkInDate;
  }

  public String getCheckInDate() {
    return checkInDate;
  }

  public void setCheckOutDate(String checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  public String getCheckOutDate() {
    return checkOutDate;
  }

  public void setStayDuration(int stayDuration) {
    this.stayDuration = stayDuration;
  }

  public int getStayDuration() {
    return stayDuration;
  }

  public void setNumberOfPersons(int numberOfPersons) {
    this.numberOfPersons = numberOfPersons;
  }

  public int getNumberOfPersons() {
    return numberOfPersons;
  }

  public void setBookingSource(String bookingSource) {
    this.bookingSource = bookingSource;
  }

  public String getBookingSource() {
    return bookingSource;
  }

  public void setBookingStatus(boolean bookingStatus) {
    this.bookingStatus = bookingStatus;
  }

  public boolean getBookingStatus() {
    return bookingStatus;
  }

 

  public String toString() {
    return "Guest [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", contactNo="
        + contactNo + ", gender=" + gender + ", address=" + address + ", email=" + email + ", checkInDate="
        + checkInDate + ", checkOutDate=" + checkOutDate + ", stayDuration=" + stayDuration + ", numberOfPersons="
        + numberOfPersons + ", bookingSource=" + bookingSource + ", bookingStatus=" + bookingStatus +  "]";

  } 
}
