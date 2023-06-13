package Pantallas;

import java.text.SimpleDateFormat;
import java.awt.BorderLayout;
import Informacion.Creditos;
import java.util.*;
import javax.swing.*;

public class Inicio extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos;
    Thread hilo;

    int flag = 0;
    int xMouse, yMouse;

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlag() {
        return flag;
    }

    public Inicio() {
        initComponents();

        lbl_fecha.setText(fecha());

        hilo = new Thread(this);
        hilo.start();
        setVisible(true);

        InicioMenu im = new InicioMenu();
        im.setSize(669, 503);
        im.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(im, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public void run() {
        Thread current = Thread.currentThread();

        while (current == hilo) {
            hora();
            lbl_hora.setText(hora + ":" + minutos + ":" + segundos);
        }

        // Verificar si es la hora en la que se debe cerrar la ventana
        if (hora.equals("20") && minutos.equals("47")) { // Cambia la hora y los minutos según tus necesidades
            // Mostrar mensaje de cierre
            JOptionPane.showMessageDialog(this, "Es hora de cerrar el programa", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            // Cerrar la ventana actual
            dispose();

            // Abrir otra ventana (por ejemplo, VentanaCierre) con el mensaje de cierre
            Sesion corteCaja = new Sesion();
            corteCaja.setVisible(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_libros2 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        lbl_cliente = new javax.swing.JLabel();
        lbl_prestamo = new javax.swing.JLabel();
        lbl_libros = new javax.swing.JLabel();
        lbl_cuenta1 = new javax.swing.JLabel();
        lbl_devoluciones = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_menu = new javax.swing.JLabel();
        lbl_proveedores = new javax.swing.JLabel();
        lbl_registrar = new javax.swing.JLabel();
        lbl_informacion = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Mover = new javax.swing.JPanel();

        lbl_libros2.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbl_libros2.setForeground(new java.awt.Color(204, 102, 0));
        lbl_libros2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_libros2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Archivo.png"))); // NOI18N
        lbl_libros2.setText("Reportes");
        lbl_libros2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbl_libros2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_libros2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_libros2.setIconTextGap(15);
        lbl_libros2.setName("lbl_consultas"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(234, 225, 198));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(234, 225, 198));
        Menu.setName(""); // NOI18N
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cliente.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbl_cliente.setForeground(new java.awt.Color(204, 102, 0));
        lbl_cliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CuentaMultiple.png"))); // NOI18N
        lbl_cliente.setText("Cliente");
        lbl_cliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbl_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_cliente.setIconTextGap(15);
        lbl_cliente.setName("lbl_cliente"); // NOI18N
        lbl_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_clienteMousePressed(evt);
            }
        });
        Menu.add(lbl_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 217, 40));

        lbl_prestamo.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbl_prestamo.setForeground(new java.awt.Color(204, 102, 0));
        lbl_prestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_prestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Calendario.png"))); // NOI18N
        lbl_prestamo.setText("Prestamo");
        lbl_prestamo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbl_prestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_prestamo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_prestamo.setIconTextGap(15);
        lbl_prestamo.setName("lbl_consultas"); // NOI18N
        lbl_prestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_prestamoMouseClicked(evt);
            }
        });
        Menu.add(lbl_prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 204, 40));

        lbl_libros.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbl_libros.setForeground(new java.awt.Color(204, 102, 0));
        lbl_libros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LibroAbierto.png"))); // NOI18N
        lbl_libros.setText("Libros");
        lbl_libros.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbl_libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_libros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_libros.setIconTextGap(15);
        lbl_libros.setName("lbl_consultas"); // NOI18N
        lbl_libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_librosMousePressed(evt);
            }
        });
        Menu.add(lbl_libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 216, 40));

        lbl_cuenta1.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbl_cuenta1.setForeground(new java.awt.Color(204, 102, 0));
        lbl_cuenta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_cuenta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrarSesion.png"))); // NOI18N
        lbl_cuenta1.setText("Cerrar Sesion");
        lbl_cuenta1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbl_cuenta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_cuenta1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_cuenta1.setIconTextGap(10);
        lbl_cuenta1.setName("lbl_cuenta"); // NOI18N
        lbl_cuenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_cuenta1MousePressed(evt);
            }
        });
        Menu.add(lbl_cuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 217, 50));

        lbl_devoluciones.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbl_devoluciones.setForeground(new java.awt.Color(204, 102, 0));
        lbl_devoluciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CalendarioMultiple.png"))); // NOI18N
        lbl_devoluciones.setText("Devoluciones");
        lbl_devoluciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbl_devoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_devoluciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_devoluciones.setIconTextGap(15);
        lbl_devoluciones.setName("lbl_consultas"); // NOI18N
        lbl_devoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_devolucionesMousePressed(evt);
            }
        });
        Menu.add(lbl_devoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 216, 40));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, 217, 10));
        Menu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 206, 10));

        lbl_menu.setFont(new java.awt.Font("STIXIntegralsUp", 0, 24)); // NOI18N
        lbl_menu.setForeground(new java.awt.Color(204, 102, 0));
        lbl_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Hogar.png"))); // NOI18N
        lbl_menu.setText("Inicio");
        lbl_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_menu.setIconTextGap(15);
        lbl_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_menuMouseClicked(evt);
            }
        });
        Menu.add(lbl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 207, 40));

        lbl_proveedores.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbl_proveedores.setForeground(new java.awt.Color(204, 102, 0));
        lbl_proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/prove.png"))); // NOI18N
        lbl_proveedores.setText("Proveedores");
        lbl_proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_proveedores.setIconTextGap(15);
        lbl_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_proveedoresMousePressed(evt);
            }
        });
        Menu.add(lbl_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, 40));

        lbl_registrar.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbl_registrar.setForeground(new java.awt.Color(204, 102, 0));
        lbl_registrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usbiblio.png"))); // NOI18N
        lbl_registrar.setText("Registrar");
        lbl_registrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbl_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_registrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_registrar.setIconTextGap(15);
        lbl_registrar.setName("lbl_consultas"); // NOI18N
        lbl_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_registrarMousePressed(evt);
            }
        });
        Menu.add(lbl_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 216, 40));

        lbl_informacion.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbl_informacion.setForeground(new java.awt.Color(204, 102, 0));
        lbl_informacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CalendarioMultiple.png"))); // NOI18N
        lbl_informacion.setText("Créditos");
        lbl_informacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbl_informacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_informacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_informacion.setIconTextGap(15);
        lbl_informacion.setName("lbl_consultas"); // NOI18N
        lbl_informacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_informacionMousePressed(evt);
            }
        });
        Menu.add(lbl_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 216, 50));

        lbl_fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fecha.setText("DD/MM/YYYY");
        Menu.add(lbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lbl_hora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_hora.setText("00:00:00");
        Menu.add(lbl_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 640));

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setPreferredSize(new java.awt.Dimension(669, 503));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 680, 503));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LibreriaFondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 680, 640));

        Mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoverMouseDragged(evt);
            }
        });
        Mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MoverLayout = new javax.swing.GroupLayout(Mover);
        Mover.setLayout(MoverLayout);
        MoverLayout.setHorizontalGroup(
            MoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        MoverLayout.setVerticalGroup(
            MoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(Mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoverMousePressed

    private void MoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoverMouseDragged

    private void lbl_prestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_prestamoMouseClicked
        Prestamo pre = new Prestamo();
        pre.setSize(669, 503);
        pre.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(pre, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_lbl_prestamoMouseClicked

    private void lbl_inicioMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void lbl_clienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_clienteMousePressed
        Cliente us = new Cliente();
        us.setSize(669, 503);
        us.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(us, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_lbl_clienteMousePressed

    private void lbl_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menuMouseClicked
        InicioMenu im = new InicioMenu();
        im.setSize(669, 503);
        im.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(im, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_lbl_menuMouseClicked

    private void lbl_devolucionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_devolucionesMousePressed
        Devoluciones dev = new Devoluciones();
        dev.setSize(669, 503);
        dev.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(dev, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_lbl_devolucionesMousePressed

    private void lbl_proveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_proveedoresMousePressed
        Proveedor prov = new Proveedor();
        prov.setSize(669, 503);
        prov.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(prov, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_lbl_proveedoresMousePressed

    private void lbl_librosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_librosMousePressed
        InsertarLibro il = new InsertarLibro();
        il.jPanel1.setSize(669, 503);
        il.jPanel1.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(il.jPanel1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_lbl_librosMousePressed

    private void lbl_cuenta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cuenta1MousePressed
        Sesion ini = new Sesion();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_cuenta1MousePressed

    private void lbl_registrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registrarMousePressed
        Registro reg = new Registro();
        reg.setSize(669, 503);
        reg.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(reg, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_lbl_registrarMousePressed

    private void lbl_informacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_informacionMousePressed
        Creditos cre = new Creditos();
        cre.setSize(669, 503);
        cre.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(cre, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_lbl_informacionMousePressed

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Mover;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_cuenta1;
    private javax.swing.JLabel lbl_devoluciones;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_informacion;
    private javax.swing.JLabel lbl_libros;
    private javax.swing.JLabel lbl_libros2;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_prestamo;
    private javax.swing.JLabel lbl_proveedores;
    private javax.swing.JLabel lbl_registrar;
    // End of variables declaration//GEN-END:variables
}
