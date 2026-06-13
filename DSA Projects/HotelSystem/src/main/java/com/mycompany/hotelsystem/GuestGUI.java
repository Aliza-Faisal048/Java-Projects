/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelsystem;

import java.util.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuestGUI implements ActionListener {
  ArrayList<Guest> g1 = new ArrayList<Guest>();
  JLabel lablId, lablfirstName, lablLastName, lablAge, lablContact, lablGender, lablAddress, lablEmail, lablCheckInDate,
      lablCheckOutDate, lablStayDuration, lablNumberOfPersons, lablBookingSource, lablBookingStatus, lablTotalBill, outLbl;
  JTextField txtId, textFirstName, txtLastName, txtAge, txtContact, txtGender, txtAddress, txtEmail, txtCheckInDate,
      txtCheckOutDate, txtStayDuration, txtNumberOfPersons, txtBookingSource, txtBookingStatus, txtTotalBill, output;
  JButton Add, View;
  Guest guest;

  public GuestGUI() {
    JFrame frame = new JFrame("GUEST FORM");
    frame.setSize(1000, 700);
    frame.setLayout(null);
    frame.setLocation(200, 100);
    lablId = new JLabel("ID");
    lablId.setBounds(20, 20, 100, 20);
    frame.add(lablId);
    txtId = new JTextField();
    txtId.setBounds(150, 20, 100, 20);
    frame.add(txtId);
    lablfirstName = new JLabel("First Name");
    lablfirstName.setBounds(20, 50, 100, 20);
    frame.add(lablfirstName);
    textFirstName = new JTextField();
    textFirstName.setBounds(150, 50, 100, 20);
    frame.add(textFirstName);
    lablLastName = new JLabel("Last Name");
    lablLastName.setBounds(20, 80, 100, 20);
    frame.add(lablLastName);
    txtLastName = new JTextField();
    txtLastName.setBounds(150, 80, 100, 20);
    frame.add(txtLastName);
    lablGender = new JLabel("Gender");
    lablGender.setBounds(20, 110, 100, 20);
    frame.add(lablGender);
    txtGender = new JTextField();
    txtGender.setBounds(150, 110, 100, 20);
    frame.add(txtGender);
    lablAddress = new JLabel("Address");
    lablAddress.setBounds(20, 140, 100, 20);
    frame.add(lablAddress);
    txtAddress = new JTextField();
    txtAddress.setBounds(150, 140, 100, 20);
    frame.add(txtAddress);
    lablContact = new JLabel("Contact");
    lablContact.setBounds(20, 170, 100, 20);
    frame.add(lablContact);
    txtContact = new JTextField();
    txtContact.setBounds(150, 170, 100, 20);
    frame.add(txtContact);
    lablEmail = new JLabel("Email");
    lablEmail.setBounds(20, 200, 100, 20);
    frame.add(lablEmail);
    txtEmail = new JTextField();
    txtEmail.setBounds(150, 200, 100, 20);
    frame.add(txtEmail);

    lablCheckInDate = new JLabel("Check In Date");
    lablCheckInDate.setBounds(20, 230, 100, 20);
    frame.add(lablCheckInDate);
    txtCheckInDate = new JTextField();
    txtCheckInDate.setBounds(150, 230, 100, 20);
    frame.add(txtCheckInDate);
    lablCheckOutDate = new JLabel("Check Out Date");
    lablCheckOutDate.setBounds(20, 260, 100, 20);
    frame.add(lablCheckOutDate);
    txtCheckOutDate = new JTextField();
    txtCheckOutDate.setBounds(150, 260, 100, 20);
    frame.add(txtCheckOutDate);
    lablStayDuration = new JLabel("Stay Duration");
    lablStayDuration.setBounds(20, 290, 100, 20);
    frame.add(lablStayDuration);
    txtStayDuration = new JTextField();
    txtStayDuration.setBounds(150, 290, 100, 20);
    frame.add(txtStayDuration);
    lablNumberOfPersons = new JLabel("Number Of Persons");
    lablNumberOfPersons.setBounds(20, 320, 100, 20);
    frame.add(lablNumberOfPersons);
    txtNumberOfPersons = new JTextField();
    txtNumberOfPersons.setBounds(150, 320, 100, 20);
    frame.add(txtNumberOfPersons);
    lablBookingSource = new JLabel("Booking Source");
    lablBookingSource.setBounds(20, 350, 100, 20);
    frame.add(lablBookingSource);
    txtBookingSource = new JTextField();
    txtBookingSource.setBounds(150, 350, 100, 20);
    frame.add(txtBookingSource);
    lablBookingStatus = new JLabel("Booking Status");
    lablBookingStatus.setBounds(20, 380, 100, 20);
    frame.add(lablBookingStatus);
    txtBookingStatus = new JTextField();
    txtBookingStatus.setBounds(150, 380, 100, 20);
    frame.add(txtBookingStatus);
    lablTotalBill = new JLabel("Total Bill");
    lablTotalBill.setBounds(20, 410, 100, 20);
    frame.add(lablTotalBill);
    txtTotalBill = new JTextField();
    txtTotalBill.setBounds(150, 410, 100, 20);
    frame.add(txtTotalBill);
    lablAge = new JLabel("Age");
    lablAge.setBounds(20, 440, 100, 20);
    frame.add(lablAge);
    txtAge = new JTextField();
    txtAge.setBounds(150, 440, 100, 20);
    frame.add(txtAge);
    Add = new JButton("Add");
    Add.setBounds(100, 540, 100, 20);
    frame.add(Add);
    Add.addActionListener(this);
    View = new JButton("View");
    View.setBounds(200, 540, 100, 20);
    frame.add(View);
    View.addActionListener(this);

    outLbl = new JLabel("output");
    outLbl.setBounds(20, 570, 500, 20);
    frame.add(outLbl);
    output = new JTextField();
    output.setBounds(150, 570, 500, 80);
    frame.add(output);
    
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == Add) {
      guest = new Guest(Integer.parseInt(txtId.getText()), textFirstName.getText(), txtLastName.getText(),
          Integer.parseInt(txtAge.getText()), txtContact.getText(), txtGender.getText(), txtAddress.getText(),
          txtEmail.getText(), txtCheckInDate.getText(), txtCheckOutDate.getText(),
          Integer.parseInt(txtStayDuration.getText()), Integer.parseInt(txtNumberOfPersons.getText()),
          txtBookingSource.getText(), Boolean.parseBoolean(txtBookingStatus.getText()));
      g1.add(guest);

    } else if (e.getSource() == View) {
      output.setText(g1.toString());
    }

  }
}
