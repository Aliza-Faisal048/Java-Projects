/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelsystem;


import javax.swing.*;

class Staff extends person {

  double salary;
  double commission;
  String jobTitle;
  String workShift;
  String hireDate;
  String workType;
  String department;
  String qualification;
  String experience;
  String workingHours;

  // constructor
  public Staff(int id, String firstName, String lastName, int age, String contactNo, String gender, String address,
      String email, double salary, double commission, String jobTitle, String workShift, String hireDate,
      String workType, String department, String qualification, String experience, String workingHours) {

    super(id, firstName, lastName, age, contactNo, gender, address, email);
    setSalary(salary);
    setCommission(commission);
    setJobTitle(jobTitle);
    setWorkShift(workShift);
    setHireDate(hireDate);
    setWorkType(workType);
    setDepartment(department);
    setQualification(qualification);
    setExperience(experience);
    setWorkingHours(workingHours);

  }


  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setCommission(double commission) {
    this.commission = commission;
  }

  public double getCommission() {
    return commission;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setWorkShift(String workShift) {
    this.workShift = workShift;
  }

  public String getWorkShift() {
    return workShift;
  }

  public void setHireDate(String hireDate) {
    this.hireDate = hireDate;
  }

  public String getHireDate() {
    return hireDate;
  }

  public void setWorkType(String workType) {
    this.workType = workType;
  }

  public String getWorkType() {
    return workType;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getDepartment() {
    return department;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public String getQualification() {
    return qualification;
  }

  public void setExperience(String experience) {
    this.experience = experience;
  }

  public String getExperience() {
    return experience;
  }

  public void setWorkingHours(String workingHours) {
    this.workingHours = workingHours;
  }

  public String getWorkingHours() {
    return workingHours;
  }

  public String toString() {
    return "Staff [salary=" + salary + ", commission=" + commission + ", jobTitle=" + jobTitle + ", workShift="
        + workShift + ", hireDate=" + hireDate + ", workType=" + workType + ", department=" + department
        + ", qualification=" + qualification + ", experience=" + experience + ", workingHours=" + workingHours + "]";
  }

 
}


