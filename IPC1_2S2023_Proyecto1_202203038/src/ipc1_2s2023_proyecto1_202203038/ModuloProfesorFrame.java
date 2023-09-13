/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.vectorAlumnosAsignadosAsignados;
import static ipc1_2s2023_proyecto1_202203038.LoginProfesores.vectorParaCrearBotones;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Player
 */
public class ModuloProfesorFrame extends javax.swing.JFrame implements Serializable{
    Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;

    
    /**
     * Creates new form ModuloProfesorFrame
     */
    public ModuloProfesorFrame () {
        initComponents();
        
     this.crearBotonesSegunRepeticion(vectorParaCrearBotones);
     this.setLocationRelativeTo(null);
     this.setResizable(false); 
       this.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
        Appdata.serializar();
        }
    });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ActualizarDatosProfeBoton = new javax.swing.JButton();
        RegresarMenu = new javax.swing.JButton();
        ActualizarBotonesBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursosProfe = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cursos Asignados");

        ActualizarDatosProfeBoton.setText("Actualizar Datos");
        ActualizarDatosProfeBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarDatosProfeBotonActionPerformed(evt);
            }
        });

        RegresarMenu.setText("Cerrar sesion");
        RegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuActionPerformed(evt);
            }
        });

        ActualizarBotonesBoton.setText("Actualizar Tabla");
        ActualizarBotonesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonesBotonActionPerformed(evt);
            }
        });

        tablaCursosProfe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Curso", "No.Estudiantes"
            }
        ));
        jScrollPane1.setViewportView(tablaCursosProfe);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ActualizarBotonesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ActualizarDatosProfeBoton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ActualizarDatosProfeBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarBotonesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
private String usuarioIngresado; 
   
public void crearBotonesSegunRepeticion(Vector<Vector<String>> vectorParaCrearBotones) {
    int coordenadaX = 30;
    int coordenadaY = 60;

   
    // Iterar sobre vectorParaCrearBotones para crear los botones
    for (int i = 0; i < vectorParaCrearBotones.size(); i++) {
        Vector<String> datosCurso = vectorParaCrearBotones.get(i);

        // Verificar si la posición 6 contiene "Online" y la posición 7 no contiene "Offline"
        if (datosCurso.size() >= 7 && "Online".equals(datosCurso.get(6)) && !"Offline".equals(datosCurso.get(6))) {
            String nombreCurso = datosCurso.get(1); // Nombre del curso en la primera posición del vector

            // Comprobar si el curso ya ha sido procesado
            boolean cursoProcesado = false;
            for (int j = 0; j < i; j++) {
                Vector<String> cursoAnterior = vectorParaCrearBotones.get(j);
                String nombreCursoAnterior = cursoAnterior.get(1);
                if (nombreCurso.equals(nombreCursoAnterior)) {
                    cursoProcesado = true;
                    break;
                }
            }

            // Si el curso ya ha sido procesado, continuamos con la siguiente iteración
            if (cursoProcesado) {
                continue;
            }

            // Contar cuántas veces se repite ese valor (nombreCurso)
            int cantidadRepeticiones = contarRepeticiones(vectorParaCrearBotones, nombreCurso);

            // Crear un botón para cada repetición
            for (int j = 0; j < cantidadRepeticiones; j++) {
                JButton botonCurso = new JButton(nombreCurso);
                botonCurso.setBounds(coordenadaX, coordenadaY, 90, 50);

              
                // Agregar una acción al presionar el botón
                botonCurso.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Obtener el nombre del curso del botón
                        String nombreCurso = ((JButton) e.getSource()).getText();

                        // Crear una instancia de la plantilla del curso
                        CursoPlantillaModuloProfe ApareceP = new CursoPlantillaModuloProfe();

                        // Llenar la plantilla con los datos correspondientes
                        llenarPlantillaCurso(ApareceP, nombreCurso, (nombreCurso));

                        // Mostrar la plantilla del curso
                        ApareceP.setVisible(true);
                    }
                });

                // Agregar el botón y la etiqueta al panel de botones
                jPanel2.add(botonCurso);

                // Ajusta las coordenadas X e Y para la próxima iteración
                coordenadaX += 100;

                // Comprueba si coordenadaX supera 550 y ajusta las coordenadas
                if (coordenadaX >= 550) {
                    coordenadaX = 30;
                    coordenadaY += 80;
                }
            }
        }
    }

    // Agregar el panel de botones al JScrollPane
    jScrollPane2.setViewportView(jPanel2);
}


private void llenarPlantillaCurso(CursoPlantillaModuloProfe plantilla, String nombreCurso, String descripcionCurso) {
    plantilla.llenarPlantilla(nombreCurso, descripcionCurso);
}

// Método para contar las repeticiones de un valor en un vector de vectores
private int contarRepeticiones(Vector<Vector<String>> vectorParaCrearBotones, String valorBuscado) {
    Set<String> valoresEncontrados = new HashSet<>();
    int contador = 0;

    for (Vector<String> datosCurso : vectorParaCrearBotones) {
        String nombreCurso = datosCurso.get(1);

        // Verificar si el valor ya ha sido encontrado
        if (!valoresEncontrados.contains(nombreCurso) && nombreCurso.equals(valorBuscado)) {
            contador++;
            valoresEncontrados.add(nombreCurso); // Agregar el valor al conjunto
        }
    }

    return contador;
}

    private void ActualizarBotonesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBotonesBotonActionPerformed
    // TODO add your handling code here:
    contarYMostrarRepeticionesCursos(vectorAlumnosAsignadosAsignados, tablaCursosProfe);
    crearBotonesSegunRepeticion(vectorParaCrearBotones);
    }//GEN-LAST:event_ActualizarBotonesBotonActionPerformed

public void contarYMostrarRepeticionesCursos(Vector<Vector<String>> vectorAlumnosAsignadosAsignados, JTable tablaCursosProfe) {
    // Crear un mapa para almacenar el conteo de cursos
      for (Vector<String> filaCurso : vectorParaCrearBotones) {
          
        if (filaCurso.size() >= 7 && "Online".equals(filaCurso.get(6))) {
               DefaultTableModel modelo = (DefaultTableModel) tablaCursosProfe.getModel();
                modelo.setRowCount(0); // Elimina todas las filas de la tabla

            Map<String, Integer> conteoCursos = new HashMap<>();

    // Iterar sobre el vectorAlumnosAsignadosAsignados y contar repeticiones de cursos
    for (Vector<String> fila : vectorAlumnosAsignadosAsignados) {
        if (fila.size() > 4) {
            String nombreCurso = fila.get(4); // Nombre del curso en la posición 4 del vector

            // Incrementar el conteo para este curso
            conteoCursos.put(nombreCurso, conteoCursos.getOrDefault(nombreCurso, 0) + 1);
        }
    }

    // Obtener el modelo de la tabla existente
    DefaultTableModel model = (DefaultTableModel) tablaCursosProfe.getModel();

    // Limpiar la tablaCursosProfe
    model.setRowCount(0);

    // Agregar los datos al modelo de la tabla
    for (Map.Entry<String, Integer> entry : conteoCursos.entrySet()) {
        String nombreCurso = entry.getKey();
        int repeticiones = entry.getValue();

        // Agregar una fila al modelo de la tabla
        model.addRow(new Object[]{nombreCurso, repeticiones + " Estudiantes"});
    } 
            
        }
    }
}


    private void RegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuActionPerformed
  // Buscar coincidencias en vectorParaCrearBotones
     for (Vector<String> filaCurso : vectorParaCrearBotones) {
        if (filaCurso.size() >= 7 && "Online".equals(filaCurso.get(6))) {
            filaCurso.set(6, "Offline");
        }
    }
 
   
    this.dispose();

    }//GEN-LAST:event_RegresarMenuActionPerformed

    
    
    private void ActualizarDatosProfeBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarDatosProfeBotonActionPerformed

    // Crear una instancia de ActualizarDatosModuloProfe y pasar el usuario como argumento al constructor
    ActualizarDatosModuloProfe ApareceMenuP = new ActualizarDatosModuloProfe();
    ApareceMenuP.setVisible(true);
    }//GEN-LAST:event_ActualizarDatosProfeBotonActionPerformed

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
    private javax.swing.JButton ActualizarDatosProfeBoton;
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCursosProfe;
    // End of variables declaration//GEN-END:variables
}
