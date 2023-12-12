
package co.edu.ue.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INICIO = new javax.swing.JPanel();
        negro_login = new javax.swing.JLabel();
        naranja_login = new javax.swing.JLabel();
        naranja2_login = new javax.swing.JLabel();
        inicio_de_sesion1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        textusuario = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        contraseña = new javax.swing.JLabel();
        textcontraseña = new javax.swing.JPasswordField();
        separador2 = new javax.swing.JSeparator();
        buttonregistro = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        INICIO.setBackground(new java.awt.Color(255, 255, 255));
        INICIO.setDoubleBuffered(false);
        INICIO.setEnabled(false);
        INICIO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        negro_login.setBackground(new java.awt.Color(51, 49, 50));
        negro_login.setOpaque(true);
        INICIO.add(negro_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 500));

        naranja_login.setBackground(new java.awt.Color(251, 165, 26));
        naranja_login.setOpaque(true);
        INICIO.add(naranja_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 500));

        naranja2_login.setBackground(new java.awt.Color(244, 121, 32));
        naranja2_login.setOpaque(true);
        INICIO.add(naranja2_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 340, 500));

        inicio_de_sesion1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        inicio_de_sesion1.setText("INICIO DE SESION");
        INICIO.add(inicio_de_sesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 280, 20));

        usuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usuario.setText("USUARIO (CORREO)");
        INICIO.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 190, 20));

        textusuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textusuario.setForeground(new java.awt.Color(102, 102, 102));
        textusuario.setText("Introduce nombre del usuario");
        textusuario.setToolTipText("");
        textusuario.setBorder(null);
        textusuario.setNextFocusableComponent(usuario);
        textusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textusuarioActionPerformed(evt);
            }
        });
        INICIO.add(textusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 310, 40));

        separador1.setBackground(new java.awt.Color(244, 121, 32));
        separador1.setForeground(new java.awt.Color(244, 121, 32));
        INICIO.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 310, 10));

        contraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contraseña.setLabelFor(textcontraseña);
        contraseña.setText("CONTRASEÑA");
        INICIO.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 320, 20));

        textcontraseña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textcontraseña.setForeground(new java.awt.Color(102, 102, 102));
        textcontraseña.setText("contraseña");
        textcontraseña.setBorder(null);
        textcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcontraseñaActionPerformed(evt);
            }
        });
        INICIO.add(textcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 310, 40));

        separador2.setBackground(new java.awt.Color(244, 121, 32));
        separador2.setForeground(new java.awt.Color(244, 121, 32));
        INICIO.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 310, 10));

        buttonregistro.setBackground(new java.awt.Color(251, 165, 26));
        buttonregistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonregistro.setText("REGISTRARSE");
        buttonregistro.setBorder(null);
        buttonregistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonregistro.setName(""); // NOI18N
        buttonregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonregistroActionPerformed(evt);
            }
        });
        INICIO.add(buttonregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 130, 40));

        btnIniciarSesion.setBackground(new java.awt.Color(251, 165, 26));
        btnIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIniciarSesion.setText("INICIAR SESION");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        INICIO.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        INICIO.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcontraseñaActionPerformed

    private void buttonregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonregistroActionPerformed
        Registro v2 =new Registro();
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonregistroActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        Menu v3 =new Menu();
        v3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
   
    private void textusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textusuarioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel INICIO;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton buttonregistro;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel inicio_de_sesion1;
    private javax.swing.JLabel naranja2_login;
    private javax.swing.JLabel naranja_login;
    private javax.swing.JLabel negro_login;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JPasswordField textcontraseña;
    private javax.swing.JTextField textusuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
