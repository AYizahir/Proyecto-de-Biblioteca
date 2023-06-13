package Pantallas_Emp;

import Pantallas.*;

public class Reportes_Emp extends javax.swing.JPanel {

    public Reportes_Emp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_bus2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_bus2.setFont(new java.awt.Font("STIXIntegralsUp", 1, 36)); // NOI18N
        lbl_bus2.setText("Reportes");
        add(lbl_bus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, 50));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 300, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 70, 540, 350));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_bus2;
    // End of variables declaration//GEN-END:variables
}
