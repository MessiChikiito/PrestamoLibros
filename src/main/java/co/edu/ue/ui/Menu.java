
package co.edu.ue.ui;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        InitContent();
        
    }

    private void InitContent(){
        ShowJPanel(new z1Bienvenida());
    }
    
    private void ShowJPanel (JPanel p){
        p.setSize(800,500);
        p.setLocation(0,0);
        
        Content.removeAll();
        Content.add (p, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JButton();
        Prestamos = new javax.swing.JButton();
        Re_Lector = new javax.swing.JButton();
        Re_Libros = new javax.swing.JButton();
        Re_Autor = new javax.swing.JButton();
        Re_Editorial = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Re_Editorial1 = new javax.swing.JButton();
        Re_Editorial2 = new javax.swing.JButton();
        Re_Editorial3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(244, 121, 32));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 49, 50));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenido.setBackground(new java.awt.Color(251, 165, 26));
        Bienvenido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bienvenido.setText("BIENVENIDA");
        Bienvenido.setBorder(null);
        Bienvenido.setBorderPainted(false);
        Bienvenido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bienvenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BienvenidoActionPerformed(evt);
            }
        });
        jPanel3.add(Bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 30));

        Prestamos.setBackground(new java.awt.Color(251, 165, 26));
        Prestamos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Prestamos.setText("PRESTAMOS");
        Prestamos.setBorder(null);
        Prestamos.setBorderPainted(false);
        Prestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestamosActionPerformed(evt);
            }
        });
        jPanel3.add(Prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 30));

        Re_Lector.setBackground(new java.awt.Color(251, 165, 26));
        Re_Lector.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Re_Lector.setText("REGISTRO DEL LECTOR");
        Re_Lector.setBorder(null);
        Re_Lector.setBorderPainted(false);
        Re_Lector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Re_Lector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Re_LectorActionPerformed(evt);
            }
        });
        jPanel3.add(Re_Lector, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 30));

        Re_Libros.setBackground(new java.awt.Color(251, 165, 26));
        Re_Libros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Re_Libros.setText("REGISTRO DE LIBROS");
        Re_Libros.setBorder(null);
        Re_Libros.setBorderPainted(false);
        Re_Libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Re_Libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Re_LibrosActionPerformed(evt);
            }
        });
        jPanel3.add(Re_Libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 30));

        Re_Autor.setBackground(new java.awt.Color(251, 165, 26));
        Re_Autor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Re_Autor.setText("REGISTRO DE AUTOR");
        Re_Autor.setBorder(null);
        Re_Autor.setBorderPainted(false);
        Re_Autor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Re_Autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Re_AutorActionPerformed(evt);
            }
        });
        jPanel3.add(Re_Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 220, 30));

        Re_Editorial.setBackground(new java.awt.Color(251, 165, 26));
        Re_Editorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Re_Editorial.setText("CONSULTA DE PRESTAMOS");
        Re_Editorial.setBorder(null);
        Re_Editorial.setBorderPainted(false);
        Re_Editorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Re_Editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Re_EditorialActionPerformed(evt);
            }
        });
        jPanel3.add(Re_Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 220, 30));

        jButton7.setBackground(new java.awt.Color(255, 102, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("CERRAR SESION");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 220, 40));

        Re_Editorial1.setBackground(new java.awt.Color(251, 165, 26));
        Re_Editorial1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Re_Editorial1.setText("REGISTRO EDITORIAL");
        Re_Editorial1.setBorder(null);
        Re_Editorial1.setBorderPainted(false);
        Re_Editorial1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(Re_Editorial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 30));

        Re_Editorial2.setBackground(new java.awt.Color(251, 165, 26));
        Re_Editorial2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Re_Editorial2.setText("AUTOR / LIBRO");
        Re_Editorial2.setBorder(null);
        Re_Editorial2.setBorderPainted(false);
        Re_Editorial2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Re_Editorial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Re_Editorial2ActionPerformed(evt);
            }
        });
        jPanel3.add(Re_Editorial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 30));

        Re_Editorial3.setBackground(new java.awt.Color(251, 165, 26));
        Re_Editorial3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Re_Editorial3.setText("CONSULTA DE LIBROS");
        Re_Editorial3.setBorder(null);
        Re_Editorial3.setBorderPainted(false);
        Re_Editorial3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(Re_Editorial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 220, 30));

        Menu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 260, 500));

        jPanel2.setBackground(new java.awt.Color(251, 165, 26));
        jPanel2.setPreferredSize(new java.awt.Dimension(280, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Menu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, -1));

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 280, 500));

        Content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BienvenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BienvenidoActionPerformed
        ShowJPanel(new z1Bienvenida());
    }//GEN-LAST:event_BienvenidoActionPerformed

    private void PrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestamosActionPerformed
        ShowJPanel(new z2Prestamo());
    }//GEN-LAST:event_PrestamosActionPerformed

    private void Re_LectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Re_LectorActionPerformed
        ShowJPanel(new z3Re_Lector());
    }//GEN-LAST:event_Re_LectorActionPerformed

    private void Re_AutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Re_AutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Re_AutorActionPerformed

    private void Re_Editorial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Re_Editorial2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Re_Editorial2ActionPerformed

    private void Re_EditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Re_EditorialActionPerformed
        ShowJPanel(new z3Re_Lector());
    }//GEN-LAST:event_Re_EditorialActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void Re_LibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Re_LibrosActionPerformed
        ShowJPanel(new z3Re_Lector());
    }//GEN-LAST:event_Re_LibrosActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bienvenido;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Prestamos;
    private javax.swing.JButton Re_Autor;
    private javax.swing.JButton Re_Editorial;
    private javax.swing.JButton Re_Editorial1;
    private javax.swing.JButton Re_Editorial2;
    private javax.swing.JButton Re_Editorial3;
    private javax.swing.JButton Re_Lector;
    private javax.swing.JButton Re_Libros;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
