/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Connection.ConnectionFactory;
import DAO.SalidaDAO;
import Entidades.Salida;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author juanc
 */
public class AgregarSalida extends javax.swing.JFrame {

    /**
     * Creates new form AgregarSalida
     */
    public AgregarSalida(ConnectionFactory connection, SalidaDAO salidas) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.connection = connection;
        this.salidas = salidas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloAgregarSalida = new javax.swing.JLabel();
        labelIdBarco = new javax.swing.JLabel();
        labelDestino = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        areaHora = new javax.swing.JTextField();
        areaIdBarco = new javax.swing.JTextField();
        areaDestino = new javax.swing.JTextField();
        areaFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 450));
        setMinimumSize(new java.awt.Dimension(620, 450));
        getContentPane().setLayout(null);

        tituloAgregarSalida.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tituloAgregarSalida.setText("Agregar Salida");
        getContentPane().add(tituloAgregarSalida);
        tituloAgregarSalida.setBounds(180, 20, 240, 60);

        labelIdBarco.setText("ID Barco");
        getContentPane().add(labelIdBarco);
        labelIdBarco.setBounds(60, 130, 50, 16);

        labelDestino.setText("Destino");
        getContentPane().add(labelDestino);
        labelDestino.setBounds(60, 170, 60, 16);

        labelFecha.setText("Fecha");
        getContentPane().add(labelFecha);
        labelFecha.setBounds(60, 220, 34, 16);

        labelHora.setText("Hora");
        getContentPane().add(labelHora);
        labelHora.setBounds(60, 270, 50, 16);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(340, 380, 100, 25);

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar);
        guardar.setBounds(150, 380, 79, 25);
        getContentPane().add(areaHora);
        areaHora.setBounds(130, 270, 390, 22);
        getContentPane().add(areaIdBarco);
        areaIdBarco.setBounds(130, 130, 390, 22);
        getContentPane().add(areaDestino);
        areaDestino.setBounds(130, 170, 390, 22);
        getContentPane().add(areaFecha);
        areaFecha.setBounds(130, 220, 390, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Salida salidaNueva = new Salida();
        salidaNueva.setIdBarco(Integer.parseInt(areaIdBarco.getText()));
        salidaNueva.setDestino(areaDestino.getText());
        salidaNueva.setFecha(areaFecha.getText());
        salidaNueva.setHora(Integer.parseInt(areaHora.getText()));
        
        try {
            salidas.add(salidaNueva);
        } catch (Exception ex) {
            Logger.getLogger(AgregarSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ListaSalidas ls = new ListaSalidas(connection);
        ls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarSalida(connection, salidas).setVisible(true);
            }
        });
    }

    static ConnectionFactory connection;
    static SalidaDAO salidas;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaDestino;
    private javax.swing.JTextField areaFecha;
    private javax.swing.JTextField areaHora;
    private javax.swing.JTextField areaIdBarco;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelIdBarco;
    private javax.swing.JLabel tituloAgregarSalida;
    // End of variables declaration//GEN-END:variables
}
