
package com.mycompany.hotelsystem;

import java.util.ArrayList;
import javax.swing.*;

public class Transport  {
  JFrame frame = new JFrame("Transport Form");
   int ID;
    String availability;
    String serviceDuration;
   String timming;
  String destination;
    String vehicleType; 
   String routeName; 
   String driverName; 
    double cost;
  public Transport(int ID, String availability, String serviceDuration, String timming, String destination, String vehicleType, String routeName, String driverName, double cost){
    setID(ID);
    setAvailability(availability);
    setServiceDuration(serviceDuration);
    setTimming(timming);
    setDestination(destination);
    setVehicleType(vehicleType);
    setRouteName(routeName);
    setDriverName(driverName);
    setCost(cost);
    
  }

  public void setID(int ID){
    this.ID=ID;
  }
  public int getID(){
    return ID;
  }
  public void setAvailability(String availability){
    this.availability=availability;
  }
  public String getAvailability(){
  return availability;
  }
  public void setServiceDuration(String serviceDuration){
    this.serviceDuration=serviceDuration;
  }
  public String getServiceDuration(){
  return serviceDuration;
  }
  public void setTimming(String timming){
    this.timming=timming;
  }
  public String getTimming(){
    return timming;
  }
  public void setDestination(String destination){
    this.destination=destination;
  }
  public String getDestination(){
    return destination;
  }

  public void setCost(double cost){
    this.cost=cost;
  }
  public double getCost(){
  return cost;
  }
  public void setVehicleType(String vehicleType){
    this.vehicleType=vehicleType;
  }
  public String getVehicleType(){
    return vehicleType;
  }
  public void setRouteName(String routeName){
    this.routeName=routeName;
  }
  public String getRouteName(){
    return routeName;
  }
  public void setDriverName(String driverName){
    this.driverName=driverName;
  }
  public String getDriverName(){
    return driverName;
  }

  public String toString(){
    return "Transport [ID=" + ID + ", availability=" + availability + ", serviceDuration=" + serviceDuration + ", timming=" + timming + ", destination=" + destination + ", vehicleType=" + vehicleType + ", routeName=" + routeName + ", driverName=" + driverName + ", cost=" + cost +  "]";
  }
}
