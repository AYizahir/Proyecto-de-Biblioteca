package Pantallas_Emp;

import Pantallas.*;
import Controladores.ConnectionSQL;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class InicioMenu_Emp extends javax.swing.JPanel {

    public InicioMenu_Emp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_cantidad = new javax.swing.JTextField();
        lbl_cantidad = new javax.swing.JLabel();
        txt_genero = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_genero = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_isbn = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();
        txt_buscarNombre = new javax.swing.JTextField();
        lbl_bus = new javax.swing.JLabel();
        lbl_portada = new javax.swing.JLabel();
        lbl_buscar = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txt_edicion = new javax.swing.JTextField();
        lbl_edicion = new javax.swing.JLabel();
        lbl_cantidad1 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jSeparator9 = new javax.swing.JSeparator();
        lbl_limpiar = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txt_autor = new javax.swing.JTextField();
        lbl_autor = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cantidad.setEditable(false);
        txt_cantidad.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(153, 153, 153));
        txt_cantidad.setText("No. libros");
        txt_cantidad.setBorder(null);
        txt_cantidad.setFocusCycleRoot(true);
        add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 65, 30));

        lbl_cantidad.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_cantidad.setText("Fecha");
        add(lbl_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        txt_genero.setEditable(false);
        txt_genero.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_genero.setForeground(new java.awt.Color(153, 153, 153));
        txt_genero.setText("Género del libro");
        txt_genero.setBorder(null);
        add(txt_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 30));

        jSeparator5.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator5.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 10));

        lbl_genero.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_genero.setText("Género");
        add(lbl_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txt_titulo.setEditable(false);
        txt_titulo.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(153, 153, 153));
        txt_titulo.setText("Título del libro");
        txt_titulo.setBorder(null);
        add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 210, 30));

        lbl_titulo.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_titulo.setText("Título");
        add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 152, 210, 10));

        txt_isbn.setEditable(false);
        txt_isbn.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_isbn.setForeground(new java.awt.Color(153, 153, 153));
        txt_isbn.setText("Clave única del libro");
        txt_isbn.setBorder(null);
        add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 30));

        lbl_usuario.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_usuario.setText("ISBN");
        add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txt_buscarNombre.setForeground(new java.awt.Color(204, 204, 204));
        txt_buscarNombre.setText("Ingrese el nombre del libro");
        txt_buscarNombre.setToolTipText("Ingrese el nombre del li");
        txt_buscarNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_buscarNombreFocusLost(evt);
            }
        });
        txt_buscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_buscarNombreMousePressed(evt);
            }
        });
        add(txt_buscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 296, -1));

        lbl_bus.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        lbl_bus.setText("Buscador de libros");
        add(lbl_bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        lbl_portada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LibroPH.jpg"))); // NOI18N
        add(lbl_portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 308, 240));

        lbl_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Insertar.png"))); // NOI18N
        lbl_buscar.setToolTipText("Seleccione para llenar los campos");
        lbl_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_buscarMousePressed(evt);
            }
        });
        add(lbl_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator6.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 210, 10));

        txt_edicion.setEditable(false);
        txt_edicion.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_edicion.setForeground(new java.awt.Color(153, 153, 153));
        txt_edicion.setText("Edición del libro");
        txt_edicion.setBorder(null);
        add(txt_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 210, 30));

        lbl_edicion.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_edicion.setText("Edición");
        add(lbl_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        lbl_cantidad1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_cantidad1.setText("Cantidad");
        add(lbl_cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        fecha.setEnabled(false);
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 140, -1));

        jSeparator9.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator9.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 65, 10));

        lbl_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
        lbl_limpiar.setToolTipText("Limpiar");
        lbl_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_limpiar.setEnabled(false);
        lbl_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_limpiarMousePressed(evt);
            }
        });
        add(lbl_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator7.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 10));

        txt_autor.setEditable(false);
        txt_autor.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_autor.setForeground(new java.awt.Color(153, 153, 153));
        txt_autor.setText("Autor del libro");
        txt_autor.setBorder(null);
        add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, 30));

        lbl_autor.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_autor.setText("Autor");
        add(lbl_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 210, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarNombreFocusLost
        if (txt_buscarNombre.getText().equals("")) {
            txt_buscarNombre.setText("Ingrese el nombre del libro");
            txt_buscarNombre.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_buscarNombreFocusLost

    private void txt_buscarNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarNombreMousePressed
        if (txt_buscarNombre.getText().equals("Ingrese el nombre del libro")) {
            txt_buscarNombre.setText("");
            txt_buscarNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_buscarNombreMousePressed

    private void lbl_buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_buscarMousePressed
        String buscar = txt_buscarNombre.getText();
        if (buscar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del libro que desea buscar");
            return;
        }
        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String buscarsql = "SELECT * FROM dbo.Libros WHERE NombreLibro=?";
            PreparedStatement statement = connection.prepareStatement(buscarsql);
            statement.setString(1, buscar);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                txt_isbn.setText(rs.getString("ISBN"));
                txt_titulo.setText(rs.getString("NombreLibro"));
                txt_edicion.setText(rs.getString("Edicion"));
                txt_genero.setText(rs.getString("Genero"));
                txt_cantidad.setText(rs.getString("Cant"));
                txt_autor.setText(rs.getString("Autor"));
                fecha.setDate(rs.getDate("FechaPublicacion"));
                lbl_limpiar.setEnabled(true);
                lbl_buscar.setEnabled(false);
                txt_buscarNombre.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "El libro "+buscar+" no se encontró en la base");
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar el libro");
        }
    }//GEN-LAST:event_lbl_buscarMousePressed

    private void lbl_limpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_limpiarMousePressed
        txt_buscarNombre.setText("Ingrese el nombre del libro");
        txt_buscarNombre.setForeground(Color.GRAY);
        txt_isbn.setText("Clave unica del libro");
        txt_titulo.setText("Titulo del libro");
        txt_edicion.setText("Edición del libro");
        txt_genero.setText("Genero del libro");
        txt_cantidad.setText("No. libros");
        txt_autor.setText("Autor del libro");
        fecha.setDate(null);
        lbl_limpiar.setEnabled(false);
        lbl_buscar.setEnabled(true);
        txt_buscarNombre.setEnabled(true);
    }//GEN-LAST:event_lbl_limpiarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_bus;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_cantidad1;
    private javax.swing.JLabel lbl_edicion;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_limpiar;
    private javax.swing.JLabel lbl_portada;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_buscarNombre;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
