/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelsystem;
import java.util.*;
import javax.swing.*;

public class Gym {
  JFrame frame=new JFrame("Gym Form");
  int id;
  double servicePrice;
  String timming;
  String membershipType;
  String equipmentsAvailable;
  String trainerAvailable;
  int subscriptionFee;
  public Gym(int id, double servicePrice, String timming, String membershipType, String equipmentsAvailable, String trainerAvailable, int subscriptionFee){
    setId(id);
    setServicePrice(servicePrice);
    setTimming(timming);
    setMembershipType(membershipType);
    setEquipmentsAvailable(equipmentsAvailable);
    setTrainerAvailable(trainerAvailable);
    setSubscriptionFee(subscriptionFee);
  }
  
  public void setId(int id) {
    this.id = id;
  }
  public int getId() {
    return id;
  }
  public void setServicePrice(double servicePrice) {
    this.servicePrice = servicePrice;
  }
  public double getServicePrice() {
    return servicePrice;
  }
 public void setTimming(String timming) {
    this.timming = timming;
  }
  public String getTimming() {
    return timming;
  }
  public void setMembershipType(String membershipType) {
    this.membershipType = membershipType;
  }
  public String getMembershipType() {
    return membershipType;
  }
  public void setEquipmentsAvailable(String equipmentsAvailable) {
    this.equipmentsAvailable = equipmentsAvailable;
  }
  public String getEquipmentsAvailable() {
    return equipmentsAvailable;
  }
  public void setTrainerAvailable(String trainerAvailable) {
    this.trainerAvailable = trainerAvailable;
  }
  public String getTrainerAvailable() {
    return trainerAvailable;
  }
  public void setSubscriptionFee(int subscriptionFee) {
    this.subscriptionFee = subscriptionFee;
  }
  public int getSubscriptionFee() {
    return subscriptionFee;
  
  }
  public String toString(){
    return "Gym [id=" + id + ", servicePrice=" + servicePrice + ", timming=" + timming + ", membershipType=" + membershipType + ", equipmentsAvailable=" + equipmentsAvailable + ", trainerAvailable=" + trainerAvailable + ", subscriptionFee=" + subscriptionFee + ", staff="  + "]";
  }
  }
  

