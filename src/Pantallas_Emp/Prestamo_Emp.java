package Pantallas_Emp;

import Pantallas.*;
import Controladores.ConnectionSQL;
import java.awt.Color;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.Date;

public class Prestamo_Emp extends javax.swing.JPanel {

    public Prestamo_Emp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        txt_nombreCliente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txt_IDPrestamo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_usuario2 = new javax.swing.JLabel();
        txt_buscarLibro = new javax.swing.JTextField();
        lbl_buscar = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txt_isbn = new javax.swing.JTextField();
        lbl_titulo1 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        lbl_genero = new javax.swing.JLabel();
        txt_genero = new javax.swing.JTextField();
        lbl_genero1 = new javax.swing.JLabel();
        txt_edicion = new javax.swing.JTextField();
        lbl_cantidad = new javax.swing.JLabel();
        txt_autor = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txt_id = new javax.swing.JTextField();
        lbl_titulo2 = new javax.swing.JLabel();
        lbl_buscarID = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txt_correoCliente = new javax.swing.JTextField();
        lbl_titulo3 = new javax.swing.JLabel();
        lbl_autor = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        cmd_prestar = new javax.swing.JPanel();
        lbl_prestar = new javax.swing.JLabel();
        lbl_autor1 = new javax.swing.JLabel();
        txt_autor1 = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        lbl_cantidad1 = new javax.swing.JLabel();
        lbl_limpiar = new javax.swing.JLabel();
        fechaEntrega1 = new com.toedter.calendar.JDateChooser();
        fechaDevolucion1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txt_CantidadPrestar = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_sesion1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(669, 503));
        setPreferredSize(new java.awt.Dimension(669, 503));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_titulo.setText("Ingrese el ID del cliente");
        add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        txt_nombreCliente.setEditable(false);
        txt_nombreCliente.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_nombreCliente.setForeground(new java.awt.Color(153, 153, 153));
        txt_nombreCliente.setBorder(null);
        add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 210, 30));

        jSeparator2.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 210, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Fecha Entrega");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jSeparator11.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator11.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 100, 10));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Devolucion");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jSeparator12.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator12.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 100, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 300, 10));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 70, -1, 440));

        txt_IDPrestamo.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_IDPrestamo.setForeground(new java.awt.Color(153, 153, 153));
        txt_IDPrestamo.setToolTipText("Ingrese el ISBN");
        txt_IDPrestamo.setBorder(null);
        add(txt_IDPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 90, 30));

        jSeparator4.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator4.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 90, 10));

        lbl_usuario2.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_usuario2.setText("ID prestamo");
        add(lbl_usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        txt_buscarLibro.setForeground(new java.awt.Color(204, 204, 204));
        txt_buscarLibro.setText("Ingrese el nombre del libro");
        txt_buscarLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_buscarLibroFocusLost(evt);
            }
        });
        txt_buscarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_buscarLibroMousePressed(evt);
            }
        });
        add(txt_buscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, -1));

        lbl_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Insertar.png"))); // NOI18N
        lbl_buscar.setToolTipText("Seleccione para llenar los campos");
        lbl_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_buscarMousePressed(evt);
            }
        });
        add(lbl_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        lbl_usuario.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_usuario.setText("ISBN");
        add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txt_isbn.setEditable(false);
        txt_isbn.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_isbn.setForeground(new java.awt.Color(153, 153, 153));
        txt_isbn.setText("Clave única del libro");
        txt_isbn.setBorder(null);
        add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lbl_titulo1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_titulo1.setText("Título");
        add(lbl_titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txt_titulo.setEditable(false);
        txt_titulo.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(153, 153, 153));
        txt_titulo.setText("Título del libro");
        txt_titulo.setBorder(null);
        add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        lbl_genero.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_genero.setText("Género");
        add(lbl_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txt_genero.setEditable(false);
        txt_genero.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_genero.setForeground(new java.awt.Color(153, 153, 153));
        txt_genero.setText("Género del libro");
        txt_genero.setBorder(null);
        add(txt_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        lbl_genero1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_genero1.setText("Edición");
        add(lbl_genero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txt_edicion.setEditable(false);
        txt_edicion.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_edicion.setForeground(new java.awt.Color(153, 153, 153));
        txt_edicion.setText("Edición del libro");
        txt_edicion.setBorder(null);
        add(txt_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lbl_cantidad.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_cantidad.setText("Cantidad");
        add(lbl_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        txt_autor.setEditable(false);
        txt_autor.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_autor.setForeground(new java.awt.Color(153, 153, 153));
        txt_autor.setText("Autor");
        txt_autor.setBorder(null);
        txt_autor.setFocusCycleRoot(true);
        add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 220, -1));

        jSeparator5.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator5.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 210, -1));

        txt_id.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_id.setForeground(new java.awt.Color(153, 153, 153));
        txt_id.setBorder(null);
        add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 210, 30));

        lbl_titulo2.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_titulo2.setText("Nombre");
        add(lbl_titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        lbl_buscarID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Insertar.png"))); // NOI18N
        lbl_buscarID.setToolTipText("Buscar ID del cliente");
        lbl_buscarID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_buscarID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_buscarIDMousePressed(evt);
            }
        });
        add(lbl_buscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator6.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 210, -1));

        txt_correoCliente.setEditable(false);
        txt_correoCliente.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_correoCliente.setForeground(new java.awt.Color(153, 153, 153));
        txt_correoCliente.setBorder(null);
        add(txt_correoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 210, 30));

        lbl_titulo3.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_titulo3.setText("Correo");
        add(lbl_titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        lbl_autor.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_autor.setText("Autor");
        add(lbl_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        txt_cantidad.setEditable(false);
        txt_cantidad.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(153, 153, 153));
        txt_cantidad.setText("No. libros");
        txt_cantidad.setBorder(null);
        txt_cantidad.setFocusCycleRoot(true);
        add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        cmd_prestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_prestarMouseClicked(evt);
            }
        });

        lbl_prestar.setFont(new java.awt.Font("STIXIntegralsUp", 0, 24)); // NOI18N
        lbl_prestar.setText("Prestar");
        lbl_prestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_prestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_prestarMousePressed(evt);
            }
        });
        cmd_prestar.add(lbl_prestar);

        add(cmd_prestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 140, 50));

        lbl_autor1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_autor1.setText("Autor");
        add(lbl_autor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        txt_autor1.setEditable(false);
        txt_autor1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_autor1.setForeground(new java.awt.Color(153, 153, 153));
        txt_autor1.setText("Autor");
        txt_autor1.setBorder(null);
        txt_autor1.setFocusCycleRoot(true);
        add(txt_autor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 220, -1));

        fecha.setEnabled(false);
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, -1));

        lbl_cantidad1.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_cantidad1.setText("Fecha");
        add(lbl_cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        lbl_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
        lbl_limpiar.setToolTipText("Limpiar");
        lbl_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_limpiar.setEnabled(false);
        lbl_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_limpiarMousePressed(evt);
            }
        });
        add(lbl_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));
        add(fechaEntrega1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));
        add(fechaDevolucion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad por prestar");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        txt_CantidadPrestar.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_CantidadPrestar.setForeground(new java.awt.Color(153, 153, 153));
        txt_CantidadPrestar.setToolTipText("Ingrese el ISBN");
        txt_CantidadPrestar.setBorder(null);
        add(txt_CantidadPrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 90, 30));

        jSeparator7.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator7.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 90, 10));

        lbl_sesion1.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        lbl_sesion1.setText("Prestramos");
        add(lbl_sesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    /**
     * **
     * Hacer INSERT INTO Multa(IDMulta,CostoMulta) VALUES(01,200) ***
     */

    private void lbl_prestarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_prestarMousePressed
        long ISBN = Long.parseLong(txt_isbn.getText());
        int cantidad_actual = 0;
        int cantidad_prestamo = Integer.parseInt(txt_CantidadPrestar.getText()); // Obtener la cantidad a prestar desde un campo de texto
        int IDCliente = Integer.parseInt(txt_id.getText()); // Obtener el ID del cliente desde un campo de texto
        Date fechaEntrega = fechaEntrega1.getDate();
        Date fechaDevolucion = fechaDevolucion1.getDate();

// Generar un ID de préstamo aleatorio de 6 dígitos
        int IDPrestamo = (int) (Math.random() * 900000) + 100000;

// Generar un ID de multa aleatorio de 6 dígitos
        int IDMulta = 0;
        boolean idMultaValido = false;
        String selectMultaQuery = "SELECT IDMulta FROM Multa WHERE IDMulta=?";
        PreparedStatement selectMultaStatement = null;
        ResultSet multaResultSet = null;

        try {
            Connection connection = ConnectionSQL.getConnectionSQL();

            do {
                IDMulta = (int) (Math.random() * 900000) + 100000;

                selectMultaStatement = connection.prepareStatement(selectMultaQuery);
                selectMultaStatement.setInt(1, IDMulta);
                multaResultSet = selectMultaStatement.executeQuery();

                if (!multaResultSet.next()) {
                    idMultaValido = true;
                }

            } while (!idMultaValido);

            // Actualizar la cantidad del libro en la base de datos
            String selectQuery = "SELECT Cant FROM dbo.Libros WHERE ISBN=?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setLong(1, ISBN);
            ResultSet rs = selectStatement.executeQuery();

            if (rs.next()) {
                cantidad_actual = rs.getInt("Cant");

                if (cantidad_actual < cantidad_prestamo) {
                    System.out.println("No hay suficientes libros disponibles.");
                } else {
                    cantidad_actual -= cantidad_prestamo;

                    String updateQuery = "UPDATE dbo.Libros SET Cant=? WHERE ISBN=?";
                    PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                    updateStatement.setInt(1, cantidad_actual);
                    updateStatement.setLong(2, ISBN);
                    updateStatement.executeUpdate();
                    updateStatement.close();

                    // Insertar los datos del préstamo en la tabla PrestamoLibros
                    String insertQuery = "INSERT INTO PrestamoLibros(IDPrestamo, ISBN, IDCliente, FechaPrestamo, FechaDevolucion, IDMulta) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement Statement = connection.prepareStatement(insertQuery);
                    Statement.setInt(1, IDPrestamo);
                    Statement.setLong(2, ISBN);
                    Statement.setInt(3, IDCliente);
                    Statement.setDate(4, new java.sql.Date(fechaEntrega.getTime()));
                    Statement.setDate(5, new java.sql.Date(fechaDevolucion.getTime()));
                    Statement.setInt(6, IDMulta); // Agregar el ID de multa
                    Statement.executeUpdate();
                    Statement.close();

                    System.out.println("Préstamo registrado correctamente.");
                }
            } else {
                System.out.println("No se encontró el libro en la base de datos.");
            }

            rs.close();
            selectStatement.close();
            multaResultSet.close();
            selectMultaStatement.close();
            connection.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_prestarMousePressed

    private void txt_buscarLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarLibroFocusLost
        if (txt_buscarLibro.getText().equals("")) {
            txt_buscarLibro.setText("Ingrese el nombre del libro");
            txt_buscarLibro.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_buscarLibroFocusLost

    private void txt_buscarLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarLibroMousePressed
        if (txt_buscarLibro.getText().equals("Ingrese el nombre del libro")) {
            txt_buscarLibro.setText("");
            txt_buscarLibro.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_buscarLibroMousePressed

    private void lbl_buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_buscarMousePressed
        String buscar = txt_buscarLibro.getText();
        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String selectQuery = "SELECT * FROM dbo.Libros WHERE NombreLibro=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
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
            } else {
                System.out.println("No se encontró el libro");
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_buscarMousePressed

    private void lbl_buscarIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_buscarIDMousePressed
        int buscar = Integer.parseInt(txt_id.getText());
        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String selectQuery = "SELECT * FROM dbo.Cliente WHERE IDCliente=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setInt(1, buscar);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                txt_nombreCliente.setText(rs.getString("NombreCliente"));
                txt_correoCliente.setText(rs.getString("Email"));
            } else {
                System.out.println("No se encontró el cliente");
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_buscarIDMousePressed

    private void cmd_prestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_prestarMouseClicked
        long ISBN = Long.parseLong(txt_isbn.getText());
        int cantidad_actual = 0;
        try {
            Statement sql = ConnectionSQL.getConnectionSQL().createStatement();
            String insertarsql2 = "SELECT Cant FROM dbo.Libros WHERE ISBN=" + ISBN + ";";
            ResultSet rs = sql.executeQuery(insertarsql2);
            rs.next();
            cantidad_actual = rs.getInt("Cant");
            cantidad_actual = cantidad_actual - 1;
            System.out.println(cantidad_actual);
            String insertarsql = "UPDATE dbo.Libros SET Cant=" + cantidad_actual + " WHERE ISBN='" + ISBN + "';";
            sql.executeQuery(insertarsql);
        } catch (SQLException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_cmd_prestarMouseClicked

    private void lbl_limpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_limpiarMousePressed
        txt_isbn.setText("");
        txt_titulo.setText("");
        txt_edicion.setText("");
        txt_genero.setText("");
        txt_cantidad.setText("");
        txt_autor.setText("");
        fecha.setDate(null);
        lbl_limpiar.setEnabled(false);
        lbl_buscar.setEnabled(true);
    }//GEN-LAST:event_lbl_limpiarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cmd_prestar;
    private com.toedter.calendar.JDateChooser fecha;
    private com.toedter.calendar.JDateChooser fechaDevolucion1;
    private com.toedter.calendar.JDateChooser fechaEntrega1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_autor1;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JLabel lbl_buscarID;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_cantidad1;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_genero1;
    private javax.swing.JLabel lbl_limpiar;
    private javax.swing.JLabel lbl_prestar;
    private javax.swing.JLabel lbl_sesion1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_titulo1;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JLabel lbl_titulo3;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel lbl_usuario2;
    private javax.swing.JTextField txt_CantidadPrestar;
    private javax.swing.JTextField txt_IDPrestamo;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_autor1;
    private javax.swing.JTextField txt_buscarLibro;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_correoCliente;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
