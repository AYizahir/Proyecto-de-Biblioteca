package Pantallas;

import Controladores.ConnectionSQL;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;

public class Cliente extends javax.swing.JPanel {

    public Cliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmd_editar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbl_sesion1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_emailCliente = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_email = new javax.swing.JLabel();
        txt_telefonoCliente = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_tel = new javax.swing.JLabel();
        cmd_eliminar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_buscarCliente = new javax.swing.JTextField();
        lbl_buscarCliente = new javax.swing.JLabel();
        cmd_guardar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbl_name1 = new javax.swing.JLabel();
        txt_nombreCliente = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_name2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txt_IDCliente = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmd_editar.setBackground(new java.awt.Color(153, 102, 0));
        cmd_editar.setForeground(new java.awt.Color(166, 110, 0));
        cmd_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmd_editarMousePressed(evt);
            }
        });
        cmd_editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Editar");
        cmd_editar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        add(cmd_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 110, 40));

        lbl_sesion1.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        lbl_sesion1.setText("Clientes");
        add(lbl_sesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 670, 10));

        txt_emailCliente.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_emailCliente.setForeground(new java.awt.Color(102, 102, 102));
        txt_emailCliente.setBorder(null);
        add(txt_emailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 210, 30));

        jSeparator4.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator4.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 210, 10));

        lbl_email.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_email.setText("Correo Electronico:   ");
        add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        txt_telefonoCliente.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_telefonoCliente.setForeground(new java.awt.Color(102, 102, 102));
        txt_telefonoCliente.setBorder(null);
        add(txt_telefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 210, 30));

        jSeparator3.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 210, 10));

        lbl_tel.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_tel.setText("Numero Telefonico");
        add(lbl_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        cmd_eliminar.setBackground(new java.awt.Color(153, 102, 0));
        cmd_eliminar.setForeground(new java.awt.Color(166, 110, 0));
        cmd_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmd_eliminarMousePressed(evt);
            }
        });
        cmd_eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eliminar");
        cmd_eliminar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(cmd_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Us.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        txt_buscarCliente.setForeground(new java.awt.Color(204, 204, 204));
        add(txt_buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 350, 40));

        lbl_buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Insertar.png"))); // NOI18N
        lbl_buscarCliente.setToolTipText("Seleccione para llenar los campos");
        lbl_buscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_buscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_buscarClienteMousePressed(evt);
            }
        });
        add(lbl_buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        cmd_guardar.setBackground(new java.awt.Color(153, 102, 0));
        cmd_guardar.setForeground(new java.awt.Color(166, 110, 0));
        cmd_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmd_guardarMousePressed(evt);
            }
        });
        cmd_guardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Guardar");
        cmd_guardar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(cmd_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, 40));

        lbl_name1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_name1.setText("Nombre del Usuario: ");
        add(lbl_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txt_nombreCliente.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_nombreCliente.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombreCliente.setBorder(null);
        add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 210, 30));

        jSeparator5.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator5.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 210, 10));

        lbl_name2.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_name2.setText("ID del Usuario: ");
        add(lbl_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator6.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 210, 10));

        txt_IDCliente.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_IDCliente.setForeground(new java.awt.Color(102, 102, 102));
        txt_IDCliente.setBorder(null);
        txt_IDCliente.setEnabled(false);
        add(txt_IDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_guardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_guardarMousePressed
        String nombre = txt_nombreCliente.getText();
        String tel = txt_telefonoCliente.getText();
        String email = txt_emailCliente.getText();

        // Validación de campos obligatorios
        if (nombre.isEmpty() || tel.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
            return;
        }

        // Validación de formato de teléfono
        if (!tel.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe tener 10 dígitos.");
            return;
        }

// Validación de formato de correo electrónico
        if (!email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
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

            String insertSql = "INSERT INTO Cliente(IDCliente, NombreCliente, Email, NumeroTelCli) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertSql);
            statement.setInt(1, id);
            statement.setString(2, nombre);
            statement.setString(3, email);
            statement.setString(4, tel);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cliente guardado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el cliente");
            }

            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el cliente");
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
    }//GEN-LAST:event_cmd_guardarMousePressed

    private void cmd_editarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_editarMousePressed
        String nombre = txt_nombreCliente.getText();
        int id = Integer.parseInt(txt_IDCliente.getText());
        String tel = txt_telefonoCliente.getText();
        String email = txt_emailCliente.getText();

        // Validación de campos obligatorios
        if (nombre.isEmpty() || tel.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
            return;
        }

        // Validación de formato de teléfono
        if (!tel.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe tener 10 dígitos.");
            return;
        }

// Validación de formato de correo electrónico
        if (!email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
            JOptionPane.showMessageDialog(null, "El correo electrónico no es válido.");
            return;
        }

        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String updateSql = "UPDATE Cliente SET NombreCliente = ?, NumeroTelCli = ?, Email = ? WHERE IDCliente=?";
            PreparedStatement statement = connection.prepareStatement(updateSql);
            statement.setString(1, nombre);
            statement.setString(2, tel);
            statement.setString(3, email);
            statement.setInt(4, id);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el cliente");
            }

            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente");
        }
    }//GEN-LAST:event_cmd_editarMousePressed

    private void lbl_buscarClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_buscarClienteMousePressed
        int buscar = Integer.parseInt(txt_buscarCliente.getText());

        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String buscarsql = "SELECT * FROM dbo.Cliente WHERE IDCliente=?";
            PreparedStatement statement = connection.prepareStatement(buscarsql);
            statement.setInt(1, buscar);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                txt_nombreCliente.setText(rs.getString("NombreCliente"));
                txt_IDCliente.setText(rs.getString("IDCliente"));
                txt_emailCliente.setText(rs.getString("Email"));
                txt_telefonoCliente.setText(rs.getString("NumeroTelCli"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con ese nombre");
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente");
        }

    }//GEN-LAST:event_lbl_buscarClienteMousePressed

    private void cmd_eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_eliminarMousePressed
        int id = Integer.parseInt(txt_IDCliente.getText());

        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String deleteSql = "DELETE FROM Cliente WHERE IDCliente=?";
            PreparedStatement statement = connection.prepareStatement(deleteSql);
            statement.setInt(1, id);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con ese nombre");
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente");
        }
    }//GEN-LAST:event_cmd_eliminarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cmd_editar;
    private javax.swing.JPanel cmd_eliminar;
    private javax.swing.JPanel cmd_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbl_buscarCliente;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name2;
    private javax.swing.JLabel lbl_sesion1;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JTextField txt_IDCliente;
    private javax.swing.JTextField txt_buscarCliente;
    private javax.swing.JTextField txt_emailCliente;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_telefonoCliente;
    // End of variables declaration//GEN-END:variables
}
