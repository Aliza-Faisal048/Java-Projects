/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelsystem;

import java.util.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 public class GymGUI implements ActionListener{
    ArrayList<Gym> g1 = new ArrayList<Gym>();
    JLabel lablId, lablServicePrice, lablTimming, lablMembershipType, lablEquipmentsAvailable, lablTrainerAvailable, lablSubscriptionFee, outLbl;
    JTextField txtId, txtServicePrice, txtTimming, txtMembershipType, txtEquipmentsAvailable, txtTrainerAvailable, txtSubscriptionFee, output;
    JButton Add, View;
    public GymGUI(){
      JFrame frame = new JFrame("Gym Form");
      frame.setSize(1000, 700);
      frame.setLayout(null);
      frame.setLocation(200, 100);
      lablId = new JLabel("ID");
      lablId.setBounds(20, 20, 100, 20);
      frame.add(lablId);
      txtId = new JTextField();
      txtId.setBounds(150, 20, 100, 20);
      frame.add(txtId);
      lablServicePrice = new JLabel("Service Price");
      lablServicePrice.setBounds(20, 50, 100, 20);
      frame.add(lablServicePrice);
      txtServicePrice = new JTextField();
      txtServicePrice.setBounds(150, 50, 100, 20);
      frame.add(txtServicePrice);
      lablTimming = new JLabel("Timming");
      lablTimming.setBounds(20, 80, 100, 20);
      frame.add(lablTimming);
      txtTimming = new JTextField();
      txtTimming.setBounds(150, 80, 100, 20);

      frame.add(txtTimming);
      lablMembershipType = new JLabel("Membership Type");
      lablMembershipType.setBounds(20, 110, 100, 20);
      frame.add(lablMembershipType);
      txtMembershipType = new JTextField();
      txtMembershipType.setBounds(150, 110, 100, 20);
      frame.add(txtMembershipType);
      lablEquipmentsAvailable = new JLabel("Equipments Available");
      lablEquipmentsAvailable.setBounds(20, 140, 100, 20);
      frame.add(lablEquipmentsAvailable);
      txtEquipmentsAvailable = new JTextField();
      txtEquipmentsAvailable.setBounds(150, 140, 100, 20);
      frame.add(txtEquipmentsAvailable);
      lablTrainerAvailable = new JLabel("Trainer Available");
      lablTrainerAvailable.setBounds(20, 170, 100, 20);
      frame.add(lablTrainerAvailable);
      txtTrainerAvailable = new JTextField();
      txtTrainerAvailable.setBounds(150, 170, 100, 20);
      frame.add(txtTrainerAvailable);
      lablSubscriptionFee = new JLabel("Subscription Fee");
      lablSubscriptionFee.setBounds(20, 200, 100, 20);
      frame.add(lablSubscriptionFee);
      txtSubscriptionFee = new JTextField();
      txtSubscriptionFee.setBounds(150, 200, 100, 20);
      frame.add(txtSubscriptionFee);
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
    Gym gym;
    public void actionPerformed(ActionEvent e){
      if (e.getSource() == Add){
        gym = new Gym(Integer.parseInt(txtId.getText()), Double.parseDouble(txtServicePrice.getText()), txtTimming.getText(), txtMembershipType.getText(), txtEquipmentsAvailable.getText(), txtTrainerAvailable.getText(), Integer.parseInt(txtSubscriptionFee.getText()));
        g1.add(gym);
      }
   else if (e.getSource() == View){
        output.setText(g1.toString());
   }
    }
 }
