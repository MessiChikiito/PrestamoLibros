/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.edu.ue.ui;

import co.edu.ue.dao.EditorialesDao;
import co.edu.ue.entidades.Editoriales;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mxmol
 */
public class z6Re_Editorial extends javax.swing.JPanel {

    /**
     * Creates new form z3Re_Lector
     */
    public z6Re_Editorial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void cleanFields(){
        txtNombreEditorial.setText("");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lect_id = new javax.swing.JLabel();
        txtNombreEditorial = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
<<<<<<< HEAD
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
=======
        btnLimpiarEditorial = new javax.swing.JButton();
        btnRegistrarEditorial = new javax.swing.JButton();
>>>>>>> d6b3b4a4c9e1bb5ac3337de5ff388ae2edfcfd6e

        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(251, 165, 26));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 500));

        lect_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lect_id.setText("NOMBRE EDITORIAL");
        jPanel1.add(lect_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 200, -1));

        txtNombreEditorial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreEditorial.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreEditorial.setText("Introduce nombre de la editorial");
        txtNombreEditorial.setBorder(null);
        txtNombreEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditorialActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jPanel1.add(textlect_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 410, 30));
=======
        jPanel1.add(txtNombreEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 410, 30));
>>>>>>> d6b3b4a4c9e1bb5ac3337de5ff388ae2edfcfd6e

        separador1.setBackground(new java.awt.Color(244, 121, 32));
        separador1.setForeground(new java.awt.Color(244, 121, 32));
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 410, 10));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 280, 500));

<<<<<<< HEAD
        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("GUARDAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
=======
        btnLimpiarEditorial.setText("LIMPIAR");
        btnLimpiarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEditorialActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 433, 130, 40));

        btnRegistrarEditorial.setText("GUARDAR");
        btnRegistrarEditorial.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> d6b3b4a4c9e1bb5ac3337de5ff388ae2edfcfd6e
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEditorialActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 130, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 130, -1));
=======
        jPanel1.add(btnRegistrarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 433, 130, 40));
>>>>>>> d6b3b4a4c9e1bb5ac3337de5ff388ae2edfcfd6e

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEditorialActionPerformed

<<<<<<< HEAD
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
=======
    private void btnLimpiarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarEditorialActionPerformed

    private void btnRegistrarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEditorialActionPerformed
        Editoriales editorial = new Editoriales(txtNombreEditorial.getText());
        
        EditorialesDao dao = new EditorialesDao();
        try {
            dao.addUser(editorial);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        cleanFields();
    }//GEN-LAST:event_btnRegistrarEditorialActionPerformed
>>>>>>> d6b3b4a4c9e1bb5ac3337de5ff388ae2edfcfd6e

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarEditorial;
    private javax.swing.JButton btnRegistrarEditorial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lect_id;
    private javax.swing.JSeparator separador1;
    private javax.swing.JTextField txtNombreEditorial;
    // End of variables declaration//GEN-END:variables


}
