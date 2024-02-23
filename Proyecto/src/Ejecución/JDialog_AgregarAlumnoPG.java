
package Ejecución;

import Objetos.*;
import Estructuras.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JDialog_AgregarAlumnoPG extends javax.swing.JDialog {

    /**
     * Creates new form JDialog_AgregarAlumnoPG
     */
    public JDialog_AgregarAlumnoPG(java.awt.Frame parent, boolean modal) {
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

        nomf1 = new javax.swing.JTextField();
        docf1 = new javax.swing.JTextField();
        dirf1 = new javax.swing.JTextField();
        diaNacf1 = new javax.swing.JTextField();
        mesNacf1 = new javax.swing.JTextField();
        añoNacf1 = new javax.swing.JTextField();
        facf1 = new javax.swing.JTextField();
        carrf1 = new javax.swing.JTextField();
        diaIngref1 = new javax.swing.JTextField();
        mesIngref1 = new javax.swing.JTextField();
        añoingref1 = new javax.swing.JTextField();
        registerf1 = new javax.swing.JTextField();
        carrpgf = new javax.swing.JTextField();
        carrpgtxt = new javax.swing.JLabel();
        factxt1 = new javax.swing.JLabel();
        fecnactxt1 = new javax.swing.JLabel();
        dirtxt1 = new javax.swing.JLabel();
        nomtxt1 = new javax.swing.JLabel();
        fecingretxt1 = new javax.swing.JLabel();
        doctxt1 = new javax.swing.JLabel();
        carrtxt1 = new javax.swing.JLabel();
        registrotxt1 = new javax.swing.JLabel();
        volverBoton1 = new javax.swing.JButton();
        confirmarBoton1 = new javax.swing.JButton();
        FondoBlanco1 = new javax.swing.JLabel();
        FondoBordó1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(nomf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 180, -1));
        getContentPane().add(docf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 180, -1));
        getContentPane().add(dirf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 180, -1));
        getContentPane().add(diaNacf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 20, -1));
        getContentPane().add(mesNacf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 20, -1));
        getContentPane().add(añoNacf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 40, -1));
        getContentPane().add(facf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 180, -1));
        getContentPane().add(carrf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 180, -1));
        getContentPane().add(diaIngref1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 20, -1));
        getContentPane().add(mesIngref1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 20, -1));
        getContentPane().add(añoingref1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 40, -1));
        getContentPane().add(registerf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 180, -1));
        getContentPane().add(carrpgf, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 180, -1));

        carrpgtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        carrpgtxt.setForeground(new java.awt.Color(102, 0, 0));
        carrpgtxt.setText("Carrera de Post Grado");
        getContentPane().add(carrpgtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, -1, -1));

        factxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        factxt1.setForeground(new java.awt.Color(102, 0, 0));
        factxt1.setText("Facultad");
        getContentPane().add(factxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));

        fecnactxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fecnactxt1.setForeground(new java.awt.Color(102, 0, 0));
        fecnactxt1.setText("Fecha de nacimiento");
        getContentPane().add(fecnactxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        dirtxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dirtxt1.setForeground(new java.awt.Color(102, 0, 0));
        dirtxt1.setText("Dirección");
        getContentPane().add(dirtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        nomtxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomtxt1.setForeground(new java.awt.Color(102, 0, 0));
        nomtxt1.setText("Nombre y Apellido");
        getContentPane().add(nomtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        fecingretxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fecingretxt1.setForeground(new java.awt.Color(102, 0, 0));
        fecingretxt1.setText("Fecha de ingreso");
        getContentPane().add(fecingretxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        doctxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        doctxt1.setForeground(new java.awt.Color(102, 0, 0));
        doctxt1.setText("Nro. de Documento");
        getContentPane().add(doctxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        carrtxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        carrtxt1.setForeground(new java.awt.Color(102, 0, 0));
        carrtxt1.setText("Carrera");
        getContentPane().add(carrtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        registrotxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registrotxt1.setForeground(new java.awt.Color(102, 0, 0));
        registrotxt1.setText("Nro. de registro");
        getContentPane().add(registrotxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));

        volverBoton1.setBackground(new java.awt.Color(51, 51, 51));
        volverBoton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        volverBoton1.setForeground(new java.awt.Color(255, 255, 255));
        volverBoton1.setText("Volver");
        volverBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBoton1ActionPerformed(evt);
            }
        });
        getContentPane().add(volverBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 180, 30));

        confirmarBoton1.setBackground(new java.awt.Color(102, 0, 0));
        confirmarBoton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        confirmarBoton1.setForeground(new java.awt.Color(255, 255, 255));
        confirmarBoton1.setText("Confirmar");
        confirmarBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBoton1ActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 180, 30));

        FondoBlanco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2222.png"))); // NOI18N
        FondoBlanco1.setText("Carrera de Post Grado");
        getContentPane().add(FondoBlanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 510, 480));

        FondoBordó1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo41.png"))); // NOI18N
        getContentPane().add(FondoBordó1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBoton1ActionPerformed
        // BOTÓN SALIR
        this.setVisible(false);
    }//GEN-LAST:event_volverBoton1ActionPerformed

    private void confirmarBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBoton1ActionPerformed
        // TODO add your handling code here:
        String nom, doc, dir, fac, carr, reg,carrpg;
        int [] fNac = new int[3];
        int [] fIngre = new int[3];
        int aux = 0;
        
        //Campos de fecha vacíos
        if      (  !diaNacf1.getText().equals("")
                && !mesNacf1.getText().equals("") 
                && !añoNacf1.getText().equals("")
                && !diaIngref1.getText().equals("") 
                && !mesIngref1.getText().equals("") 
                && !añoingref1.getText().equals("")) {
             
            //Fechas inválidas 
            //inicio if
            if (Integer.parseInt(diaNacf1.getText()) >= 1 && Integer.parseInt(diaNacf1.getText()) <= 31)
                fNac[0] = Integer.parseInt(diaNacf1.getText());
            else aux = 16;
            
            if (Integer.parseInt(mesNacf1.getText()) >= 1 && Integer.parseInt(mesNacf1.getText()) <= 12)
                fNac[1] = Integer.parseInt(mesNacf1.getText());
            else aux = 16;
            
            if (Integer.parseInt(añoNacf1.getText()) >= 1915 && Integer.parseInt(añoNacf1.getText()) <= 2021)
                fNac[2] = Integer.parseInt(añoNacf1.getText());
            else aux = 16;

            //
            
            if (Integer.parseInt(diaIngref1.getText()) >= 1 && Integer.parseInt(diaIngref1.getText()) <= 31)
                fIngre[0] = Integer.parseInt(diaIngref1.getText());
            else aux = 17;
            
            if (Integer.parseInt(mesIngref1.getText()) >= 1 && Integer.parseInt(mesIngref1.getText()) <= 12)
                fIngre[1] = Integer.parseInt(mesIngref1.getText());
            else aux = 17;
            
            if (Integer.parseInt(añoingref1.getText()) >= 1915 && Integer.parseInt(añoingref1.getText()) <= 2021)
                fIngre[2] = Integer.parseInt(añoingref1.getText());
            else aux = 17;
         } //end if
         else aux = 18;
        
        //16 -> fecha de nacimiento inválida
        //17 -> fecha de ingreso inválida
        //18 -> faltan campos
            
        //Campos vacíos
        if      (  aux != 18 && aux != 17 && aux != 16
                && !nomf1.getText().equals("")
                && !docf1.getText().equals("") 
                && !dirf1.getText().equals("")
                && !facf1.getText().equals("") 
                && !carrf1.getText().equals("") 
                && !registerf1.getText().equals("")  
                && !carrpgf.getText().equals("")){
            
            //inicio if
            nom = nomf1.getText();
            doc = docf1.getText();
            dir = dirf1.getText();
            fac = facf1.getText();
            carr = carrf1.getText();
            reg = registerf1.getText();
            carrpg = carrpgf.getText();
        
            Persona aluPG = new AlumnoPostGrado(nom,doc,dir,fNac,fac,carr,fIngre,reg,carrpg);
            ControladoraLista.lista.addLast(aluPG);
        
            nomf1.setText("");
            docf1.setText("");
            dirf1.setText("");
            diaNacf1.setText("");
            mesNacf1.setText("");
            añoNacf1.setText("");
            facf1.setText("");
            carrf1.setText("");
            diaIngref1.setText("");
            mesIngref1.setText("");
            añoingref1.setText("");
            registerf1.setText("");
            carrpgf.setText("");

            alert("Alumno de Post-Grado registrado con éxito","Operación realizada");
        }  // end if
        else if(aux == 18) 
            alert("Debe ingresar todos los campos obligatorios","Error");
            else if(aux == 17)
                alert("Fecha de ingreso inválida","Error");
                else if(aux == 16)
                    alert("Fecha de nacimiento inválida","Error");
                    else alert("Debe ingresar todos los campos obligatorios","Error");
    }//GEN-LAST:event_confirmarBoton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_AgregarAlumnoPG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_AgregarAlumnoPG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_AgregarAlumnoPG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_AgregarAlumnoPG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_AgregarAlumnoPG dialog = new JDialog_AgregarAlumnoPG(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel FondoBlanco1;
    private javax.swing.JLabel FondoBordó1;
    private javax.swing.JTextField añoNacf1;
    private javax.swing.JTextField añoingref1;
    private javax.swing.JTextField carrf1;
    private javax.swing.JTextField carrpgf;
    private javax.swing.JLabel carrpgtxt;
    private javax.swing.JLabel carrtxt1;
    private javax.swing.JButton confirmarBoton1;
    private javax.swing.JTextField diaIngref1;
    private javax.swing.JTextField diaNacf1;
    private javax.swing.JTextField dirf1;
    private javax.swing.JLabel dirtxt1;
    private javax.swing.JTextField docf1;
    private javax.swing.JLabel doctxt1;
    private javax.swing.JTextField facf1;
    private javax.swing.JLabel factxt1;
    private javax.swing.JLabel fecingretxt1;
    private javax.swing.JLabel fecnactxt1;
    private javax.swing.JTextField mesIngref1;
    private javax.swing.JTextField mesNacf1;
    private javax.swing.JTextField nomf1;
    private javax.swing.JLabel nomtxt1;
    private javax.swing.JTextField registerf1;
    private javax.swing.JLabel registrotxt1;
    private javax.swing.JButton volverBoton1;
    // End of variables declaration//GEN-END:variables
}
