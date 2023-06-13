package Pantallas;

import Controladores.ConnectionSQL;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Date;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

public class InsertarLibro extends javax.swing.JPanel {

    public InsertarLibro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_isbn = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_titulo = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_autor = new javax.swing.JTextField();
        lbl_autor = new javax.swing.JLabel();
        lbl_editorial = new javax.swing.JLabel();
        txt_editorial = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_genero = new javax.swing.JLabel();
        txt_genero = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_pagina = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txt_pagina = new javax.swing.JTextField();
        lbl_cantidad = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txt_cantidad = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_edicion = new javax.swing.JTextField();
        lbl_sesion1 = new javax.swing.JLabel();
        lbl_guardar = new javax.swing.JLabel();
        txt_bus = new javax.swing.JTextField();
        lbl_eliminar = new javax.swing.JLabel();
        lbl_buscar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_editar = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        lbl_limpiar = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, -1));

        txt_isbn.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_isbn.setForeground(new java.awt.Color(102, 102, 102));
        txt_isbn.setText("Ingrese el ISBN");
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
        jPanel1.add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 30));

        lbl_usuario.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_usuario.setText("ISBN");
        jPanel1.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, -1));

        txt_titulo.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(102, 102, 102));
        txt_titulo.setText("Ingrese el Título");
        txt_titulo.setToolTipText("Ingrese el Título");
        txt_titulo.setBorder(null);
        txt_titulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_tituloFocusLost(evt);
            }
        });
        txt_titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_tituloMousePressed(evt);
            }
        });
        jPanel1.add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 210, 30));

        lbl_titulo.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_titulo.setText("Título");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 210, -1));

        txt_autor.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_autor.setForeground(new java.awt.Color(102, 102, 102));
        txt_autor.setText("Ingrese el autor");
        txt_autor.setToolTipText("Ingrese el autor");
        txt_autor.setBorder(null);
        txt_autor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_autorFocusLost(evt);
            }
        });
        txt_autor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_autorMousePressed(evt);
            }
        });
        jPanel1.add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 30));

        lbl_autor.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_autor.setText("Autor");
        jPanel1.add(lbl_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lbl_editorial.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_editorial.setText("Editorial");
        jPanel1.add(lbl_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        txt_editorial.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_editorial.setForeground(new java.awt.Color(102, 102, 102));
        txt_editorial.setText("Ingrese la editorial");
        txt_editorial.setToolTipText("Ingrese la editorial");
        txt_editorial.setBorder(null);
        txt_editorial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_editorialFocusLost(evt);
            }
        });
        txt_editorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_editorialMousePressed(evt);
            }
        });
        jPanel1.add(txt_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 210, 30));

        jSeparator4.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator4.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 210, -1));

        lbl_genero.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_genero.setText("Género");
        jPanel1.add(lbl_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        txt_genero.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_genero.setForeground(new java.awt.Color(102, 102, 102));
        txt_genero.setText("Ingrese el género");
        txt_genero.setToolTipText("Ingrese el género");
        txt_genero.setBorder(null);
        txt_genero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_generoFocusLost(evt);
            }
        });
        txt_genero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_generoMousePressed(evt);
            }
        });
        jPanel1.add(txt_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 210, 30));

        jSeparator5.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator5.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 210, -1));

        lbl_pagina.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_pagina.setText("Páginas");
        jPanel1.add(lbl_pagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator7.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 70, 10));

        txt_pagina.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_pagina.setForeground(new java.awt.Color(102, 102, 102));
        txt_pagina.setText("No. páginas");
        txt_pagina.setToolTipText("Ingrese el No. páginas");
        txt_pagina.setBorder(null);
        txt_pagina.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_paginaFocusLost(evt);
            }
        });
        txt_pagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_paginaMousePressed(evt);
            }
        });
        jPanel1.add(txt_pagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 70, 30));

        lbl_cantidad.setFont(new java.awt.Font("STIXIntegralsUp", 0, 14)); // NOI18N
        lbl_cantidad.setText("Cantidad");
        jPanel1.add(lbl_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator8.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 100, 10));

        txt_cantidad.setFont(new java.awt.Font("STIXIntegralsUp", 0, 13)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(102, 102, 102));
        txt_cantidad.setText("No. libros");
        txt_cantidad.setToolTipText("Ingrese el No. libros");
        txt_cantidad.setBorder(null);
        txt_cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cantidadFocusLost(evt);
            }
        });
        txt_cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cantidadMousePressed(evt);
            }
        });
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 100, 30));

        jSeparator9.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator9.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 210, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Edición");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Fecha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        txt_edicion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txt_edicion.setForeground(new java.awt.Color(120, 120, 120));
        txt_edicion.setText("Ingrese la edición");
        txt_edicion.setToolTipText("Ingrese la edición");
        txt_edicion.setBorder(null);
        txt_edicion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_edicionFocusLost(evt);
            }
        });
        txt_edicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_edicionMousePressed(evt);
            }
        });
        jPanel1.add(txt_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 210, 30));

        lbl_sesion1.setFont(new java.awt.Font("STIXIntegralsUp", 1, 24)); // NOI18N
        lbl_sesion1.setText("Libros");
        jPanel1.add(lbl_sesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 30));

        lbl_guardar.setFont(new java.awt.Font("STIXIntegralsUp", 0, 18)); // NOI18N
        lbl_guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_guardar.setText("Guardar Libro");
        lbl_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_guardarMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 150, 30));

        txt_bus.setForeground(new java.awt.Color(204, 204, 204));
        txt_bus.setText("Ingrese el nombre del libro si desea modificar o borrar");
        txt_bus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_busFocusLost(evt);
            }
        });
        txt_bus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_busMousePressed(evt);
            }
        });
        jPanel1.add(txt_bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, 40));

        lbl_eliminar.setFont(new java.awt.Font("STIXIntegralsUp", 0, 18)); // NOI18N
        lbl_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_eliminar.setText("Eliminar");
        lbl_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eliminarMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 100, 30));

        lbl_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Insertar.png"))); // NOI18N
        lbl_buscar.setToolTipText("Seleccione para llenar los campos");
        lbl_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_buscarMousePressed(evt);
            }
        });
        jPanel1.add(lbl_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, 370));

        lbl_editar.setFont(new java.awt.Font("STIXIntegralsUp", 0, 18)); // NOI18N
        lbl_editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_editar.setText("Editar");
        lbl_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_editarMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 100, 30));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 150, -1));

        lbl_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
        lbl_limpiar.setToolTipText("Limpiar");
        lbl_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_limpiar.setEnabled(false);
        lbl_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_limpiarMousePressed(evt);
            }
        });
        jPanel1.add(lbl_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_isbnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_isbnFocusLost
        if (txt_isbn.getText().equals("")) {
            txt_isbn.setText("Ingrese el ISBN");
            txt_isbn.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_isbnFocusLost

    private void txt_isbnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_isbnMousePressed
        if (txt_isbn.getText().equals("Ingrese el ISBN")) {
            txt_isbn.setText("");
            txt_isbn.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_isbnMousePressed

    private void txt_tituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tituloFocusLost
        if (txt_titulo.getText().equals("")) {
            txt_titulo.setText("Ingrese el Titulo");
            txt_titulo.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_tituloFocusLost

    private void txt_tituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tituloMousePressed
        if (txt_titulo.getText().equals("Ingrese el Titulo")) {
            txt_titulo.setText("");
            txt_titulo.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_tituloMousePressed

    private void txt_autorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_autorFocusLost
        if (txt_autor.getText().equals("")) {
            txt_autor.setText("Ingrese el autor");
            txt_autor.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_autorFocusLost

    private void txt_autorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_autorMousePressed
        if (txt_autor.getText().equals("Ingrese el autor")) {
            txt_autor.setText("");
            txt_autor.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_autorMousePressed

    private void txt_editorialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_editorialFocusLost
        if (txt_editorial.getText().equals("")) {
            txt_editorial.setText("Ingrese la editorial");
            txt_editorial.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_editorialFocusLost

    private void txt_editorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_editorialMousePressed
        if (txt_editorial.getText().equals("Ingrese la editorial")) {
            txt_editorial.setText("");
            txt_editorial.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_editorialMousePressed

    private void txt_generoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_generoFocusLost
        if (txt_genero.getText().equals("")) {
            txt_genero.setText("Ingrese el genero");
            txt_genero.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_generoFocusLost

    private void txt_generoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_generoMousePressed
        if (txt_genero.getText().equals("Ingrese el genero")) {
            txt_genero.setText("");
            txt_genero.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_generoMousePressed

    private void txt_paginaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_paginaFocusLost
        if (txt_pagina.getText().equals("")) {
            txt_pagina.setText("No. paginas");
            txt_pagina.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_paginaFocusLost

    private void txt_paginaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_paginaMousePressed
        if (txt_pagina.getText().equals("No. paginas")) {
            txt_pagina.setText("");
            txt_pagina.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_paginaMousePressed

    private void txt_cantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cantidadFocusLost
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("No. libros");
            txt_cantidad.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_cantidadFocusLost

    private void txt_cantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cantidadMousePressed
        if (txt_cantidad.getText().equals("No. libros")) {
            txt_cantidad.setText("");
            txt_cantidad.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_cantidadMousePressed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        if (txt_cantidad.getText().equals("No. libros")) {
            txt_cantidad.setText("");
            txt_cantidad.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void txt_edicionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_edicionFocusLost
        if (txt_edicion.getText().equals("")) {
            txt_edicion.setText("Ingrese la edicion");
            txt_edicion.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_edicionFocusLost

    private void txt_edicionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_edicionMousePressed
        if (txt_edicion.getText().equals("Ingrese la edicion")) {
            txt_edicion.setText("");
            txt_edicion.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_edicionMousePressed

    private void lbl_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseClicked
        String autor = txt_autor.getText();
        int cantidad = Integer.parseInt(txt_cantidad.getText());
        String editorial = txt_editorial.getText();
        String genero = txt_genero.getText();
        Date fecha1 = fecha.getDate();
        int paginas = Integer.parseInt(txt_pagina.getText());
        String edicion = txt_edicion.getText();
        String titulo = txt_titulo.getText();

        long ISBN;
        String isbnInput = txt_isbn.getText();

        // Validar el formato del ISBN
        if (!isbnInput.matches("\\d{13}")) {
            JOptionPane.showMessageDialog(null, "El ISBN debe contener exactamente 13 dígitos numéricos");
            return;
        }

        ISBN = Long.parseLong(isbnInput);

        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String insertarsql = "INSERT INTO Libros (ISBN, FechaPublicacion, Edicion, NombreLibro, Genero, Editorial, Autor, Cant, Paginas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertarsql);
            statement.setLong(1, ISBN);
            statement.setDate(2, new java.sql.Date(fecha1.getTime()));
            statement.setString(3, edicion);
            statement.setString(4, titulo);
            statement.setString(5, genero);
            statement.setString(6, editorial);
            statement.setString(7, autor);
            statement.setInt(8, cantidad);
            statement.setInt(9, paginas);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Libro guardado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el libro");
            }

            statement.close();
            connection.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_guardarMouseClicked

    private void txt_busFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_busFocusLost
        if (txt_bus.getText().equals("")) {
            txt_bus.setText("Ingrese el nombre del libro si desea modificar o borrar");
            txt_bus.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_busFocusLost

    private void txt_busMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_busMousePressed
        if (txt_bus.getText().equals("Ingrese el nombre del libro si desea modificar o borrar")) {
            txt_bus.setText("");
            txt_bus.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_busMousePressed

    private void lbl_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarMouseClicked
        String buscar = txt_bus.getText();
        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String deleteQuery = "DELETE FROM Libros WHERE NombreLibro = ?";
            PreparedStatement statement = connection.prepareStatement(deleteQuery);
            statement.setString(1, buscar);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el libro a eliminar");
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_eliminarMouseClicked

    private void lbl_buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_buscarMousePressed
        String buscar = txt_bus.getText();
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
                fecha.setDate(rs.getDate("FechaPublicacion"));
                txt_edicion.setText(rs.getString("Edicion"));
                txt_titulo.setText(rs.getString("NombreLibro"));
                txt_cantidad.setText(rs.getString("Cant"));
                txt_pagina.setText(rs.getString("Paginas"));
                txt_editorial.setText(rs.getString("Editorial"));
                txt_autor.setText(rs.getString("Autor"));
                txt_genero.setText(rs.getString("Genero"));

                lbl_limpiar.setEnabled(true);
                lbl_buscar.setEnabled(false);
                txt_bus.setEnabled(false);

                JOptionPane.showMessageDialog(null, "Libro encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el libro");
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_buscarMousePressed

    private void lbl_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editarMouseClicked
        String buscar = txt_bus.getText();
        String isbnInput = txt_isbn.getText();
        String autor = txt_autor.getText();
        String editorial = txt_editorial.getText();
        String genero = txt_genero.getText();
        Date fecha1 = fecha.getDate();
        String edicion = txt_edicion.getText();
        String titulo = txt_titulo.getText();

        int cantidad = 0;
        int paginas = 0;

        try {
            cantidad = Integer.parseInt(txt_cantidad.getText());
            paginas = Integer.parseInt(txt_pagina.getText());
            if (cantidad < 0 && paginas < 0) {
                JOptionPane.showMessageDialog(null, "La cantidad y las páginas deben ser mayores o iguales a cero");
                return;
            } else if (cantidad < 0) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor o igual a cero");
                return;
            } else if (paginas < 0) {
                JOptionPane.showMessageDialog(null, "Las páginas deben ser mayores o iguales a cero");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidad y las páginas deben ser números enteros");
            return;
        }

        // Validar el formato del ISBN
        if (!isbnInput.matches("\\d{13}")) {
            JOptionPane.showMessageDialog(null, "El ISBN debe contener exactamente 13 dígitos numéricos");
            return;
        }

        long ISBN = Long.parseLong(isbnInput);

        try {
            Connection connection = ConnectionSQL.getConnectionSQL();
            String insertarsql = "UPDATE Libros SET Autor = ?, Cant = ?, Editorial = ?, Genero = ?, FechaPublicacion = ?, Paginas = ?, Edicion = ?, NombreLibro = ?, ISBN = ? WHERE NombreLibro = ?";
            PreparedStatement statement = connection.prepareStatement(insertarsql);
            statement.setString(1, autor);
            statement.setInt(2, cantidad);
            statement.setString(3, editorial);
            statement.setString(4, genero);
            statement.setDate(5, new java.sql.Date(fecha1.getTime()));
            statement.setInt(6, paginas);
            statement.setString(7, edicion);
            statement.setString(8, titulo);
            statement.setLong(9, ISBN);
            statement.setString(10, buscar);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Editado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el libro a editar");
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_editarMouseClicked

    private void lbl_limpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_limpiarMousePressed
        txt_bus.setText("Ingrese el nombre del libro si desea modificar o borrar");
        txt_bus.setForeground(Color.GRAY);
        txt_isbn.setText("Ingrese el ISBN");
        txt_titulo.setText("Ingrese el Titulo");
        txt_autor.setText("Ingrese el autor");
        txt_editorial.setText("Ingrese la editorial");
        txt_edicion.setText("Ingrese la edicion");
        txt_genero.setText("Ingrese el genero");
        txt_cantidad.setText("No. libros");
        txt_pagina.setText("No. paginas");
        fecha.setDate(null);

        lbl_limpiar.setEnabled(false);
        lbl_buscar.setEnabled(true);
        txt_bus.setEnabled(true);
    }//GEN-LAST:event_lbl_limpiarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_editar;
    private javax.swing.JLabel lbl_editorial;
    private javax.swing.JLabel lbl_eliminar;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_guardar;
    private javax.swing.JLabel lbl_limpiar;
    private javax.swing.JLabel lbl_pagina;
    private javax.swing.JLabel lbl_sesion1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_bus;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_pagina;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
