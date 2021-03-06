/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectnet;

import java.awt.Component;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

/**
 *
 * @author zmcdo
 */
public class DeletePersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeletePersonPanel
     */
    public DeletePersonPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();
        personDeleteBtn = new javax.swing.JButton();
        personClearBtn = new javax.swing.JButton();
        personBackBtn = new javax.swing.JButton();
        personToDelete = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        peopleList = new javax.swing.JList<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelName.setText("Name:");
        add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 57, -1, -1));

        personDeleteBtn.setText("Delete");
        personDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personDeleteBtnActionPerformed(evt);
            }
        });
        add(personDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 280, -1, -1));

        personClearBtn.setText("Clear");
        personClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personClearBtnActionPerformed(evt);
            }
        });
        add(personClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 280, -1, -1));

        personBackBtn.setText("Back");
        personBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personBackBtnActionPerformed(evt);
            }
        });
        add(personBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 280, -1, -1));

        personToDelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                personToDeleteKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                personToDeleteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                personToDeleteKeyReleased(evt);
            }
        });
        add(personToDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 138, -1));

        peopleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getListNamePeople(personToDelete.getText());
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(peopleList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 96, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void personToDeleteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personToDeleteKeyTyped
        /*jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getListNamePlaces(personToDelete.getText());
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);*/
    }//GEN-LAST:event_personToDeleteKeyTyped

    private void personToDeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personToDeleteKeyPressed

    }//GEN-LAST:event_personToDeleteKeyPressed

    private void personToDeleteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personToDeleteKeyReleased
        peopleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getListNamePeople(personToDelete.getText());
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(peopleList);        // TODO add your handling code here:
    }//GEN-LAST:event_personToDeleteKeyReleased

    private void personClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personClearBtnActionPerformed
        personToDelete.setText("");
        peopleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getListNamePeople(personToDelete.getText());
            @Override
            public int getSize() { return strings.length; }
            @Override
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(peopleList);
    }//GEN-LAST:event_personClearBtnActionPerformed

    private void personDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personDeleteBtnActionPerformed
        if(peopleList.getSelectedIndex() >=0){
            for(Places i:Database.listPlaces) {
                if(i.getClass().toString().toLowerCase().equals("class oopprojectnet.pubs")) {
                    ((Pubs)i).removePerson(Database.getPersonFromName(peopleList.getSelectedValue()));
                }
            }
            for(Event e:Database.listEvents) {
                e.removePerson(Database.getPersonFromName(peopleList.getSelectedValue()));
            }
            Database.listPeople.remove(Database.getPersonFromName(peopleList.getSelectedValue()));
            peopleList.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = getListNamePeople(personToDelete.getText());
                @Override
                public int getSize() { return strings.length; }
                @Override
                public String getElementAt(int i) { return strings[i]; }
            });
            jScrollPane1.setViewportView(peopleList);
        }
    }//GEN-LAST:event_personDeleteBtnActionPerformed

    private void personBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personBackBtnActionPerformed
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
    }//GEN-LAST:event_personBackBtnActionPerformed
    
    private String stringSlice(int a, int b, String s) {
        String res= "";
        for (int i=a; i<=b; i++) {
            res = res + s.charAt(i);
        }
        return res;
    }

    private String[] getListNamePeople(String search) {
        ArrayList < String > list;
        list = new ArrayList <> ();
        for (Person p: Database.listPeople) {
            if(search.length() != 0){
                if(search.length() <= p.getName().length() && stringSlice(0, search.length()-1, p.getName()).equals(search)) {
                    list.add(p.getName());
                }
            }
            else {
                list.add(p.getName());
            }
        }
        String[] temp = new String[list.size()];
        temp = list.toArray(temp);
        return temp;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelName;
    private javax.swing.JList<String> peopleList;
    private javax.swing.JButton personBackBtn;
    private javax.swing.JButton personClearBtn;
    private javax.swing.JButton personDeleteBtn;
    private javax.swing.JTextField personToDelete;
    // End of variables declaration//GEN-END:variables
}
