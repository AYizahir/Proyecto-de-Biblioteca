package Pantallas;

import Controladores.ConnectionSQL;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

public class Proveedor extends javax.swing.JPanel {

    public Proveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmd_guardarProveedor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmd_modificarProveedor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_email = new javax.swing.JLabel();
        lbl_tel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_tel = new javax.swing.JTextField();
        txt_nombreProveedor = new javax.swing.JTextField();
        lbl_name1 = new javax.swing.JLabel();
        txt_buscarID = new javax.swing.JTextField();
        lbl_buscarProveedor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_prove = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        cmd_eliminarProveedor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmd_guardarProveedor.setBackground(new java.awt.Color(153, 102, 0));
        cmd_guardarProveedor.setForeground(new java.awt.Color(166, 110, 0));
        cmd_guardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_guardarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_guardarProveedorMouseClicked(evt);
            }
        });
        cmd_guardarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Guardar");
        cmd_guardarProveedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(cmd_guardarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, 40));

        cmd_modificarProveedor.setBackground(new java.awt.Color(153, 102, 0));
        cmd_modificarProveedor.setForeground(new java.awt.Color(166, 110, 0));
        cmd_modificarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_modificarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmd_modificarProveedorMousePressed(evt);
            }
        });
        cmd_modificarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modificar");
        cmd_modificarProveedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(cmd_modificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 120, 40));

        txt_email.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_email.setText("Ingrese el correo Electronico");
        txt_email.setBorder(null);
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
        add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 210, 30));

        jSeparator5.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator5.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 210, 10));

        lbl_email.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_email.setText("Correo Electronico:   ");
        add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        lbl_tel.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_tel.setText("Numero Telefonico:");
        add(lbl_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 210, 10));

        txt_tel.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_tel.setForeground(new java.awt.Color(102, 102, 102));
        txt_tel.setText("Ingrese el numero telefonico");
        txt_tel.setBorder(null);
        txt_tel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_telFocusLost(evt);
            }
        });
        txt_tel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_telMousePressed(evt);
            }
        });
        add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 210, 30));

        txt_nombreProveedor.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_nombreProveedor.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombreProveedor.setText("Ingrese el nombre del proveedor");
        txt_nombreProveedor.setBorder(null);
        txt_nombreProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nombreProveedorFocusLost(evt);
            }
        });
        txt_nombreProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombreProveedorMousePressed(evt);
            }
        });
        add(txt_nombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, 30));

        lbl_name1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_name1.setText("Nombre dl Proveedor: ");
        add(lbl_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txt_buscarID.setForeground(new java.awt.Color(204, 204, 204));
        txt_buscarID.setText("Ingrese el id del proveedor si desea modificar o borrar");
        txt_buscarID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_buscarIDFocusLost(evt);
            }
        });
        txt_buscarID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_buscarIDMousePressed(evt);
            }
        });
        add(txt_buscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 350, 40));

        lbl_buscarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Insertar.png"))); // NOI18N
        lbl_buscarProveedor.setToolTipText("Seleccione para llenar los campos");
        lbl_buscarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_buscarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_buscarProveedorMouseClicked(evt);
            }
        });
        add(lbl_buscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/prove22.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 670, 10));

        lbl_prove.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        lbl_prove.setText("Proveedor");
        add(lbl_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 30));

        jSeparator6.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator6.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 210, 10));

        cmd_eliminarProveedor.setBackground(new java.awt.Color(153, 102, 0));
        cmd_eliminarProveedor.setForeground(new java.awt.Color(166, 110, 0));
        cmd_eliminarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd_eliminarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_eliminarProveedorMouseClicked(evt);
            }
        });
        cmd_eliminarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eliminar");
        cmd_eliminarProveedor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(cmd_eliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        if (txt_email.getText().equals("")) {
            txt_email.setText("Ingrese el correo Electronico");
            txt_email.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_emailFocusLost

    private void txt_emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emailMousePressed
        if (txt_email.getText().equals("Ingrese el correo Electronico")) {
            txt_email.setText("");
            txt_email.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_emailMousePressed

    private void txt_telFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_telFocusLost
        if (txt_tel.getText().equals("")) {
            txt_tel.setText("Ingrese el numero telefonico");
            txt_tel.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_telFocusLost

    private void txt_telMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_telMousePressed
        if (txt_tel.getText().equals("Ingrese el numero telefonico")) {
            txt_tel.setText("");
            txt_tel.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_telMousePressed

    private void txt_nombreProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nombreProveedorFocusLost
        if (txt_nombreProveedor.getText().equals("")) {
            txt_nombreProveedor.setText("Ingrese el nombre del proveedor");
            txt_nombreProveedor.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_nombreProveedorFocusLost

    private void txt_nombreProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreProveedorMousePressed
        if (txt_nombreProveedor.getText().equals("Ingrese el nombre del proveedor")) {
            txt_nombreProveedor.setText("");
            txt_nombreProveedor.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_nombreProveedorMousePressed

    private void txt_buscarIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarIDFocusLost
        if (txt_buscarID.getText().equals("")) {
            txt_buscarID.setText("Ingrese el id del proveedor si desea modificar o borrar");
            txt_buscarID.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_buscarIDFocusLost

    private void txt_buscarIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarIDMousePressed
        if (txt_buscarID.getText().equals("Ingrese el id del proveedor si desea modificar o borrar")) {
            txt_buscarID.setText("");
            txt_buscarID.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_buscarIDMousePressed

    private void cmd_guardarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_guardarProveedorMouseClicked
        int id = generarIDAleatorio();
        String nombre = txt_nombreProveedor.getText();
        String tel = txt_tel.getText();
        String email = txt_email.getText();

        // Validación de campos obligatorios
        if (nombre.isEmpty() || tel.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
            return;
        }

// Validación de formato de número de teléfono
        if (!tel.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe contener solo dígitos.");
            return;
        }

// Validación de formato de correo electrónico
        if (!email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
            JOptionPane.showMessageDialog(null, "El correo electrónico no es válido.");
            return;
        }

        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String insertSql = "INSERT INTO Proveedores(IDProveedor, Nombre, Email, NumTel) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertSql);
            statement.setInt(1, id);
            statement.setString(2, nombre);
            statement.setString(3, email);
            statement.setString(4, tel);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Proveedor guardado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el proveedor");
            }

            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el proveedor");
        }
    }

    private int generarIDAleatorio() {
        Random random = new Random();
        int id;

        // Generar un ID aleatorio de 6 dígitos
        do {
            id = random.nextInt(900000) + 100000;
        } while (verificarExistenciaID(id));

        return id;
    }

    private boolean verificarExistenciaID(int id) {
        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String consulta = "SELECT COUNT(*) FROM Proveedores WHERE IDProveedor = ?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, id);
            ResultSet resultado = statement.executeQuery();
            resultado.next();
            int count = resultado.getInt(1);
            connection.close();
            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }//GEN-LAST:event_cmd_guardarProveedorMouseClicked

    private void lbl_buscarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_buscarProveedorMouseClicked
        int buscar = Integer.parseInt(txt_buscarID.getText());
        try {
            Statement sql = ConnectionSQL.getConnectionSQL().createStatement();
            String buscarsql = "SELECT * FROM dbo.Proveedores WHERE IDProveedor='" + buscar + "'";
            ResultSet rs = sql.executeQuery(buscarsql);
            rs.next();
            txt_buscarID.setText(rs.getString("IDProveedor"));
            txt_nombreProveedor.setText(rs.getString("Nombre"));
            txt_email.setText(rs.getString("Email"));
            txt_tel.setText(rs.getString("NumTel"));
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_lbl_buscarProveedorMouseClicked

    private void cmd_modificarProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_modificarProveedorMousePressed
        int id = Integer.parseInt(txt_buscarID.getText());
        String nombre = txt_nombreProveedor.getText();
        String tel = txt_tel.getText();
        String email = txt_email.getText();

        // Validación de campos obligatorios
        if (nombre.isEmpty() || tel.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
            return;
        }

// Validación de formato de número de teléfono
        if (!tel.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe contener solo dígitos.");
            return;
        }

// Validación de formato de correo electrónico
        if (!email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
            JOptionPane.showMessageDialog(null, "El correo electrónico no es válido.");
            return;
        }

        try {
            Statement sql = ConnectionSQL.getConnectionSQL().createStatement();
            String insertarsql = "UPDATE Proveedores SET IDProveedor = " + id + ", Nombre = '" + nombre + "', NumTel = '" + tel + "', Email = '" + email + "' WHERE IDProveedor = '" + id + "';";
            sql.executeQuery(insertarsql);
        } catch (SQLException | NumberFormatException e) {
            System.out.println(e.toString());
        }
        JOptionPane.showMessageDialog(null, "Modificado");
    }//GEN-LAST:event_cmd_modificarProveedorMousePressed

    private void cmd_eliminarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_eliminarProveedorMouseClicked
        int id = Integer.parseInt(txt_buscarID.getText());
        try {
            Statement sql = ConnectionSQL.getConnectionSQL().createStatement();
            String buscarsql = "DELETE FROM Proveedores WHERE IDProveedor='" + id + "'";
            ResultSet rs = sql.executeQuery(buscarsql);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        JOptionPane.showMessageDialog(null, "Eliminado");
    }//GEN-LAST:event_cmd_eliminarProveedorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cmd_eliminarProveedor;
    private javax.swing.JPanel cmd_guardarProveedor;
    private javax.swing.JPanel cmd_modificarProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbl_buscarProveedor;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_prove;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JTextField txt_buscarID;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombreProveedor;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
