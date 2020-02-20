/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Connection.ConnectionFactory;
import DAO.BarcoDAO;
import Entidades.Barco;
import Entidades.Socio;
import static Ventanas.ListaSocios.socios;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanc
 */
public class ListaBarcos extends javax.swing.JFrame {

    /**
     * Creates new form ListaBarcos
     */
    public ListaBarcos(ConnectionFactory connection, BarcoDAO barcos) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ListaBarcos.connection = connection;
        ListaBarcos.barcos = barcos;
        cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloBarcos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBarcos = new javax.swing.JTable();
        agregarBarco = new javax.swing.JButton();
        salidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 450));
        getContentPane().setLayout(null);

        tituloBarcos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tituloBarcos.setText("Barcos");
        getContentPane().add(tituloBarcos);
        tituloBarcos.setBounds(240, 10, 130, 60);

        tablaBarcos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Barco", "Nombre", "ID Socio", "Amarre", "Cuota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBarcos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBarcosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBarcos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 620, 300);

        agregarBarco.setText("Agregar");
        agregarBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBarcoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarBarco);
        agregarBarco.setBounds(70, 380, 79, 25);

        salidas.setText("Salidas");
        salidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidasActionPerformed(evt);
            }
        });
        getContentPane().add(salidas);
        salidas.setBounds(430, 380, 73, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBarcoActionPerformed
        AgregarBarco agregar = new AgregarBarco(connection, barcos);
        agregar.setVisible(true);
    }//GEN-LAST:event_agregarBarcoActionPerformed

    private void tablaBarcosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBarcosMouseClicked
        DefaultTableModel model = (DefaultTableModel)tablaBarcos.getModel();
        int selectedRow = tablaBarcos.getSelectedRow();
        
        int id = (int) model.getValueAt(selectedRow, 0);
        try {            
            BarcoModificar actualizar = new BarcoModificar(id, connection, barcos);
            actualizar.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ListaSocios.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        this.dispose();
    }//GEN-LAST:event_tablaBarcosMouseClicked

    private void salidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidasActionPerformed
        ListaSalidas ls = new ListaSalidas(connection);
        ls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salidasActionPerformed

    public void cargar(){
        ArrayList<Barco> lista = new ArrayList<>();             
        
        try {
            lista = (ArrayList<Barco>) barcos.getAll();
        } catch (Exception ex) {
            Logger.getLogger(ListaSocios.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        for(int i = 0; i< lista.size(); i++){
            Barco barco = lista.get(i);
            int idBarco = barco.getIdBarco();
            int idSocio = barco.getIdSocio();
            String nombre = barco.getNombreBarco();
            int amarre = barco.getNumAmarre();
            int cuota = barco.getCuotaAmarre();
            
            tablaBarcos.setValueAt(idBarco, i, 0);
            tablaBarcos.setValueAt(nombre, i, 1);
            tablaBarcos.setValueAt(idSocio, i, 2);          
            tablaBarcos.setValueAt(amarre, i, 3);
            tablaBarcos.setValueAt(cuota, i, 4);
            
        }
    }
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
            java.util.logging.Logger.getLogger(ListaBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaBarcos(connection, barcos).setVisible(true);
            }
        });
    }

    static ConnectionFactory connection;
    static BarcoDAO barcos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBarco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salidas;
    private javax.swing.JTable tablaBarcos;
    private javax.swing.JLabel tituloBarcos;
    // End of variables declaration//GEN-END:variables
}
