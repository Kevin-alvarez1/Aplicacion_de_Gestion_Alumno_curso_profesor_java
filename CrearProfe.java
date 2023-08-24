/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Player
 */
public class CrearProfe extends javax.swing.JFrame {
     public CrearProfe() {
        initComponents();
             this.setLocationRelativeTo(null);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AgregarProfesorBoton = new javax.swing.JButton();
        txt_ContrasenaNuevoProfe = new javax.swing.JTextField();
        BarraGeneros = new javax.swing.JComboBox<>();
        txt_CorreoNuevoProfe = new javax.swing.JTextField();
        txt_ApellidoNuevoProfe = new javax.swing.JTextField();
        txt_NombreNuevoProfe = new javax.swing.JTextField();
        txt_CodigoNuevoProfe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agregar nuevo profesor");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Correo:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contraseña:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Genero:");

        AgregarProfesorBoton.setText("Agregar");
        AgregarProfesorBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarProfesorBotonMouseClicked(evt);
            }
        });
        AgregarProfesorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProfesorBotonActionPerformed(evt);
            }
        });

        BarraGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "f" }));
        BarraGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraGenerosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(AgregarProfesorBoton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ContrasenaNuevoProfe)
                            .addComponent(BarraGeneros, 0, 333, Short.MAX_VALUE)
                            .addComponent(txt_CorreoNuevoProfe)
                            .addComponent(txt_ApellidoNuevoProfe)
                            .addComponent(txt_NombreNuevoProfe)
                            .addComponent(txt_CodigoNuevoProfe))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_CodigoNuevoProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_NombreNuevoProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_ApellidoNuevoProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_CorreoNuevoProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_ContrasenaNuevoProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(BarraGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(AgregarProfesorBoton)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public static Vector<Vector<String>> vectorDatos = new Vector<>();

    private void AgregarProfesorBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProfesorBotonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AgregarProfesorBotonActionPerformed

    private void BarraGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraGenerosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BarraGenerosActionPerformed

    private void AgregarProfesorBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarProfesorBotonMouseClicked
// Obtener el vector de datos desde CrearProfe
    Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;

    // Obtener los datos ingresados por el usuario
    String CodigoNuevoProfe = txt_CodigoNuevoProfe.getText();
    String NombreProfeNuevo = txt_NombreNuevoProfe.getText();
    String ApellidoProfeNuevo = txt_ApellidoNuevoProfe.getText();
    String CorreoProfeNuevo = txt_CorreoNuevoProfe.getText();
    String GeneroNuevoProfe = (String) BarraGeneros.getSelectedItem();

    // Verificar si el código ya existe en el vector
    boolean codigoExistente = false;
    for (Vector<String> fila : vectorDeDatos) {
        if (fila.get(0) != null && fila.get(0).equals(CodigoNuevoProfe)) {
            codigoExistente = true;
            break;
        }
    }

    if (codigoExistente) {
        JOptionPane.showMessageDialog(null, "El código ingresado ya existe", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Crear un nuevo vector para almacenar los datos del profesor
        Vector<String> nuevoProfesor = new Vector<>();
        nuevoProfesor.add(CodigoNuevoProfe);
        nuevoProfesor.add(NombreProfeNuevo);
        nuevoProfesor.add(ApellidoProfeNuevo);
        nuevoProfesor.add(CorreoProfeNuevo);
        nuevoProfesor.add(GeneroNuevoProfe);

        // Agregar el nuevo profesor al vectorDeDatos
        vectorDeDatos.add(nuevoProfesor);

        // Limpiar los campos de texto después de guardar
        txt_CodigoNuevoProfe.setText("");
        txt_NombreNuevoProfe.setText("");
        txt_ApellidoNuevoProfe.setText("");
        txt_CorreoNuevoProfe.setText("");
        BarraGeneros.setSelectedIndex(0);

        JOptionPane.showMessageDialog(null, "Profesor registrado correctamente");
        this.dispose();
    }
    }//GEN-LAST:event_AgregarProfesorBotonMouseClicked

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
            java.util.logging.Logger.getLogger(CrearProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearProfe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProfesorBoton;
    private javax.swing.JComboBox<String> BarraGeneros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_ApellidoNuevoProfe;
    private javax.swing.JTextField txt_CodigoNuevoProfe;
    private javax.swing.JTextField txt_ContrasenaNuevoProfe;
    private javax.swing.JTextField txt_CorreoNuevoProfe;
    private javax.swing.JTextField txt_NombreNuevoProfe;
    // End of variables declaration//GEN-END:variables
}
