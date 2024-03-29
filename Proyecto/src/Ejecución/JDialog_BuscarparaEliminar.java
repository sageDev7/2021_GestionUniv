
package Ejecución;

import Objetos.*;
import Estructuras.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JDialog_BuscarparaEliminar extends javax.swing.JDialog {

    /**
     * Creates new form JDialog_BuscarparaEliminar
     */
    public JDialog_BuscarparaEliminar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
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
        VolverBoton = new javax.swing.JButton();
        EliminarBoton = new javax.swing.JButton();
        docf = new javax.swing.JTextField();
        doctxt = new javax.swing.JLabel();
        FondoBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoBordó.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo41.png"))); // NOI18N
        getContentPane().add(FondoBordó, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        VolverBoton.setBackground(new java.awt.Color(51, 51, 51));
        VolverBoton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VolverBoton.setForeground(new java.awt.Color(255, 255, 255));
        VolverBoton.setText("Volver");
        VolverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBotonActionPerformed(evt);
            }
        });
        getContentPane().add(VolverBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 210, 50));

        EliminarBoton.setBackground(new java.awt.Color(102, 0, 0));
        EliminarBoton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EliminarBoton.setForeground(new java.awt.Color(255, 255, 255));
        EliminarBoton.setText("Eliminar");
        EliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 210, 50));
        getContentPane().add(docf, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 210, -1));

        doctxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        doctxt.setForeground(new java.awt.Color(102, 0, 0));
        doctxt.setText("Ingrese el Nro. de Documento de la persona");
        getContentPane().add(doctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 300, -1));

        FondoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2222.png"))); // NOI18N
        getContentPane().add(FondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBotonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_VolverBotonActionPerformed

    private void EliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBotonActionPerformed
        // TODO add your handling code here:
        int i;
        if (ControladoraLista.lista.exists(docf.getText())){
            i = ControladoraLista.lista.indexOf(docf.getText());
            ControladoraLista.lista.remove(i);
            alert("Persona eliminada exitosamente","Eliminar");
        }
        else
            alert("No se encontró a la persona","Eliminar");
        docf.setText("");
    }//GEN-LAST:event_EliminarBotonActionPerformed

    public static void alert(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(JDialog_BuscarparaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_BuscarparaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_BuscarparaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_BuscarparaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_BuscarparaEliminar dialog = new JDialog_BuscarparaEliminar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarBoton;
    private javax.swing.JLabel FondoBlanco;
    private javax.swing.JLabel FondoBordó;
    private javax.swing.JButton VolverBoton;
    private javax.swing.JTextField docf;
    private javax.swing.JLabel doctxt;
    // End of variables declaration//GEN-END:variables
}
