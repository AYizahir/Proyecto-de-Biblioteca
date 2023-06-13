package Pantallas;

import Controladores.ConnectionSQL;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;

public class Registro extends javax.swing.JPanel {

    public Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_sesion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_usuario = new javax.swing.JTextField();
        lbl_tipo = new javax.swing.JLabel();
        txt_contra = new javax.swing.JPasswordField();
        lbl_contra = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cb_turno = new javax.swing.JComboBox<>();
        lbl_turno = new javax.swing.JLabel();
        lbl_guardarRegistro = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txt_email = new javax.swing.JTextField();
        lbl_usuario1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(696, 503));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_sesion.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        lbl_sesion.setText("Registro");
        jPanel1.add(lbl_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 110, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 320, -1));

        txt_usuario.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(102, 102, 102));
        txt_usuario.setToolTipText("Ingrese un nombre de usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usuarioFocusLost(evt);
            }
        });
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 30));

        lbl_tipo.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_tipo.setText("Tipo de Usuario");
        jPanel1.add(lbl_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txt_contra.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_contra.setForeground(new java.awt.Color(204, 204, 204));
        txt_contra.setToolTipText("Ingrese una contraseña");
        txt_contra.setBorder(null);
        txt_contra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_contraFocusLost(evt);
            }
        });
        txt_contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_contraMousePressed(evt);
            }
        });
        jPanel1.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 320, -1));

        lbl_contra.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_contra.setText("Contraseña");
        jPanel1.add(lbl_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        lbl_usuario.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_usuario.setText("Usuario");
        jPanel1.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 320, -1));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, 420));

        cb_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino" }));
        cb_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_turnoActionPerformed(evt);
            }
        });
        jPanel1.add(cb_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 320, -1));

        lbl_turno.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_turno.setText("Turno");
        jPanel1.add(lbl_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        lbl_guardarRegistro.setFont(new java.awt.Font("STIXIntegralsUp", 0, 18)); // NOI18N
        lbl_guardarRegistro.setText("Guardar");
        lbl_guardarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_guardarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_guardarRegistroMousePressed(evt);
            }
        });
        jPanel1.add(lbl_guardarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 70, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 320, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 320, -1));

        txt_email.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_email.setToolTipText("Ingrese un correo disponible");
        txt_email.setBorder(null);
        txt_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });
        txt_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_emailMousePressed(evt);
            }
        });
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 320, 30));

        lbl_usuario1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_usuario1.setText("Correo");
        jPanel1.add(lbl_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usuarioFocusLost
        if (txt_usuario.getText().equals("")) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_usuarioFocusLost

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Ingrese su usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_contraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_contraFocusLost
        if (txt_contra.getText().equals("")) {
            txt_contra.setText("Ingrese la contraseña");
            txt_contra.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_contraFocusLost

    private void txt_contraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contraMousePressed
        if (txt_contra.getText().equals("Ingrese la contraseña")) {
            txt_contra.setText("");
            txt_contra.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_contraMousePressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cb_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_turnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_turnoActionPerformed

    private void lbl_guardarRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarRegistroMousePressed
        int admin = 1;
        String nombre = txt_usuario.getText();
        String correo = txt_email.getText();
        String contra = txt_contra.getText();

        if (jComboBox1.getSelectedItem().toString().equals("Administrador")) {
            admin = 1;
        } else {
            admin = 0;
        }
        String turno = cb_turno.getSelectedItem().toString();

        String dir = "dir prueba";
        String numtel = "12345";

        // Validación de campos obligatorios
        if (nombre.isEmpty() || correo.isEmpty() || contra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
            return;
        }

        // Validación de formato de correo electrónico
        if (!correo.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
            JOptionPane.showMessageDialog(null, "El correo electrónico no es válido.");
            return;
        }

        try {
            Connection connection = ConnectionSQL.getConnectionSQL();

            int id;
            boolean idExistente;
            do {
                id = generarIDAleatorio();
                idExistente = verificarExistenciaID(id, connection);
            } while (idExistente);

            String insertSql = "INSERT INTO Bibliotecario(IDBibliotecario, Nombre, Email, Direccion, NumTel, Turno, Contra, AdminRol) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertSql);
            statement.setInt(1, id);
            statement.setString(2, nombre);
            statement.setString(3, correo);
            statement.setString(4, dir);
            statement.setString(5, numtel);
            statement.setString(6, turno);
            statement.setString(7, contra);
            statement.setInt(8, admin);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar");
            }

            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }

// Método para generar un ID aleatorio de 6 dígitos
    private int generarIDAleatorio() {
        Random random = new Random();
        int id = random.nextInt(900000) + 100000; // Generar un número aleatorio de 6 dígitos
        return id;
    }

// Método para verificar si un ID ya existe en la base de datos
    private boolean verificarExistenciaID(int id, Connection connection) throws SQLException {
        String consulta = "SELECT COUNT(*) FROM Bibliotecario WHERE IDBibliotecario = ?";
        PreparedStatement statement = connection.prepareStatement(consulta);
        statement.setInt(1, id);
        ResultSet resultado = statement.executeQuery();
        resultado.next();
        int count = resultado.getInt(1);
        return count > 0;
    }//GEN-LAST:event_lbl_guardarRegistroMousePressed

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailFocusLost

    private void txt_emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_turno;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_contra;
    private javax.swing.JLabel lbl_guardarRegistro;
    private javax.swing.JLabel lbl_sesion;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel lbl_usuario1;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
