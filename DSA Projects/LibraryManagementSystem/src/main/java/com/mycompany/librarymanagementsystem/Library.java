/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
import java.util.*;
public class Library {

    @Override
    public String toString() {
        return "Library{" + "name=" + name + ", branches=" + branches + '}';
    }

    public Library(String name, ArrayList<branch> branches) {
        this.name = name;
        this.branches = branches;
    }
    private String name;
    private ArrayList<branch> branches = new ArrayList<>();

    public ArrayList<branch> getBranches() {
        return branches;
    }
}
