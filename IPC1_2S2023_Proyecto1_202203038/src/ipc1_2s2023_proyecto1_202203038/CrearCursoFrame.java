/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

import java.io.Serializable;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Player
 */
public class CrearCursoFrame extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form CrearAlumnoFrame
     */
    public CrearCursoFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
      obtenerNombreCompletoProfesor();

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
        AgregarCursoBoton = new javax.swing.JButton();
        RegresarMenuPBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CodigoCursotxt = new javax.swing.JTextField();
        NombreCursotxt = new javax.swing.JTextField();
        CreditoCursotxt = new javax.swing.JTextField();
        ProfesoresBarra = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 153));

        AgregarCursoBoton.setText("Agregar");
        AgregarCursoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCursoBotonActionPerformed(evt);
            }
        });

        RegresarMenuPBoton.setText("Regresar al menu anterior");
        RegresarMenuPBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuPBotonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Creditos:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Profesor:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Agregar nuevo curso");

        CodigoCursotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoCursotxtActionPerformed(evt);
            }
        });

        ProfesoresBarra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        ProfesoresBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesoresBarraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegresarMenuPBoton)
                            .addComponent(AgregarCursoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(ProfesoresBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CreditoCursotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                    .addComponent(NombreCursotxt)
                                    .addComponent(CodigoCursotxt))))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CodigoCursotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreCursotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CreditoCursotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ProfesoresBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(AgregarCursoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegresarMenuPBoton)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMenuPBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuPBotonActionPerformed
        // TODO add your handling code here:
              this.dispose();

    }//GEN-LAST:event_RegresarMenuPBotonActionPerformed
public static Vector<Vector<String>> vectorCursos = new Vector<>();
       Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos; 

public String NombreProfe;
public String ApellidoProfe;
    private void AgregarCursoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCursoBotonActionPerformed
        // TODO add your handling code here:
          Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;

    // Obtener los datos ingresados por el usuario
    String CodigoNuevoCurso = CodigoCursotxt.getText();
    String NombreCursoNuevo = NombreCursotxt.getText();
    String CreditosCursoNuevo = CreditoCursotxt.getText();
    String AlumnosCurso = "";
    String ProfeCursoNuevo = (String) ProfesoresBarra.getSelectedItem();
   

    // Verificar si el código ya existe en el vector
    boolean codigoExistente = false;
    for (Vector<String> fila : vectorCursos) {
        if (fila.get(0) != null && fila.get(0).equals(CodigoNuevoCurso)) {
            codigoExistente = true;
            break;
        }
    }

    if (codigoExistente) {
        JOptionPane.showMessageDialog(null, "El código ingresado ya existe", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Crear un nuevo vector para almacenar los datos del curso
        Vector<String> nuevoCurso = new Vector<>();
        nuevoCurso.add(CodigoNuevoCurso);
        nuevoCurso.add(NombreCursoNuevo);
        nuevoCurso.add(CreditosCursoNuevo);
        nuevoCurso.add(AlumnosCurso);
        nuevoCurso.add(ProfeCursoNuevo);
    

        // Agregar el nuevo curso al vectorDeDatos
        vectorCursos.add(nuevoCurso);

        // Limpiar los campos de texto después de guardar
        CodigoCursotxt.setText("");
        NombreCursotxt.setText("");
        CreditoCursotxt.setText("");
        ProfesoresBarra.setSelectedIndex(0);

        this.dispose();
    }

    }//GEN-LAST:event_AgregarCursoBotonActionPerformed

    private void ProfesoresBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesoresBarraActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_ProfesoresBarraActionPerformed

    private void CodigoCursotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoCursotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoCursotxtActionPerformed
public void obtenerNombreCompletoProfesor() {
    // Verifica si el JComboBox está inicializado
       Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos; 
    
       if (ProfesoresBarra != null) {
        for (Vector<String> fila : vectorDeDatos) {
            if (fila.size() >= 3 && fila.get(1) != null && fila.get(2) != null) {
                // Obtén el nombre y el apellido de las columnas 1 y 2
                String NombreProfe2 = fila.get(1);
                String ApellidoProfe2 = fila.get(2);

                // Agrega el nombre completo como un elemento al JComboBox
                ProfesoresBarra.addItem(NombreProfe2 + " " + ApellidoProfe2);
            }
        }
    }
}

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
            java.util.logging.Logger.getLogger(CrearCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCursoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCursoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCursoBoton;
    private javax.swing.JTextField CodigoCursotxt;
    private javax.swing.JTextField CreditoCursotxt;
    private javax.swing.JTextField NombreCursotxt;
    private javax.swing.JComboBox<String> ProfesoresBarra;
    private javax.swing.JButton RegresarMenuPBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
