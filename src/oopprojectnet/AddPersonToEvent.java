/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectnet;

import java.awt.Component;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author zmcdo
 */
public class AddPersonToEvent extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonToEvent
     */
    public AddPersonToEvent() {
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

        AddPersonBtn = new javax.swing.JButton();
        personToAdd = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        personAddBackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPeopleList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        availablePlaces = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        chosenPlacesList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventList = new javax.swing.JList<>();
        eventName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numberOfPeople = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        capacity = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddPersonBtn.setText("Add");
        AddPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonBtnActionPerformed(evt);
            }
        });
        add(AddPersonBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 642, -1, -1));

        personToAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                personToAddKeyReleased(evt);
            }
        });
        add(personToAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 66, 100, -1));

        labelName.setText("Person name:");
        add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 69, -1, -1));

        personAddBackBtn.setText("Back");
        personAddBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personAddBackBtnActionPerformed(evt);
            }
        });
        add(personAddBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, -1, -1));

        jLabel1.setText("Select a maximum of 5 places:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 372, -1, -1));

        listPeopleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getListNamePeople(personToAdd.getText());
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listPeopleList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPeopleListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPeopleList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 46, -1, -1));

        availablePlaces.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getEventPlaces();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        availablePlaces.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availablePlacesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(availablePlaces);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 458, 185, -1));

        chosenPlacesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getChosenPlaces();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(chosenPlacesList);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 458, 185, -1));

        jLabel2.setText("Available Places:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 429, -1, -1));

        jLabel3.setText("Choosen Places:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 429, -1, -1));

        addButton.setText("Add >>");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 458, 119, -1));

        removeButton.setText("<< Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 559, -1, -1));

        eventList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getListNameEvents("");
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        eventList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eventListMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(eventList);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 243, -1, 105));

        eventName.setText("Event name:");
        add(eventName, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 243, -1, -1));

        jLabel4.setText("Number of people:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        numberOfPeople.setText("0");
        add(numberOfPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 110, -1));

        jLabel6.setText("Capacity:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));

        capacity.setText("no limit");
        add(capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 110, 20));
    }// </editor-fold>//GEN-END:initComponents
    ArrayList<Places> chosenPlaces = new ArrayList<>();
    
    private String[] getChosenPlaces() {
        ArrayList<String> places = new ArrayList<>();
        for(Places p : chosenPlaces) {
            places.add(p.getName());
        }
        String[] temp = new String[places.size()];
        temp = places.toArray(temp);
        return temp;
    }
    private String[] getAvailablePlaces() {
        ArrayList<String> places = new ArrayList<>();
        for(Places p : Database.listEvents.get(eventList.getSelectedIndex()).sortByBooked()) {
            if(!chosenPlaces.contains(p)) {
                places.add(p.getName());
            }
        }
        String[] temp = new String[places.size()];
        temp = places.toArray(temp);
        return temp;
    }
    private int getIndexOfName (String name) {
        for(Places p:Database.listPlaces) {
            if(p.getName().equals(name)) {
                return Database.listPlaces.indexOf(p);
            }
        }
        return -1;
    } 
    
    
    private String[] getListNameEvents(String search) {
        ArrayList < String > list;
        list = new ArrayList <> ();
        for (Event p: Database.listEvents) {
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

    private void personToAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personToAddKeyReleased
        listPeopleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getListNamePeople(personToAdd.getText());
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listPeopleList); 
    }//GEN-LAST:event_personToAddKeyReleased

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if(chosenPlacesList.getModel().getSize() < 5) {
            if(availablePlaces.getSelectedIndex() != -1) {
                chosenPlaces.add(Database.listPlaces.get(getIndexOfName(availablePlaces.getSelectedValue())));
                chosenPlacesList.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = getChosenPlaces();
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                });

                jScrollPane4.setViewportView(chosenPlacesList);
                availablePlaces.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = getAvailablePlaces();
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                });

                jScrollPane3.setViewportView(availablePlaces);
            }
        }
        else {
            String message = "limit reached";
            JOptionPane.showMessageDialog(new JFrame(), message, "Warning",
            JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        if(chosenPlacesList.getSelectedIndex() != -1) {
            chosenPlaces.remove(Database.listPlaces.get(getIndexOfName(chosenPlacesList.getSelectedValue())));
            chosenPlacesList.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = getChosenPlaces();
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });

            jScrollPane4.setViewportView(chosenPlacesList);
            availablePlaces.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = getAvailablePlaces();
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });

            jScrollPane3.setViewportView(availablePlaces);

        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void AddPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPersonBtnActionPerformed
        PersonPlaces a = Database.listEvents.get(eventList.getSelectedIndex()).addPerson(Database.getPersonFromName(listPeopleList.getSelectedValue()), chosenPlaces);
        if(a == null) {
            JOptionPane.showMessageDialog(null, "Error adding person!", "Warning", JOptionPane.WARNING_MESSAGE);
            chosenPlaces = new ArrayList<>();
            chosenPlacesList.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = getChosenPlaces();
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            jScrollPane4.setViewportView(chosenPlacesList);
            availablePlaces.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = getAvailablePlaces();
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            jScrollPane3.setViewportView(availablePlaces);
        }
        else {   
            Object[] options = {
                "OK",
                "ADD ANOTHER"
            };
            Object optionSelected = JOptionPane.showOptionDialog(null, "person added, Click OK to come back to menu or add another", "success", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (optionSelected.toString()) {
                case "0":
                    Component comp = SwingUtilities.getRoot(this);
                    ((Window) comp).dispose();
                    break;
                case "1":
                    chosenPlaces = new ArrayList<>();
                    chosenPlacesList.setModel(new javax.swing.AbstractListModel<String>() {
                        String[] strings = getChosenPlaces();
                        public int getSize() { return strings.length; }
                        public String getElementAt(int i) { return strings[i]; }
                    });
                    jScrollPane4.setViewportView(chosenPlacesList);
                    availablePlaces.setModel(new javax.swing.AbstractListModel<String>() {
                        String[] strings = getAvailablePlaces();
                        public int getSize() { return strings.length; }
                        public String getElementAt(int i) { return strings[i]; }
                    });
                    jScrollPane3.setViewportView(availablePlaces);
                    break; 
           }
        }

    }//GEN-LAST:event_AddPersonBtnActionPerformed

    private void personAddBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personAddBackBtnActionPerformed
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();    }//GEN-LAST:event_personAddBackBtnActionPerformed

    private void eventListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventListMouseClicked
        chosenPlaces = new ArrayList<>();
        chosenPlacesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getChosenPlaces();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(chosenPlacesList);
        availablePlaces.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getAvailablePlaces();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(availablePlaces);
    }//GEN-LAST:event_eventListMouseClicked

    private void listPeopleListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPeopleListMouseClicked
        chosenPlaces = new ArrayList<>();
        chosenPlacesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getChosenPlaces();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(chosenPlacesList);
    }//GEN-LAST:event_listPeopleListMouseClicked

    private void eventListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_eventListMouseEntered

    private void availablePlacesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availablePlacesMouseClicked
        numberOfPeople.setText(Database.listEvents.get(eventList.getSelectedIndex()).countLocal(availablePlaces.getSelectedValue()) +"");
        if(Database.getPlaceFromName(availablePlaces.getSelectedValue()).getClass().toString().toLowerCase().equals("class oopprojectnet.pubs")) {
            capacity.setText(Database.getPlaceFromName(availablePlaces.getSelectedValue()).getCapacity() + "");
        }
    }//GEN-LAST:event_availablePlacesMouseClicked

    
    
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
    
    private String[] getEventPlaces() {
        ArrayList<String> t = new ArrayList<String>();
        if((eventList.getSelectedIndex()) > -1) {
            for(Places p : Database.listEvents.get(eventList.getSelectedIndex()).getPlacesList()) {
                t.add(p.getName());
            }
        }
        String[] temp = new String[t.size()];
        temp = t.toArray(temp);
        return temp;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPersonBtn;
    private javax.swing.JButton addButton;
    private javax.swing.JList<String> availablePlaces;
    private javax.swing.JLabel capacity;
    private javax.swing.JList<String> chosenPlacesList;
    private javax.swing.JList<String> eventList;
    private javax.swing.JLabel eventName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelName;
    private javax.swing.JList<String> listPeopleList;
    private javax.swing.JLabel numberOfPeople;
    private javax.swing.JButton personAddBackBtn;
    private javax.swing.JTextField personToAdd;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
