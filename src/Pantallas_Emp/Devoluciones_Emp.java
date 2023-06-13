package Pantallas_Emp;

import Pantallas.*;
import Controladores.ConnectionSQL;
import java.awt.Color;
import java.sql.*;

public class Devoluciones_Emp extends javax.swing.JPanel {

    public Devoluciones_Emp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        lbl_bus2 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        txt_folioCliente = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txt_isbn = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_usuario = new javax.swing.JLabel();
        cmd_devolver = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 300, 10));

        lbl_bus2.setFont(new java.awt.Font("STIXIntegralsUp", 1, 36)); // NOI18N
        lbl_bus2.setText("Devolucion de Libro");
        add(lbl_bus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 370, 50));

        lbl_name.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_name.setText("Folio del cliente");
        add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txt_folioCliente.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_folioCliente.setForeground(new java.awt.Color(102, 102, 102));
        txt_folioCliente.setText("Ingrese el folio del cliente");
        txt_folioCliente.setBorder(null);
        txt_folioCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_folioClienteFocusLost(evt);
            }
        });
        txt_folioCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_folioClienteMousePressed(evt);
            }
        });
        add(txt_folioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 210, 30));

        jSeparator4.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator4.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 210, 10));

        txt_isbn.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_isbn.setForeground(new java.awt.Color(102, 102, 102));
        txt_isbn.setText("Ingrese el ISBN del libro");
        txt_isbn.setToolTipText("Ingrese el ISBN");
        txt_isbn.setBorder(null);
        txt_isbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_isbnFocusLost(evt);
            }
        });
        txt_isbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_isbnMousePressed(evt);
            }
        });
        add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, 30));

        jSeparator1.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 210, -1));

        lbl_usuario.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_usuario.setText("ISBN");
        add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        cmd_devolver.setBackground(new java.awt.Color(153, 102, 0));
        cmd_devolver.setForeground(new java.awt.Color(166, 110, 0));
        cmd_devolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_devolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmd_devolverMousePressed(evt);
            }
        });
        cmd_devolver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Devolver");
        cmd_devolver.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        add(cmd_devolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/giphy.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 420, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_folioClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_folioClienteFocusLost
        if (txt_folioCliente.getText().equals("")) {
            txt_folioCliente.setText("Ingrese el folio de usuario");
            txt_folioCliente.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_folioClienteFocusLost

    private void txt_folioClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_folioClienteMousePressed
        if (txt_folioCliente.getText().equals("Ingrese el folio de usuario")) {
            txt_folioCliente.setText("");
            txt_folioCliente.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_folioClienteMousePressed

    private void txt_isbnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_isbnFocusLost
        if (txt_isbn.getText().equals("")) {
            txt_isbn.setText("Ingrese el ISBN del libro");
            txt_isbn.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_isbnFocusLost

    private void txt_isbnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_isbnMousePressed
        if (txt_isbn.getText().equals("Ingrese el ISBN del libro")) {
            txt_isbn.setText("");
            txt_isbn.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_isbnMousePressed

    private void cmd_devolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_devolverMousePressed
        int isbn = Integer.parseInt(txt_isbn.getText());
        int cantidad_actual = 0;
        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String selectQuery = "SELECT Cant FROM dbo.Libros WHERE ISBN=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setInt(1, isbn);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                cantidad_actual = rs.getInt("Cant");
                cantidad_actual = cantidad_actual + 1;
                System.out.println(cantidad_actual);
                String updateQuery = "UPDATE dbo.Libros SET Cant=? WHERE ISBN=?";
                PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                updateStatement.setInt(1, cantidad_actual);
                updateStatement.setInt(2, isbn);
                updateStatement.executeUpdate();
            } else {
                System.out.println("No se encontró el libro");
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_cmd_devolverMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cmd_devolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_bus2;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_folioCliente;
    private javax.swing.JTextField txt_isbn;
    // End of variables declaration//GEN-END:variables
}
