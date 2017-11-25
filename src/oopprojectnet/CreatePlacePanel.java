/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectnet;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author zmcdo
 */
public class CreatePlacePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePlacePanel
     */
    public CreatePlacePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    String[] placesType = {"garden", "sportsfield", "exhibitions", "pubs"};
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPlace = new javax.swing.JLabel();
        placeName = new javax.swing.JTextField();
        placeType = new javax.swing.JComboBox<>(placesType);
        labelPlaceType = new javax.swing.JLabel();
        placeCreateBtn = new javax.swing.JButton();
        placeClearBtn = new javax.swing.JButton();
        placeBackBtn = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        additional1 = new javax.swing.JLabel();
        additional2 = new javax.swing.JLabel();
        additionalText1 = new javax.swing.JTextField();
        additionalText2 = new javax.swing.JTextField();
        coordsLabel = new javax.swing.JLabel();
        placeCoords = new javax.swing.JTextField();

        labelPlace.setText("Name:");

        placeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeNameActionPerformed(evt);
            }
        });

        placeType.setModel(new javax.swing.DefaultComboBoxModel<>(placesType));
        placeType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placeTypeMouseClicked(evt);
            }
        });
        placeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeTypeActionPerformed(evt);
            }
        });

        labelPlaceType.setText("Type:");

        placeCreateBtn.setText("Create");
        placeCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeCreateBtnActionPerformed(evt);
            }
        });

        placeClearBtn.setText("Clear");

        placeBackBtn.setText("Back");

        additional1.setText("Garden Area:");

        additionalText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionalText1ActionPerformed(evt);
            }
        });

        coordsLabel.setText("Coords:");

        placeCoords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeCoordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(placeCreateBtn)
                                .addGap(48, 48, 48)
                                .addComponent(placeClearBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(placeBackBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPlaceType)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(placeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 211, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(additional1)
                                            .addComponent(additional2))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(additionalText2)
                                            .addComponent(additionalText1)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(coordsLabel)
                            .addComponent(labelPlace))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(placeName)
                            .addComponent(placeCoords, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlace)
                    .addComponent(placeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coordsLabel)
                    .addComponent(placeCoords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaceType)
                    .addComponent(placeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additional1)
                    .addComponent(additionalText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additional2)
                    .addComponent(additionalText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeCreateBtn)
                    .addComponent(placeClearBtn)
                    .addComponent(placeBackBtn))
                .addGap(33, 33, 33))
        );

        ItemListener itemListenerPlaceType = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                String item = (String) evt.getItem();
                switch (item) {
                    case "garden":
                    additional1.setText("Garden Area: ");
                    break;
                    case "sportsfield":
                    additional1.setText("SportsField type of sport: ");
                    break;
                    case "exhibitions":
                    additional1.setText("Exhibition's art's type: ");
                    additional2.setText("Exhibition's price: ");
                    break;
                    case "pubs":
                    additional1.setText("Pub's capacity: ");
                    additional2.setText("Pub's minimum input: ");
                    break;
                }
            }
        };
        placeType.addItemListener(itemListenerPlaceType);
    }// </editor-fold>//GEN-END:initComponents

    private void placeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeNameActionPerformed
    

    private void placeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeTypeActionPerformed

    private void placeTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeTypeMouseClicked

    }//GEN-LAST:event_placeTypeMouseClicked

    private void additionalText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionalText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_additionalText1ActionPerformed

    private void placeCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeCreateBtnActionPerformed
try {
            if("".equals(placeName.getText()) || "".equals(new String(additionalText1.getText())) || "".equals(new String(placeCoords.getText()))) {
                JOptionPane.showMessageDialog(null, "you need to input the place's info", "error", JOptionPane.ERROR_MESSAGE);

            }
            else {
                String name = placeName.getText();
                String type = (String) placeType.getSelectedItem();
                String coords = placeCoords.getText();
                String additional1, additional2;
                Places newPlace = null;
                switch (type) {
                    case "garden": 
                        additional1 = additionalText1.getText();
                        newPlace = new Gardens(coords, name, additional1);
                        break;
                    case "sportsfield": 
                        additional1 = additionalText1.getText();
                        newPlace = new SportsField(coords, name, additional1);
                        break;
                    case "exhibitions": 
                        additional1 = additionalText1.getText();
                        additional2 = additionalText2.getText();
                        newPlace = new Exhibitions(coords, name, additional1, additional2);
                        break;
                    case "pubs":
                        additional1 = additionalText1.getText();
                        additional2 = additionalText2.getText();
                        newPlace = new Pubs(coords, name, additional1, additional2, null);
                        break;
                }
                if(newPlace != null) {
                    System.out.println(newPlace);
                    Database.listPlaces.add(newPlace);
                }
                Object[] options = { "OK", "CANCEL" };
                Object optionSelected = JOptionPane.showOptionDialog(null, type + " created, Click OK to go back to program's menu and CANCEL to create another", "success",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, options, options[0]);

                switch (optionSelected.toString()){
                    case "0":
                        Component comp = SwingUtilities.getRoot(this);
                        ((Window) comp).dispose();
                        break;
                    case "1":
                        placeName.setText(null);
                        placeCoords.setText(null);
                        additionalText1.setText(null);
                        additionalText2.setText(null);
                        break;
                }
            }

        }
        catch(NumberFormatException e) {
            placeName.setText(null);
            placeCoords.setText(null);
            additionalText1.setText(null);
            additionalText2.setText(null);

        }
    }//GEN-LAST:event_placeCreateBtnActionPerformed

    private void placeCoordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeCoordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeCoordsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel additional1;
    private javax.swing.JLabel additional2;
    private javax.swing.JTextField additionalText1;
    private javax.swing.JTextField additionalText2;
    private javax.swing.JLabel coordsLabel;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelPlace;
    private javax.swing.JLabel labelPlaceType;
    private javax.swing.JButton placeBackBtn;
    private javax.swing.JButton placeClearBtn;
    private javax.swing.JTextField placeCoords;
    private javax.swing.JButton placeCreateBtn;
    private javax.swing.JTextField placeName;
    private javax.swing.JComboBox<String> placeType;
    // End of variables declaration//GEN-END:variables
}