
package com.mycompany.hotelsystem;

public class person {

    
  int id;
  String firstName;
  String lastName;
  int age;
  String contactNo;
  String gender;
  String address;
  String email;
public person(int id, String firstName, String lastName, int age, String contactNo, String gender, String address, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.contactNo = contactNo;
        this.gender = gender;
        this.address = address;
        this.email = email;
    }
  public void setId(int id) {
    this.id=id;
  }
  public int getId() {
    return id;
  }
 public void setFirstName(String firstName) {
    this.firstName=firstName;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setLastName(String lastName) {
    this.lastName=lastName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setAge(int age) {
    this.age=age;
  }
  public int getAge() {
    return age;
  }
    public void setContactNo(String contactNo) {
   this.contactNo=contactNo;
  }
  public String getContactNo() {
    return contactNo;
  }
  public void setGender(String gender) {
   this.gender=gender;
  }
  public String getGender() {
    return gender;
  }
  public void setAddress(String address) {
   this.address=address;
  }
  public String getAddress() {
    return address;
  }
  public void setEmail(String email) {
   this.email=email;
  }
  public String getEmail() {
    return email;
  }
}
