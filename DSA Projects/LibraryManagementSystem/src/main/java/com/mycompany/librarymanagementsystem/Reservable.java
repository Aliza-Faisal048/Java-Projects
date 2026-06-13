/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

public interface Reservable {
    void reserve(String name);
    void cancelReservation();
    boolean isReserved();
}
