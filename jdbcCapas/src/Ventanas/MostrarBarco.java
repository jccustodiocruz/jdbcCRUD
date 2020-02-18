package Ventanas;

public class MostrarBarco extends javax.swing.JFrame {

    public MostrarBarco() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laberIdBarco = new javax.swing.JLabel();
        labelNombreBarco = new javax.swing.JLabel();
        labelIdSocio = new javax.swing.JLabel();
        labelAmarre = new javax.swing.JLabel();
        labelCuota = new javax.swing.JLabel();
        eliminarBarco = new javax.swing.JButton();
        actualizarBarco = new javax.swing.JButton();
        areaCuota = new javax.swing.JTextField();
        areaNombreBarco = new javax.swing.JTextField();
        areaIdBarco = new javax.swing.JTextField();
        areaIdSocio = new javax.swing.JTextField();
        areaAmarre = new javax.swing.JTextField();

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

        eliminarBarco.setText("Eliminar");
        getContentPane().add(eliminarBarco);
        eliminarBarco.setBounds(360, 340, 100, 25);

        actualizarBarco.setText("Actualizar");
        getContentPane().add(actualizarBarco);
        actualizarBarco.setBounds(180, 340, 100, 25);
        getContentPane().add(areaCuota);
        areaCuota.setBounds(130, 260, 390, 22);

        areaNombreBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaNombreBarcoActionPerformed(evt);
            }
        });
        getContentPane().add(areaNombreBarco);
        areaNombreBarco.setBounds(130, 100, 390, 22);
        getContentPane().add(areaIdBarco);
        areaIdBarco.setBounds(130, 140, 390, 22);
        getContentPane().add(areaIdSocio);
        areaIdSocio.setBounds(130, 180, 390, 22);
        getContentPane().add(areaAmarre);
        areaAmarre.setBounds(130, 220, 390, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaNombreBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaNombreBarcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaNombreBarcoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarBarco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBarco;
    private javax.swing.JTextField areaAmarre;
    private javax.swing.JTextField areaCuota;
    private javax.swing.JTextField areaIdBarco;
    private javax.swing.JTextField areaIdSocio;
    private javax.swing.JTextField areaNombreBarco;
    private javax.swing.JButton eliminarBarco;
    private javax.swing.JLabel labelAmarre;
    private javax.swing.JLabel labelCuota;
    private javax.swing.JLabel labelIdSocio;
    private javax.swing.JLabel labelNombreBarco;
    private javax.swing.JLabel laberIdBarco;
    // End of variables declaration//GEN-END:variables
}
