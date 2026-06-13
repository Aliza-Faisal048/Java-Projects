package com.mycompany.hotelsystem;

import javax.swing.*;
import java.awt.event.*;

public class MainMenu implements ActionListener {
  JFrame frame;
  JLabel label;
 JButton staffbtn, guestbtn, transportbtn, gymbtn, roombtn;

  public MainMenu() {
    frame = new JFrame("Main Menu");
    frame.setSize(600, 600);
    frame.setLayout(null);
    frame.setLocation(100, 100);
    label = new JLabel("Main Menu");
    label.setBounds(20, 20, 100, 20);
    frame.add(label);
    staffbtn = new JButton("Staff");
    staffbtn.setBounds(100, 100, 100, 20);  
    frame.add(staffbtn);
    staffbtn.addActionListener(this);
    guestbtn = new JButton("Guest");
    guestbtn.setBounds(100, 150, 100, 20);
    frame.add(guestbtn);
    guestbtn.addActionListener(this);
    transportbtn = new JButton("Transport");
    transportbtn.setBounds(100, 200, 100, 20);
    frame.add(transportbtn);
    transportbtn.addActionListener(this);
    gymbtn = new JButton("Gym");
    gymbtn.setBounds(100, 250, 100, 20);
    frame.add(gymbtn);
    gymbtn.addActionListener(this);
    roombtn = new JButton("Room");
    roombtn.setBounds(100, 300, 100, 20);
    frame.add(roombtn);
    roombtn.addActionListener(this);
    frame.setVisible(true);
    
  }
  public void actionPerformed(ActionEvent e){
    if (e.getSource() == staffbtn){
      new StaffGUI();
    }
    else if (e.getSource() == guestbtn){
      new GuestGUI();
    }
    else if (e.getSource() == transportbtn){
      new TransportGUI();
    }
     
        else if (e.getSource() == roombtn){
          new RoomGUI();
        }
    else if(e.getSource() == gymbtn){
      new GymGUI();
    }
  }
  

}
