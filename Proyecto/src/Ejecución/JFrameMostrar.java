
package Ejecución;

import Objetos.*;
import Estructuras.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class JFrameMostrar extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMostrar
     */
    public JFrameMostrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoBordó = new javax.swing.JLabel();
        MostrarUnaBoton = new javax.swing.JButton();
        MostrarTodosBoton = new javax.swing.JButton();
        VolverBoton = new javax.swing.JButton();
        FondoBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoBordó.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo41.png"))); // NOI18N
        getContentPane().add(FondoBordó, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        MostrarUnaBoton.setBackground(new java.awt.Color(102, 0, 0));
        MostrarUnaBoton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MostrarUnaBoton.setForeground(new java.awt.Color(255, 255, 255));
        MostrarUnaBoton.setText("Mostrar datos de una persona");
        MostrarUnaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarUnaBotonActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarUnaBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 210, 50));

        MostrarTodosBoton.setBackground(new java.awt.Color(102, 0, 0));
        MostrarTodosBoton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MostrarTodosBoton.setForeground(new java.awt.Color(255, 255, 255));
        MostrarTodosBoton.setText("Mostrar datos de todos");
        MostrarTodosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTodosBotonActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarTodosBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 210, 50));

        VolverBoton.setBackground(new java.awt.Color(51, 51, 51));
        VolverBoton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VolverBoton.setForeground(new java.awt.Color(255, 255, 255));
        VolverBoton.setText("Volver");
        VolverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBotonActionPerformed(evt);
            }
        });
        getContentPane().add(VolverBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 210, 50));

        FondoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2222.png"))); // NOI18N
        getContentPane().add(FondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarUnaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarUnaBotonActionPerformed
        // TODO add your handling code here:
        new JDialog_MostrarUno(this,true).setVisible(true);
    }//GEN-LAST:event_MostrarUnaBotonActionPerformed

    private void MostrarTodosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTodosBotonActionPerformed
        // TODO add your handling code here:
        new JDialog_MostrarDatos(this,true).setVisible(true);
    }//GEN-LAST:event_MostrarTodosBotonActionPerformed

    private void VolverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBotonActionPerformed
        // BOTÓN SALIR
        this.setVisible(false);
    }//GEN-LAST:event_VolverBotonActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoBlanco;
    private javax.swing.JLabel FondoBordó;
    private javax.swing.JButton MostrarTodosBoton;
    private javax.swing.JButton MostrarUnaBoton;
    private javax.swing.JButton VolverBoton;
    // End of variables declaration//GEN-END:variables
}
