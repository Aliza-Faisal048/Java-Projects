package com.mycompany.hotelsystem;
import java.util.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StaffGUI implements ActionListener {
  ArrayList<Staff> s1 = new ArrayList<>();
  JLabel lablId, lablfirstName, lablLastName, lablAge, lablGender, lablAddress, lablContact, lablEmail, lablSalary,
      lablCommission, lablJobTitle, lablWorkShift, lablHireDate, lablWorkType, lablDepartment, lablQualification,
      lablExperience, lablWorkingHours, outLbl;
  JTextField txtId, textFirstName, txtLastName, txtAge, txtGender, txtAddress, txtContact, txtEmail, txtSalary,
      txtCommission, txtJobTitle, txtWorkShift, txtHireDate, txtWorkType, txtDepartment, txtQualification,
      txtExperience, txtWorkingHours, annualSalaryField, output;
  JButton Add, View, calculateSalary;

  public StaffGUI() {
    JFrame frame = new JFrame("STAFF FORM");
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
    lablSalary = new JLabel("Salary");
    lablSalary.setBounds(20, 230, 100, 20);
    frame.add(lablSalary);
    txtSalary = new JTextField();
    txtSalary.setBounds(150, 230, 100, 20);
    frame.add(txtSalary);
    lablCommission = new JLabel("Commission");
    lablCommission.setBounds(20, 260, 100, 20);
    frame.add(lablCommission);
    txtCommission = new JTextField();
    txtCommission.setBounds(150, 260, 100, 20);
    frame.add(txtCommission);
    lablJobTitle = new JLabel("Job Title");
    lablJobTitle.setBounds(20, 290, 100, 20);
    frame.add(lablJobTitle);
    txtJobTitle = new JTextField();
    txtJobTitle.setBounds(150, 290, 100, 20);
    frame.add(txtJobTitle);
    lablWorkShift = new JLabel("Work Shift");
    lablWorkShift.setBounds(20, 320, 100, 20);
    frame.add(lablWorkShift);
    txtWorkShift = new JTextField();
    txtWorkShift.setBounds(150, 320, 100, 20);
    frame.add(txtWorkShift);
    lablHireDate = new JLabel("Hire Date");
    lablHireDate.setBounds(20, 350, 100, 20);
    frame.add(lablHireDate);
    txtHireDate = new JTextField();
    txtHireDate.setBounds(150, 350, 100, 20);
    frame.add(txtHireDate);
    lablWorkType = new JLabel("Work Type");
    lablWorkType.setBounds(20, 380, 100, 20);
    frame.add(lablWorkType);
    txtWorkType = new JTextField();
    txtWorkType.setBounds(150, 380, 100, 20);
    frame.add(txtWorkType);
    lablDepartment = new JLabel("Department");
    lablDepartment.setBounds(20, 410, 100, 20);
    frame.add(lablDepartment);
    txtDepartment = new JTextField();
    txtDepartment.setBounds(150, 410, 100, 20);
    frame.add(txtDepartment);
    lablQualification = new JLabel("Qualification");
    lablQualification.setBounds(20, 440, 100, 20);
    frame.add(lablQualification);
    txtQualification = new JTextField();
    txtQualification.setBounds(150, 440, 100, 20);
    frame.add(txtQualification);
    lablExperience = new JLabel("Experience");
    lablExperience.setBounds(20, 470, 100, 20);
    frame.add(lablExperience);
    txtExperience = new JTextField();
    txtExperience.setBounds(150, 470, 100, 20);
    frame.add(txtExperience);
    lablWorkingHours = new JLabel("Working Hours");
    lablWorkingHours.setBounds(20, 500, 100, 20);
    frame.add(lablWorkingHours);
    txtWorkingHours = new JTextField();
    txtWorkingHours.setBounds(150, 500, 100, 20);
    frame.add(txtWorkingHours);

    lablAge = new JLabel("Age");
    lablAge.setBounds(20, 520, 100, 20);
    frame.add(lablAge);
    txtAge = new JTextField();
    txtAge.setBounds(150, 520, 100, 20);
    frame.add(txtAge);
    Add = new JButton("Add");
    Add.setBounds(100, 540, 100, 20);
    frame.add(Add);
    Add.addActionListener(this);
    View = new JButton("View");
    View.setBounds(200, 540, 100, 20);
    frame.add(View);
    View.addActionListener(this);
    calculateSalary = new JButton("Calculate salary");
    calculateSalary.setBounds(300, 540, 150, 20);
    frame.add(calculateSalary);
    calculateSalary.addActionListener(this);
    annualSalaryField = new JTextField();
    annualSalaryField.setBounds(450, 540, 100, 20);
    frame.add(annualSalaryField);
    outLbl = new JLabel("output");
    outLbl.setBounds(20, 570, 500, 20);
    frame.add(outLbl);
    output = new JTextField();
    output.setBounds(150, 570, 500, 80);
    frame.add(output);

    frame.setVisible(true);

  }

  Staff staff;

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == Add) {
      staff = new Staff(
          Integer.parseInt(txtId.getText()), textFirstName.getText(), txtLastName.getText(),
          Integer.parseInt(txtAge.getText()), txtContact.getText(), txtGender.getText(), txtAddress.getText(),
          txtEmail.getText(), Double.parseDouble(txtSalary.getText()), Double.parseDouble(txtCommission.getText()),
          txtJobTitle.getText(), txtWorkShift.getText(), txtHireDate.getText(), txtWorkType.getText(),
          txtDepartment.getText(), txtQualification.getText(), txtExperience.getText(), txtWorkingHours.getText());
      s1.add(staff);
    } else if (e.getSource() == calculateSalary) {
        String s1 = txtSalary.getText();
        int salary = Integer.parseInt(s1);
        int annualSalary = salary * 12;
        String result = String.valueOf(annualSalary);
        annualSalaryField.setText(result);}
    else if (e.getSource() == View) {
      output.setText(s1.toString());
    }

  }

}
