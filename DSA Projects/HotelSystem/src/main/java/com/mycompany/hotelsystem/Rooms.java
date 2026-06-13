package com.mycompany.hotelsystem;
import java.util.*;
import javax.swing.*;
public class Rooms {
  JFrame frame=new JFrame("Rooms Form");
  String availability;
  String serviceDescription;
  int serviceDuration;
  int roomNo;
  int noOfBeds;
  String roomStatus;
  String roomFacilities;

  public Rooms(String availability, String serviceDescription, int serviceDuration, int roomNo, int noOfBeds,
      String roomStatus, String roomFacilities) {
    setAvailability(availability);
    setServiceDescription(serviceDescription);
    setServiceDuration(serviceDuration);
    setRoomNo(roomNo);
    setNoOfBeds(noOfBeds);
    setRoomStatus(roomStatus);
    setRoomFacilities(roomFacilities);
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public String getAvailability() {
    return availability;
  }

  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }

  public String getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDuration(int serviceDuration) {
    this.serviceDuration = serviceDuration;
  }

  public int getServiceDuration() {
    return serviceDuration;
  }

  public void setRoomNo(int roomNo) {
    this.roomNo = roomNo;
  }

  public int getRoomNo() {
    return roomNo;
  }

  public void setNoOfBeds(int noOfBeds) {
    this.noOfBeds = noOfBeds;
  }

  public int getNoOfBeds() {
    return noOfBeds;
  }

  public void setRoomStatus(String roomStatus) {
    this.roomStatus = roomStatus;
  }

  public String getRoomStatus() {
    return roomStatus;
  }

  public void setRoomFacilities(String roomFacilities) {
    this.roomFacilities = roomFacilities;
  }

  public String getRoomFacilities() {
    return roomFacilities;
  }


  public String toString() {
    return "Room [availability=" + availability + ", serviceDescription=" + serviceDescription + ", serviceDuration="
        + serviceDuration + ", roomNo=" + roomNo + ", noOfBeds=" + noOfBeds + ", roomStatus=" + roomStatus
        + ", roomFacilities=" + roomFacilities +  "]";
  }
}
