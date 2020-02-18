/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import DAO.SocioDaoImp;
import Entidades.Socio;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author juanc
 */
public class ListaSocios extends javax.swing.JFrame {

    /**
     * Creates new form ListaSocios
     */
    public ListaSocios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Principal principal = new Principal();
        ArrayList<Socio> lista = new ArrayList<>();

        SocioDaoImp socioLista = principal.socios;               

//        try {
//            lista = socioLista.getAll();
//        } catch (Exception ex) {
//            Logger.getLogger(ListaSocios.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//
//        for (int i = 0; i < lista.size(); i++) {
//            Socio socio = lista.get(i);
//            for (int j = 0; j < 3; j++) {
//                if (j == 0) {
//                    tablaSocios.setValueAt(socio.getId(), i, j);
//                } else if (j == 1) {
//                    tablaSocios.setValueAt(socio.getNombre(), i, j);
//                } else if (j == 2) {
//                    tablaSocios.setValueAt(socio.getDireccion(), i, j);
//                }
//            }
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulosSocios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSocios = new javax.swing.JTable();
        agregarSocio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 450));
        setMinimumSize(new java.awt.Dimension(620, 450));
        getContentPane().setLayout(null);

        titulosSocios.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titulosSocios.setText("Socios");
        getContentPane().add(titulosSocios);
        titulosSocios.setBounds(240, 10, 120, 60);

        tablaSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Socio", "Nombre", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSocios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 620, 300);

        agregarSocio.setText("Agregar");
        agregarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarSocioActionPerformed(evt);
            }
        });
        getContentPane().add(agregarSocio);
        agregarSocio.setBounds(260, 380, 79, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarSocioActionPerformed
        agregarSocio agregar = new agregarSocio();
        agregar.setVisible(true);
    }//GEN-LAST:event_agregarSocioActionPerformed

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
            java.util.logging.Logger.getLogger(ListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaSocios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarSocio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSocios;
    private javax.swing.JLabel titulosSocios;
    // End of variables declaration//GEN-END:variables
}
