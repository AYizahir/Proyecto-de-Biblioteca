package Pantallas_Emp;

import Pantallas.*;
import Informacion.Seleccion;
import Controladores.ConnectionSQL;
import java.sql.*;
import javax.swing.JOptionPane;

public class Sesion_Emp extends javax.swing.JFrame {

    public Sesion_Emp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_imagenI = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txt_adminUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmd_entrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_salir = new javax.swing.JLabel();
        lbl_sesion1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_email = new javax.swing.JLabel();
        txt_idAdmin = new javax.swing.JPasswordField();
        rbtnMostrarID = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagenI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LibreriaFondo2.jpeg"))); // NOI18N
        jPanel1.add(lbl_imagenI, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 350, 440));

        lbl_usuario.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_usuario.setText("Usuario");
        jPanel1.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txt_adminUser.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_adminUser.setForeground(new java.awt.Color(102, 102, 102));
        txt_adminUser.setToolTipText("Ingrese el nombre de usuario");
        txt_adminUser.setBorder(null);
        jPanel1.add(txt_adminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 320, -1));

        cmd_entrar.setBackground(new java.awt.Color(153, 102, 0));
        cmd_entrar.setForeground(new java.awt.Color(166, 110, 0));
        cmd_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmd_entrarMousePressed(evt);
            }
        });
        cmd_entrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Entrar");
        cmd_entrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.add(cmd_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 110, 40));

        lbl_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salir2.png"))); // NOI18N
        lbl_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salirMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        lbl_sesion1.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        lbl_sesion1.setText("INICIAR SESIÓN");
        jPanel1.add(lbl_sesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 190, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, -1));

        lbl_email.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_email.setText("ID");
        jPanel1.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txt_idAdmin.setToolTipText("Ingrese el ID de usuario");
        txt_idAdmin.setBorder(null);
        jPanel1.add(txt_idAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 320, 30));

        rbtnMostrarID.setBackground(new java.awt.Color(255, 255, 255));
        rbtnMostrarID.setText("Mostrar ID");
        rbtnMostrarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMostrarIDActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnMostrarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        Seleccion sel = new Seleccion();
        sel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void cmd_entrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_entrarMousePressed
        String user = txt_adminUser.getText();
        String id = txt_idAdmin.getText();

        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String selectQuery = "SELECT * FROM Bibliotecario WHERE Nombre=? AND IDBibliotecario=? AND AdminRol='0'";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, user);
            statement.setString(2, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                Inicio_Emp ini = new Inicio_Emp();
                ini.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar el inicio de sesión");
        }
    }//GEN-LAST:event_cmd_entrarMousePressed

    private void rbtnMostrarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMostrarIDActionPerformed
        if (rbtnMostrarID.isSelected()) {
            // Mostrar la contraseña
            txt_idAdmin.setEchoChar((char) 0); // Establece el carácter de ocultación a 0 (mostrar)
        } else {
            // Ocultar la contraseña
            txt_idAdmin.setEchoChar('*'); // Restablece el carácter de ocultación a '*'
        }
    }//GEN-LAST:event_rbtnMostrarIDActionPerformed

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
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cmd_entrar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_imagenI;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JLabel lbl_sesion1;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JRadioButton rbtnMostrarID;
    private javax.swing.JTextField txt_adminUser;
    private javax.swing.JPasswordField txt_idAdmin;
    // End of variables declaration//GEN-END:variables
}
