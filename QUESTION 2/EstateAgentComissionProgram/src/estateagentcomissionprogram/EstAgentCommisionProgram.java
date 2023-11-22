/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estateagentcomissionprogram;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author anksb
 */
public class EstAgentCommisionProgram extends javax.swing.JFrame {

    /**
     * Creates new form EstAgentCommisionProgram
     */
    public EstAgentCommisionProgram() {
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

        estAgentLocation = new javax.swing.JLabel();
        nameOfEstateAgent = new javax.swing.JLabel();
        priceOfProperty = new javax.swing.JLabel();
        commissionPercentage = new javax.swing.JLabel();
        estAgentReport = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        estAgentReportTextArea = new javax.swing.JTextArea();
        estAgentNameTextField = new javax.swing.JTextField();
        propertyPriceTextField = new javax.swing.JTextField();
        estAgentLocationComboBox = new javax.swing.JComboBox<>();
        commissionPercentageTextField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ExitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        processReportMenuItem = new javax.swing.JMenuItem();
        ClearMenuItem = new javax.swing.JMenuItem();
        saveReportMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        estAgentLocation.setText("AGENT LOCATION:");

        nameOfEstateAgent.setText("ESTATE AGENT NAME:");

        priceOfProperty.setText("PROPERTY PRICE:");

        commissionPercentage.setText("COMMISSION PERCENTAGE:");

        estAgentReport.setText("ESTATE AGENT REPORT:");

        estAgentReportTextArea.setColumns(20);
        estAgentReportTextArea.setRows(5);
        jScrollPane1.setViewportView(estAgentReportTextArea);

        estAgentLocationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Pretoria" }));

        jMenu1.setText("File");

        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ExitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        processReportMenuItem.setText("Process Report");
        processReportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processReportMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(processReportMenuItem);

        ClearMenuItem.setText("Clear ");
        ClearMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(ClearMenuItem);

        saveReportMenuItem.setText("Save Report");
        saveReportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveReportMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(saveReportMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(estAgentLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(estAgentReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(commissionPercentage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(priceOfProperty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameOfEstateAgent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(propertyPriceTextField)
                                    .addComponent(estAgentNameTextField)
                                    .addComponent(estAgentLocationComboBox, 0, 106, Short.MAX_VALUE)
                                    .addComponent(commissionPercentageTextField))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estAgentLocation)
                    .addComponent(estAgentLocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameOfEstateAgent)
                    .addComponent(estAgentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceOfProperty)
                    .addComponent(propertyPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commissionPercentage)
                    .addComponent(commissionPercentageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(estAgentReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // (www.youtube.com, n.d.)
    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        // Close the application with the exit menu item
        System.exit(0);
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    //(www.youtube.com, n.d.)
    private void processReportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processReportMenuItemActionPerformed
        // Get input values from the GUI components
        String estateAgentLocation = (String) estAgentLocationComboBox.getSelectedItem();
        String nameOfEstAgent = estAgentNameTextField.getText();
        String pPrice = propertyPriceTextField.getText();
        String EAcommissionPercentage = commissionPercentageTextField.getText();

        // Validation of data using EstateAgent class
        EstateAgent estateAgent = new EstateAgent();
        Data dataToValidate = new Data(estateAgentLocation, nameOfEstAgent, pPrice, EAcommissionPercentage);

        if (estateAgent.ValidateData(dataToValidate)) {
            // Data is valid, comission is calculated and display the report
            double commissionOfEA = estateAgent.CalculateCommission(pPrice, EAcommissionPercentage);

            // Estate Agent Sales Report being displayed
            String report;
            report = String.format("AGENT LOCATION: %s\n"
                    + "AGENT NAME: %s\n"
                    + "PROPERTY PRICE: R %,.2f\n"
                    + "COMMISSION PERCENTAGE: %s%%\n"
                    + "CALCULATED COMMISSION: R %,.2f",
                    estateAgentLocation, nameOfEstAgent, Double.parseDouble(pPrice), EAcommissionPercentage, commissionOfEA);

            estAgentReportTextArea.setText(report);
        } else {
            // Data is invalid therefore an error message will be displayed
            JOptionPane.showMessageDialog(this, "Invalid data. Please check the input values.");
        }

    }//GEN-LAST:event_processReportMenuItemActionPerformed
    // (www.youtube.com, n.d.)
    private void saveReportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveReportMenuItemActionPerformed
        //Collect information from the estate agent report in the text area
        String reportInfo = estAgentReportTextArea.getText();

        //The name of the file
        String nameOfFile = "estAgentReport.txt";

        //File object with name
        File file = new File(nameOfFile);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            // Write the estate agent report information into this file
            writer.write(reportInfo);

            //Message to show that the data is correct
            JOptionPane.showMessageDialog(this, "The Estate Agent report is saved to " + nameOfFile, "successfullly", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "There is an error saving the report to " + nameOfFile, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveReportMenuItemActionPerformed

    //(www.youtube.com, n.d.), (www3.ntu.edu.sg, n.d.)
    private void ClearMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearMenuItemActionPerformed
        // Clear the text fields and text area with the clear Menu Item
        estAgentLocationComboBox.setSelectedIndex(0);
        estAgentNameTextField.setText("");
        propertyPriceTextField.setText("");
        commissionPercentageTextField.setText("");
        estAgentReportTextArea.setText("");
    }//GEN-LAST:event_ClearMenuItemActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstAgentCommisionProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstAgentCommisionProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstAgentCommisionProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstAgentCommisionProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EstAgentCommisionProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ClearMenuItem;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JLabel commissionPercentage;
    private javax.swing.JTextField commissionPercentageTextField;
    private javax.swing.JLabel estAgentLocation;
    private javax.swing.JComboBox<String> estAgentLocationComboBox;
    private javax.swing.JTextField estAgentNameTextField;
    private javax.swing.JLabel estAgentReport;
    private javax.swing.JTextArea estAgentReportTextArea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameOfEstateAgent;
    private javax.swing.JLabel priceOfProperty;
    private javax.swing.JMenuItem processReportMenuItem;
    private javax.swing.JTextField propertyPriceTextField;
    private javax.swing.JMenuItem saveReportMenuItem;
    // End of variables declaration//GEN-END:variables
}

//////////////REFERENCING/////////////////
/**
 * Farrell, J. (2019). Java programming. Australia: Cengage Learning.
 * www.youtube.com. (n.d.). PROG6112 LU6 GUIs 2. [online] Available at:
 * https://www.youtube.com/watch?v=D4jfF4WM570&t=88s Accessed 22 Nov. 2023
 * www.youtube.com. (n.d.). PROG6112 LU6 GUIs 1. [online] Available at:
 * https://www.youtube.com/watch?v=4tXI5mM2jbo Accessed 22 Nov. 2023
 * www.youtube.com. (n.d.). PROG6112 LU6 GUIs 5. [online] Available at:
 * https://www.youtube.com/watch?v=8oCOO0Pd0tM&t=198s Accessed 22 Nov. 2023
 * www3.ntu.edu.sg. (n.d.). GUI Programming Part 2 - Java Programming Tutorial.
 * [online] Available at:
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/J4a_GUI_2.html.
 */
