/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.edu.ue.ui;


import co.edu.ue.dao.LibrosDao;
import co.edu.ue.entidades.Libros;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mxmol
 */
public class z4Re_Libros extends javax.swing.JPanel {

    /**
     * Creates new form z3Re_Lector
     */
    public z4Re_Libros() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lect_nombre = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        lect_apellido = new javax.swing.JLabel();
        txtEditorialLibro = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

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

        lect_nombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lect_nombre.setText("TITULO");
        jPanel1.add(lect_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 160, -1));

        txtTituloLibro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTituloLibro.setForeground(new java.awt.Color(102, 102, 102));
        txtTituloLibro.setText("Introduce nombre del usuario");
        txtTituloLibro.setBorder(null);
        txtTituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLibroActionPerformed(evt);
            }
        });
        jPanel1.add(txtTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 410, 30));

        separador2.setBackground(new java.awt.Color(244, 121, 32));
        separador2.setForeground(new java.awt.Color(244, 121, 32));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 410, 10));

        lect_apellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lect_apellido.setText("EDITORIAL");
        jPanel1.add(lect_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 160, -1));

        txtEditorialLibro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEditorialLibro.setForeground(new java.awt.Color(102, 102, 102));
        txtEditorialLibro.setText("Introduce nombre del usuario");
        txtEditorialLibro.setBorder(null);
        txtEditorialLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialLibroActionPerformed(evt);
            }
        });
        jPanel1.add(txtEditorialLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 410, 30));

        separador3.setBackground(new java.awt.Color(244, 121, 32));
        separador3.setForeground(new java.awt.Color(244, 121, 32));
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 410, 10));

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

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 433, 130, 40));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 433, 130, 40));

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

    private void txtTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloLibroActionPerformed

    private void txtEditorialLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialLibroActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       cleanFields();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Libros libro = new Libros (txtTituloLibro.getText(), 
        txtEditorialLibro.getText());
        
        LibrosDao dao = new LibrosDao();
        try {
            dao.addUser(libro);
        } catch (SQLException ex) {
            Logger.getLogger(z4Re_Libros.class.getName()).log(Level.SEVERE, null, ex);
        }
        cleanFields();
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
        private void cleanFields(){
        txtCodigoLibro.setText("");
        txtTituloLibro.setText("");
        txtEditorialLibro.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lect_apellido;
    private javax.swing.JLabel lect_nombre;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JTextField txtEditorialLibro;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
