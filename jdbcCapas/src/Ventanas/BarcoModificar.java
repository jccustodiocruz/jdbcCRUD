package Ventanas;

import Connection.ConnectionFactory;
import DAO.BarcoDAO;
import Entidades.Barco;
import Entidades.Socio;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BarcoModificar extends javax.swing.JFrame {

    public BarcoModificar(int id, ConnectionFactory connection, BarcoDAO barcos) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.id = id;
        this.connection = connection;
        this.barcos = barcos;
        try {
            Barco barco = barcos.find(id);
            areaNombreBarco.setText(barco.getNombreBarco());
            areaIdBarco.setText(Integer.toString(barco.getIdBarco()));
            areaSocio.setText(Integer.toString(barco.getIdSocio()));
            areaAmarre.setText(Integer.toString(barco.getNumAmarre()));
            areaCuota.setText(Integer.toString(barco.getCuotaAmarre()));
        } catch (Exception ex) {
            Logger.getLogger(SocioModificar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laberIdBarco = new javax.swing.JLabel();
        labelNombreBarco = new javax.swing.JLabel();
        labelIdSocio = new javax.swing.JLabel();
        labelAmarre = new javax.swing.JLabel();
        labelCuota = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        areaCuota = new javax.swing.JTextField();
        areaNombreBarco = new javax.swing.JTextField();
        areaIdBarco = new javax.swing.JTextField();
        areaSocio = new javax.swing.JTextField();
        areaAmarre = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 450));
        getContentPane().setLayout(null);

        laberIdBarco.setText("ID Barco");
        getContentPane().add(laberIdBarco);
        laberIdBarco.setBounds(60, 140, 70, 16);

        labelNombreBarco.setText("Nombre");
        getContentPane().add(labelNombreBarco);
        labelNombreBarco.setBounds(60, 100, 45, 16);

        labelIdSocio.setText("ID Socio");
        getContentPane().add(labelIdSocio);
        labelIdSocio.setBounds(60, 180, 70, 16);

        labelAmarre.setText("Amarre");
        getContentPane().add(labelAmarre);
        labelAmarre.setBounds(60, 220, 70, 16);

        labelCuota.setText("Cuota");
        getContentPane().add(labelCuota);
        labelCuota.setBounds(60, 260, 70, 16);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(420, 340, 100, 25);

        guardar.setText("Guardar");
        getContentPane().add(guardar);
        guardar.setBounds(110, 340, 100, 25);
        getContentPane().add(areaCuota);
        areaCuota.setBounds(130, 260, 390, 22);

        areaNombreBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaNombreBarcoActionPerformed(evt);
            }
        });
        getContentPane().add(areaNombreBarco);
        areaNombreBarco.setBounds(130, 100, 390, 22);

        areaIdBarco.setEditable(false);
        getContentPane().add(areaIdBarco);
        areaIdBarco.setBounds(130, 140, 390, 22);

        areaSocio.setEditable(false);
        getContentPane().add(areaSocio);
        areaSocio.setBounds(130, 180, 390, 22);
        getContentPane().add(areaAmarre);
        areaAmarre.setBounds(130, 220, 390, 22);

        eliminar.setText("Eliminar");
        getContentPane().add(eliminar);
        eliminar.setBounds(270, 340, 100, 25);

        jButton1.setText("Agregar Salida");
        getContentPane().add(jButton1);
        jButton1.setBounds(379, 40, 140, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaNombreBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaNombreBarcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaNombreBarcoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarcoModificar(id, connection, barcos).setVisible(true);
            }
        });
    }

    static ConnectionFactory connection;
    static BarcoDAO barcos;
    static int id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaAmarre;
    private javax.swing.JTextField areaCuota;
    private javax.swing.JTextField areaIdBarco;
    private javax.swing.JTextField areaNombreBarco;
    private javax.swing.JTextField areaSocio;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelAmarre;
    private javax.swing.JLabel labelCuota;
    private javax.swing.JLabel labelIdSocio;
    private javax.swing.JLabel labelNombreBarco;
    private javax.swing.JLabel laberIdBarco;
    // End of variables declaration//GEN-END:variables
}
