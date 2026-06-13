
package com.mycompany.hotelsystem;

import java.util.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TransportGUI implements ActionListener {
  ArrayList<Transport> t1 = new ArrayList<Transport>();
  JLabel lablID, lablAvailability, lablServiceDuration, lablTimming, lablDestination, lablVehicleType, lablRouteName, lablDriverName, lablCost,outLbl;
  JTextField txtID, txtAvailability, txtServiceDuration, txtTimming, txtDestination, txtVehicleType, txtRouteName, txtDriverName, txtCost, output;
  JButton Add, View;
  public TransportGUI(){
    JFrame frame = new JFrame("Transport Form");
    frame.setSize(1000, 700);
    frame.setLayout(null);
    frame.setLocation(200, 100);
    lablID = new JLabel("ID");
    lablID.setBounds(20, 20, 100, 20);
    frame.add(lablID);
    txtID = new JTextField();
    txtID.setBounds(150, 20, 100, 20);
    frame.add(txtID);
    lablAvailability = new JLabel("Availability");
    lablAvailability.setBounds(20, 50, 100, 20);
    frame.add(lablAvailability);
    txtAvailability = new JTextField();
    txtAvailability.setBounds(150, 50, 100, 20);
    frame.add(txtAvailability);
    lablServiceDuration = new JLabel("Service Duration");
    lablServiceDuration.setBounds(20, 80, 100, 20);
    frame.add(lablServiceDuration);
    txtServiceDuration = new JTextField();
    txtServiceDuration.setBounds(150, 80, 100, 20);
    frame.add(txtServiceDuration);
    lablTimming = new JLabel("Timming");
    lablTimming.setBounds(20, 110, 100, 20);
    frame.add(lablTimming);
    txtTimming = new JTextField();
    txtTimming.setBounds(150, 110, 100, 20);
    frame.add(txtTimming);
    lablDestination = new JLabel("Destination");
    lablDestination.setBounds(20, 140, 100, 20);
    frame.add(lablDestination);
    txtDestination = new JTextField();
    txtDestination.setBounds(150, 140, 100, 20);
    frame.add(txtDestination);
    lablVehicleType = new JLabel("Vehicle Type");
    lablVehicleType.setBounds(20, 170, 100, 20);
    frame.add(lablVehicleType);
    txtVehicleType = new JTextField();
    txtVehicleType.setBounds(150, 170, 100, 20);
    frame.add(txtVehicleType);
    lablRouteName = new JLabel("Route Name");
    lablRouteName.setBounds(20, 200, 100, 20);
    frame.add(lablRouteName);
    txtRouteName = new JTextField();
    txtRouteName.setBounds(150, 200, 100, 20);
    frame.add(txtRouteName);
    lablDriverName = new JLabel("Driver Name");
    lablDriverName.setBounds(20, 230, 100, 20);
    frame.add(lablDriverName);
    txtDriverName = new JTextField();
    txtDriverName.setBounds(150, 230, 100, 20);
    frame.add(txtDriverName);
    lablCost = new JLabel("Cost");
    lablCost.setBounds(20, 260, 100, 20);
    frame.add(lablCost);
    txtCost = new JTextField();
    txtCost.setBounds(150, 260, 100, 20);
    frame.add(txtCost);
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
  Transport transport;
  public void actionPerformed(ActionEvent e){
    if (e.getSource() == Add){
      transport = new Transport(Integer.parseInt(txtID.getText()), txtAvailability.getText(), txtServiceDuration.getText(), txtTimming.getText(), txtDestination.getText(), txtVehicleType.getText(), txtRouteName.getText(), txtDriverName.getText(), Double.parseDouble(txtCost.getText()));
      t1.add(transport);
    }
    else if (e.getSource() == View){
      output.setText(t1.toString());
    }
  }
}

