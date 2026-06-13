/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritancepractice;

public class Student {

    public Student(int id, String name, int age) {
        setId(id);
        setName(name);
        this.age = age;
        setAge(age);
    }
    private int id;
    private String name;
    private int age;

    public void setAge(int age) {
        if(age > 0){ 
        this.age = age;
        }
        else {
            System.out.println("Age can't be negative. Default age is 0!");
        }
    }
    
    public int getAge(){
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
