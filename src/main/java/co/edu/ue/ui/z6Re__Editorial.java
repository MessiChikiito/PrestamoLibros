
package co.edu.ue.ui;

import co.edu.ue.dao.EditorialesDao;
import co.edu.ue.entidades.Editoriales;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class z6Re__Editorial extends javax.swing.JPanel {

    public z6Re__Editorial() {
        initComponents();
    }
    private void cleanFields(){
        txtNombreEditorial.setText("");
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
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lect_id1 = new javax.swing.JLabel();
        txtNombreEditorial = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        btnRegistrarEditorial = new javax.swing.JButton();
        btnLimpiarEditorial = new javax.swing.JButton();

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(251, 165, 26));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 500));

        lect_id1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lect_id1.setText("NOMBRE DE LA EDITORIAL");
        jPanel4.add(lect_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 300, -1));

        txtNombreEditorial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreEditorial.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreEditorial.setText("Introduce el nombre de la editorial");
        txtNombreEditorial.setBorder(null);
        txtNombreEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditorialActionPerformed(evt);
            }
        });
        jPanel4.add(txtNombreEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 390, 30));

        separador3.setBackground(new java.awt.Color(244, 121, 32));
        separador3.setForeground(new java.awt.Color(244, 121, 32));
        jPanel4.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 400, 10));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 280, 500));

        btnRegistrarEditorial.setBackground(new java.awt.Color(255, 153, 0));
        btnRegistrarEditorial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegistrarEditorial.setText("REGISTRAR");
        btnRegistrarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEditorialActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 160, -1));

        btnLimpiarEditorial.setBackground(new java.awt.Color(255, 153, 0));
        btnLimpiarEditorial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpiarEditorial.setText("LIMPIAR");
        btnLimpiarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEditorialActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 130, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnRegistrarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEditorialActionPerformed
        Editoriales editorial = new Editoriales(txtNombreEditorial.getText() );
        
        EditorialesDao dao = new EditorialesDao();
        try {
            dao.addUser(editorial);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        cleanFields();
    }//GEN-LAST:event_btnRegistrarEditorialActionPerformed

    private void btnLimpiarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEditorialActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnLimpiarEditorialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarEditorial;
    private javax.swing.JButton btnRegistrarEditorial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lect_id1;
    private javax.swing.JSeparator separador3;
    private javax.swing.JTextField txtNombreEditorial;
    // End of variables declaration//GEN-END:variables
}