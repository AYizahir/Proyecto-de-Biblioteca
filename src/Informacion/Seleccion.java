package Informacion;

import Pantallas.Sesion;
import Pantallas_Emp.Sesion_Emp;

public class Seleccion extends javax.swing.JFrame {

    public Seleccion() {
        //jButton1.setVisible(false);
        initComponents();
        //lbl_usuario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_imagenI = new javax.swing.JLabel();
        lbl_salir = new javax.swing.JLabel();
        lbl_sesion1 = new javax.swing.JLabel();
        cmd_admin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmd_emp = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagenI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LibreriaFondo2.jpeg"))); // NOI18N
        jPanel1.add(lbl_imagenI, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 350, 440));

        lbl_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salir2.png"))); // NOI18N
        lbl_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salirMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        lbl_sesion1.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        lbl_sesion1.setText("Seleccione el inicio de sesión");
        jPanel1.add(lbl_sesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 350, 30));

        cmd_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_adminMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Administrador");

        javax.swing.GroupLayout cmd_adminLayout = new javax.swing.GroupLayout(cmd_admin);
        cmd_admin.setLayout(cmd_adminLayout);
        cmd_adminLayout.setHorizontalGroup(
            cmd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cmd_adminLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );
        cmd_adminLayout.setVerticalGroup(
            cmd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cmd_adminLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(cmd_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 60));

        cmd_emp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_empMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Empleado");

        javax.swing.GroupLayout cmd_empLayout = new javax.swing.GroupLayout(cmd_emp);
        cmd_emp.setLayout(cmd_empLayout);
        cmd_empLayout.setHorizontalGroup(
            cmd_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cmd_empLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        cmd_empLayout.setVerticalGroup(
            cmd_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cmd_empLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(cmd_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 130, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void cmd_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_adminMouseClicked
        Sesion ses=new Sesion();
        ses.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cmd_adminMouseClicked

    private void cmd_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_empMouseClicked
        Sesion_Emp ses=new Sesion_Emp();
        ses.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cmd_empMouseClicked

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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cmd_admin;
    private javax.swing.JPanel cmd_emp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_imagenI;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JLabel lbl_sesion1;
    // End of variables declaration//GEN-END:variables
}
