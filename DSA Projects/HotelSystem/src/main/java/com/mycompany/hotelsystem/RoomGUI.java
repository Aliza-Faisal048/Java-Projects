
package com.mycompany.hotelsystem;
import java.util.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RoomGUI implements ActionListener{
  ArrayList<Rooms> r1 = new ArrayList<Rooms>();
  JLabel lablAvailability, lablServiceDescription, lablServiceDuration, lablRoomNo, lablNoOfBeds, lablRoomStatus, lablRoomFacilities, outLbl;
  JTextField txtAvailability, txtServiceDescription, txtServiceDuration, txtRoomNo, txtNoOfBeds, txtRoomStatus, txtRoomFacilities, output;
  JButton Add, View;
public RoomGUI(){
  JFrame frame = new JFrame("ROOM FORM");
  frame.setSize(1000, 700);
  frame.setLayout(null);
  frame.setLocation(200, 100);
  lablAvailability = new JLabel("Availability");
  lablAvailability.setBounds(20, 20, 100, 20);
  frame.add(lablAvailability);
  txtAvailability = new JTextField();
  txtAvailability.setBounds(150, 20, 100, 20);
  frame.add(txtAvailability);
  lablServiceDescription = new JLabel("Service Description");
  lablServiceDescription.setBounds(20, 50, 100, 20);
  frame.add(lablServiceDescription);
  txtServiceDescription = new JTextField();
  txtServiceDescription.setBounds(150, 50, 100, 20);
  frame.add(txtServiceDescription);
  lablServiceDuration = new JLabel("Service Duration");
  lablServiceDuration.setBounds(20, 80, 100, 20);
  frame.add(lablServiceDuration);
  txtServiceDuration = new JTextField();
  txtServiceDuration.setBounds(150, 80, 100, 20);
  frame.add(txtServiceDuration);
  lablRoomNo = new JLabel("Room No");
  lablRoomNo.setBounds(20, 110, 100, 20);
  frame.add(lablRoomNo);
  txtRoomNo = new JTextField();
  txtRoomNo.setBounds(150, 110, 100, 20);
  frame.add(txtRoomNo);
  lablNoOfBeds = new JLabel("No Of Beds");
  lablNoOfBeds.setBounds(20, 140, 100, 20);
  frame.add(lablNoOfBeds);
  txtNoOfBeds = new JTextField();
  txtNoOfBeds.setBounds(150, 140, 100, 20);
  frame.add(txtNoOfBeds);
  lablRoomStatus = new JLabel("Room Status");
  lablRoomStatus.setBounds(20, 170, 100, 20);
  frame.add(lablRoomStatus);
  txtRoomStatus = new JTextField();
  txtRoomStatus.setBounds(150, 170, 100, 20);
  frame.add(txtRoomStatus);
  lablRoomFacilities = new JLabel("Room Facilities");
  lablRoomFacilities.setBounds(20, 200, 100, 20);
  frame.add(lablRoomFacilities);
  txtRoomFacilities = new JTextField();
  txtRoomFacilities.setBounds(150, 200, 100, 20);
  frame.add(txtRoomFacilities);
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
  Rooms rooms;
  public void actionPerformed(ActionEvent e){
    if (e.getSource() == Add){
      rooms = new Rooms(txtAvailability.getText(), txtServiceDescription.getText(), Integer.parseInt(txtServiceDuration.getText()), Integer.parseInt(txtRoomNo.getText()), Integer.parseInt(txtNoOfBeds.getText()), txtRoomStatus.getText(), txtRoomFacilities.getText());
      r1.add(rooms);
      
    }
    else if (e.getSource() == View){
      output.setText(r1.toString());
    }
  }
  
}
