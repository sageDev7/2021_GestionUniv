
package Ejecución;

import javax.swing.ImageIcon;


public class JFrameAgregar extends javax.swing.JFrame {

    /**
     * Creates new form JFrameAgregar
     */
    public JFrameAgregar() {
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
        agregartxt = new javax.swing.JLabel();
        AlumnoBoton = new javax.swing.JButton();
        AlumnoPGBoton = new javax.swing.JButton();
        VolverBoton = new javax.swing.JButton();
        DocenteBoton = new javax.swing.JButton();
        FondoBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoBordó.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo41.png"))); // NOI18N
        getContentPane().add(FondoBordó, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        agregartxt.setBackground(new java.awt.Color(102, 0, 0));
        agregartxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agregartxt.setForeground(new java.awt.Color(102, 0, 0));
        agregartxt.setText("Agregar...");
        getContentPane().add(agregartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, -1, -1));

        AlumnoBoton.setBackground(new java.awt.Color(102, 0, 0));
        AlumnoBoton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AlumnoBoton.setForeground(new java.awt.Color(255, 255, 255));
        AlumnoBoton.setText("Alumno/s");
        AlumnoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoBotonActionPerformed(evt);
            }
        });
        getContentPane().add(AlumnoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 210, 50));

        AlumnoPGBoton.setBackground(new java.awt.Color(102, 0, 0));
        AlumnoPGBoton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AlumnoPGBoton.setForeground(new java.awt.Color(255, 255, 255));
        AlumnoPGBoton.setText("Alumno/s de Post Grado");
        AlumnoPGBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoPGBotonActionPerformed(evt);
            }
        });
        getContentPane().add(AlumnoPGBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 210, 50));

        VolverBoton.setBackground(new java.awt.Color(51, 51, 51));
        VolverBoton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VolverBoton.setForeground(new java.awt.Color(255, 255, 255));
        VolverBoton.setText("Volver");
        VolverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBotonActionPerformed(evt);
            }
        });
        getContentPane().add(VolverBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 210, 50));

        DocenteBoton.setBackground(new java.awt.Color(102, 0, 0));
        DocenteBoton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DocenteBoton.setForeground(new java.awt.Color(255, 255, 255));
        DocenteBoton.setText("Docente/s");
        DocenteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocenteBotonActionPerformed(evt);
            }
        });
        getContentPane().add(DocenteBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 210, 50));

        FondoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2222.png"))); // NOI18N
        getContentPane().add(FondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlumnoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoBotonActionPerformed
        // TODO add your handling code here:
        new JDialog_AgregarAlumno(this,true).setVisible(true);
    }//GEN-LAST:event_AlumnoBotonActionPerformed

    private void AlumnoPGBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoPGBotonActionPerformed
        // TODO add your handling code here:
        new JDialog_AgregarAlumnoPG(this,true).setVisible(true);
    }//GEN-LAST:event_AlumnoPGBotonActionPerformed

    private void VolverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBotonActionPerformed
        // BOTÓN SALIR
        this.setVisible(false);
    }//GEN-LAST:event_VolverBotonActionPerformed

    private void DocenteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocenteBotonActionPerformed
        // TODO add your handling code here:
        new JDialog_AgregarDocente(this,true).setVisible(true);
    }//GEN-LAST:event_DocenteBotonActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlumnoBoton;
    private javax.swing.JButton AlumnoPGBoton;
    private javax.swing.JButton DocenteBoton;
    private javax.swing.JLabel FondoBlanco;
    private javax.swing.JLabel FondoBordó;
    private javax.swing.JButton VolverBoton;
    private javax.swing.JLabel agregartxt;
    // End of variables declaration//GEN-END:variables
}
