/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

import static ipc1_2s2023_proyecto1_202203038.LoginProfesores.vectorParaCrearBotones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Player
 */
public class ModuloProfesorFrame extends javax.swing.JFrame {
    Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;
    private String usuarioIngresado; 
    /**
     * Creates new form ModuloProfesorFrame
     */
    public ModuloProfesorFrame () {
        initComponents();
        
     this.crearBotonesSegunRepeticion(vectorParaCrearBotones);
     this.setLocationRelativeTo(null);
     this.setResizable(false); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ActualizarBotonesBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cursos Asignados");

        jButton1.setText("Actualizar Datos");

        jButton2.setText("Regresar al menu principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ActualizarBotonesBoton.setText("Actualizar botones");
        ActualizarBotonesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonesBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ActualizarBotonesBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarBotonesBoton)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
public void crearBotonesSegunRepeticion(Vector<Vector<String>> vectorParaCrearBotones) {
    int coordeandaX = 0;
    int coordeandaY = 50;

    // Iterar sobre vectorParaCrearBotones para crear los botones
    for (int i = 0; i < vectorParaCrearBotones.size(); i++) {
        Vector<String> datosCurso = vectorParaCrearBotones.get(i);
        String nombreCurso = datosCurso.get(1); // Nombre del curso en la primera posición del vector

        // Contar cuántas veces se repite ese valor (nombreCurso)
        int cantidadRepeticiones = contarRepeticiones(vectorParaCrearBotones, nombreCurso);

        // Crear un botón para cada repetición
        for (int j = 0; j < cantidadRepeticiones; j++) {
            JButton botonCurso = new JButton(nombreCurso);
            JLabel label = new JLabel("50: estudiantes");
            botonCurso.setBounds(coordeandaX, coordeandaY, 90, 30);

            // Agregar una acción al presionar el botón
            botonCurso.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Lo que quieres que se haga al presionar el botón
                    System.out.println("Hola");
                }
            });

            label.setBounds(coordeandaX, coordeandaY + 30, 100, 30);

            // Agregar el botón y la etiqueta al panel o contenedor donde desees mostrarlos.
            this.add(botonCurso);
            this.add(label);

            // Ajusta las coordenadas X e Y para la próxima iteración
            coordeandaX += 100;

            // Comprueba si coordeandaX supera 550 y ajusta las coordenadas
            if (coordeandaX >= 550) {
                coordeandaX = 0;
                coordeandaY += 40;
            }
        }
    }
}
// Método para contar las repeticiones de un valor en un vector de vectores
private int contarRepeticiones(Vector<Vector<String>> vectorParaCrearBotones, String valorBuscado) {
    int contador = 0;

    for (Vector<String> datosCurso : vectorParaCrearBotones) {
        String nombreCurso = datosCurso.get(1);
        if (nombreCurso.equals(valorBuscado)) {
            contador++;
        }
    }

    return contador;
}

    private void ActualizarBotonesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBotonesBotonActionPerformed
    
        // TODO add your handling code here:
        crearBotonesSegunRepeticion(vectorParaCrearBotones);

    }//GEN-LAST:event_ActualizarBotonesBotonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ModuloProfesorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloProfesorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloProfesorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloProfesorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloProfesorFrame().setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBotonesBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
