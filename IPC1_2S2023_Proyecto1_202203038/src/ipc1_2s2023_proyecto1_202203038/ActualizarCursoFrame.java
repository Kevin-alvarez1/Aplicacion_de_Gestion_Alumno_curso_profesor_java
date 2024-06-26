/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

import java.io.Serializable;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Player
 */
public class ActualizarCursoFrame extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form ActualizarCursoFrame
     */
    public ActualizarCursoFrame() {
        initComponents();
        obtenerNombreCompletoProfesor();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CodigoActualizadoCurso = new javax.swing.JTextField();
        NombreActualizadoCurso = new javax.swing.JTextField();
        CreditosActualizadoCurso = new javax.swing.JTextField();
        ActualizarCursoBoton = new javax.swing.JButton();
        RegresarBoton = new javax.swing.JButton();
        ProfesorActualizadoCurso = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Actualizar datos Curso");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Creditos");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Profesor");

        ActualizarCursoBoton.setText("Actualizar");
        ActualizarCursoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarCursoBotonActionPerformed(evt);
            }
        });

        RegresarBoton.setText("Regresar");
        RegresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBotonActionPerformed(evt);
            }
        });

        ProfesorActualizadoCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        ProfesorActualizadoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesorActualizadoCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegresarBoton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ActualizarCursoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(ProfesorActualizadoCurso, 0, 359, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(CreditosActualizadoCurso))
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CodigoActualizadoCurso)
                                .addComponent(NombreActualizadoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CodigoActualizadoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NombreActualizadoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CreditosActualizadoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ProfesorActualizadoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(ActualizarCursoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegresarBoton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarCursoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarCursoBotonActionPerformed
            // TODO add your handling code here:
     Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;

    String CodigoNuevoCurso = CodigoActualizadoCurso.getText();
    String NombreCursoNuevo = NombreActualizadoCurso.getText();
    String CreditosCursoNuevo = CreditosActualizadoCurso.getText();
    String CursoActualizadoProfe = (String) ProfesorActualizadoCurso.getSelectedItem();
    String alumnoActualizado = "";
    boolean codigoEncontrado = false;

    // Actualizar los datos en el mismo vectorCursos
    for (Vector<String> fila : vectorCursos) {
        // Verifica que la fila tenga al menos 5 elementos y que ninguno sea nulo
        if (fila.size() >= 5 &&
            fila.get(0) != null &&
            fila.get(1) != null &&
            fila.get(2) != null &&
            fila.get(3) != null &&
            fila.get(4) != null &&
            fila.get(0).equals(CodigoNuevoCurso)) {
            fila.set(1, NombreCursoNuevo);
            fila.set(2, CreditosCursoNuevo);
            fila.set(3, alumnoActualizado);
            fila.set(4, CursoActualizadoProfe);
            codigoEncontrado = true;
            break; // Si encontramos una coincidencia, salimos del bucle
        }
    }

if (codigoEncontrado) {
    // Limpiar los campos de texto después de guardar
    CodigoActualizadoCurso.setText("");
    NombreActualizadoCurso.setText("");
    CreditosActualizadoCurso.setText("");
    ProfesorActualizadoCurso.setSelectedIndex(0);

    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
    this.dispose();
} else {
    JOptionPane.showMessageDialog(null, "No existe el código ingresado", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_ActualizarCursoBotonActionPerformed
public void obtenerNombreCompletoProfesor() {
    // Verifica si el JComboBox está inicializado
       Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos; 
    
       if (ProfesorActualizadoCurso != null) {
        for (Vector<String> fila : vectorDeDatos) {
            if (fila.size() >= 3 && fila.get(1) != null && fila.get(2) != null) {
                // Obtén el nombre y el apellido de las columnas 1 y 2
                String NombreProfe2 = fila.get(1);
                String ApellidoProfe2 = fila.get(2);

                // Agrega el nombre completo como un elemento al JComboBox
                ProfesorActualizadoCurso.addItem(NombreProfe2 + " " + ApellidoProfe2);
            }
        }
    }
}
    private void ProfesorActualizadoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesorActualizadoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfesorActualizadoCursoActionPerformed

    private void RegresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBotonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_RegresarBotonActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarCursoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarCursoBoton;
    private javax.swing.JTextField CodigoActualizadoCurso;
    private javax.swing.JTextField CreditosActualizadoCurso;
    private javax.swing.JTextField NombreActualizadoCurso;
    private javax.swing.JComboBox<String> ProfesorActualizadoCurso;
    private javax.swing.JButton RegresarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
