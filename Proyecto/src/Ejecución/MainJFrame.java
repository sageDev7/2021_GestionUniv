
package Ejecución;
import Objetos.*;
import Estructuras.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MainJFrame extends javax.swing.JFrame {
    
    public MainJFrame() {
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

        back = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Info = new javax.swing.JButton();
        bienvenido = new javax.swing.JLabel();
        sistemauniversitario = new javax.swing.JLabel();
        fondoblanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo41.png"))); // NOI18N
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        Agregar.setBackground(new java.awt.Color(102, 0, 0));
        Agregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Agregar persona/s");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 190, 30));

        Modificar.setBackground(new java.awt.Color(102, 0, 0));
        Modificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar datos");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 190, 30));

        Eliminar.setBackground(new java.awt.Color(102, 0, 0));
        Eliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar persona/s");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 190, 30));

        Salir.setBackground(new java.awt.Color(51, 51, 51));
        Salir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 190, 30));

        Mostrar.setBackground(new java.awt.Color(102, 0, 0));
        Mostrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        Mostrar.setText("Mostrar datos");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 190, 30));

        Info.setBackground(new java.awt.Color(102, 0, 0));
        Info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Info.setForeground(new java.awt.Color(255, 255, 255));
        Info.setText("Información de la lista");
        Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoActionPerformed(evt);
            }
        });
        getContentPane().add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 190, 30));

        bienvenido.setBackground(new java.awt.Color(102, 0, 0));
        bienvenido.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(153, 0, 0));
        bienvenido.setText("¡Bienvenido!");
        getContentPane().add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, 50));

        sistemauniversitario.setBackground(new java.awt.Color(255, 0, 0));
        sistemauniversitario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sistemauniversitario.setForeground(new java.awt.Color(153, 0, 0));
        sistemauniversitario.setText("Sistema de Gestión - Universidad");
        getContentPane().add(sistemauniversitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        fondoblanco.setBackground(new java.awt.Color(255, 255, 255));
        fondoblanco.setForeground(new java.awt.Color(255, 255, 255));
        fondoblanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2222.png"))); // NOI18N
        getContentPane().add(fondoblanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        new JFrameAgregar().setVisible(true);
    }//GEN-LAST:event_AgregarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        new JFrameMostrar().setVisible(true);
    }//GEN-LAST:event_MostrarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // BOTÓN SALIR
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        new JFrameEliminar().setVisible(true);
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        new JFrameBuscarParaModificar().setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed

    private void InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoActionPerformed
        // TODO add your handling code here:
        new JFrameInfo().setVisible(true);
    }//GEN-LAST:event_InfoActionPerformed
 
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Info;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel back;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel fondoblanco;
    private javax.swing.JLabel sistemauniversitario;
    // End of variables declaration//GEN-END:variables
}
