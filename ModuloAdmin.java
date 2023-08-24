/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Player
 */
public class ModuloAdmin extends javax.swing.JFrame {
JFileChooser seleccionarProfe = new JFileChooser();
File CargaProfes;
FileInputStream entrada;
FileOutputStream salida;

    /**
     * Creates new form ModuloAdmin
     */
    public ModuloAdmin() {
        initComponents();
     this.setLocationRelativeTo(null);
        
    }
    public String AbrirCargaProfes(File CargaProfes){
        Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;
       String documento = "";
    try {
        BufferedReader br = new BufferedReader(new FileReader(CargaProfes));
        String linea;
        
        while ((linea = br.readLine()) != null) {
            String[] campos = linea.split(",");
            
            // Convierte los campos en un vector de cadenas
            Vector<String> fila = new Vector<>();
            for (String campo : campos) {
                fila.add(campo);
            }
            
            // Agrega la fila al vectorDeDatos
            vectorDeDatos.add(fila);
        }

        br.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return documento;
        }
    
    public String GuardarCargaProfes(File CargaProfes, String documento){
        String mensaje = null;
        try {
            FileWriter escritor = new FileWriter(CargaProfes);
            escritor.write(documento);
            escritor.close();
            mensaje = "Archivo Guardado";
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir al guardar el archivo
            mensaje = "Error al guardar el archivo: " + e.getMessage();
        }
        return mensaje;
}
    boolean Grafica = false;
public class CrearHTMLProfes {

    public static void crearHTML(Vector<Vector<String>> datos, String nombreArchivo) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo);

            escritor.write("<html>");
            escritor.write("<head>");
            escritor.write("<title>Listado de Profesores</title>");
            escritor.write("</head>");
            escritor.write("<body>");
            
            // Crear una tabla HTML para mostrar los datos del vector
            escritor.write("<table border='1'>");
            
            // Agregar encabezados de la tabla
            escritor.write("<tr>");
            escritor.write("<th>Código</th>");
            escritor.write("<th>Nombre</th>");
            escritor.write("<th>Apellido</th>");
            escritor.write("<th>Correo</th>");
            escritor.write("<th>Género</th>");
            escritor.write("</tr>");
            
            // Agregar filas de datos
            for (Vector<String> fila : datos) {
                escritor.write("<tr>");
                for (String valor : fila) {
                    escritor.write("<td>" + valor + "</td>");
                }
                escritor.write("</tr>");
            }
            
            escritor.write("</table>");
            
            escritor.write("</body>");
            escritor.write("</html>");

            escritor.close();
            System.out.println("Archivo HTML creado exitosamente: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al crear el archivo HTML: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ejemplo de cómo usar el método crearHTML
        Vector<Vector<String>> vectorDeDatos = new Vector<Vector<String>>();
        // Llena vectorDeDatos con datos desde donde sea necesario

        String nombreArchivo = "ListadoProfes.html";
        crearHTML(vectorDeDatos, nombreArchivo);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        TablaProfesoresMostrar = new javax.swing.JScrollPane();
        TablaProfesoresP = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        CrearProfesor = new javax.swing.JButton();
        ActualizarMatriz = new javax.swing.JButton();
        CargaMasivaProfe = new javax.swing.JButton();
        BorrarProfesor = new javax.swing.JButton();
        ExportarProfesPDF = new javax.swing.JButton();
        RegresarMenuP = new javax.swing.JButton();
        ActualizarLaTabla = new javax.swing.JButton();
        LimpiarTablaBoton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 51, 153));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        TablaProfesoresP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Correo", "Genero"
            }
        ));
        TablaProfesoresMostrar.setViewportView(TablaProfesoresP);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        CrearProfesor.setText("Crear");
        CrearProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearProfesorMouseClicked(evt);
            }
        });
        CrearProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProfesorActionPerformed(evt);
            }
        });

        ActualizarMatriz.setText("Actualizar");
        ActualizarMatriz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarMatrizMouseClicked(evt);
            }
        });
        ActualizarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarMatrizActionPerformed(evt);
            }
        });

        CargaMasivaProfe.setText("Carga Masiva");
        CargaMasivaProfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargaMasivaProfeMouseClicked(evt);
            }
        });
        CargaMasivaProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMasivaProfeActionPerformed(evt);
            }
        });

        BorrarProfesor.setText("Eliminar");
        BorrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarProfesorActionPerformed(evt);
            }
        });

        ExportarProfesPDF.setText("Exportar Listado a PDF");
        ExportarProfesPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarProfesPDFActionPerformed(evt);
            }
        });

        RegresarMenuP.setText("Regresar al menu principal");
        RegresarMenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuPActionPerformed(evt);
            }
        });

        ActualizarLaTabla.setText("Actualizar Tabla");
        ActualizarLaTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarLaTablaMouseClicked(evt);
            }
        });
        ActualizarLaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarLaTablaActionPerformed(evt);
            }
        });

        LimpiarTablaBoton.setText("Limpiar Tabla");
        LimpiarTablaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTablaBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ActualizarLaTabla)
                        .addGap(18, 18, 18)
                        .addComponent(LimpiarTablaBoton))
                    .addComponent(TablaProfesoresMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(CrearProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CargaMasivaProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ActualizarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BorrarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(ExportarProfesPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RegresarMenuP))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CargaMasivaProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CrearProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BorrarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(ExportarProfesPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegresarMenuP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TablaProfesoresMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarLaTabla)
                    .addComponent(LimpiarTablaBoton))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profesores", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cursos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alumnos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarTabla() {
    // Obtener el vector de datos desde CrearProfe
    Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;

    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) TablaProfesoresP.getModel();

    // Limpia la tabla antes de agregar datos nuevos
    modeloTabla.setRowCount(0);

    // Llenar la tabla con los datos del vector, omitiendo filas con valores nulos
    for (Vector<String> fila : vectorDeDatos) {
        boolean esNull = true;
        for (String valor : fila) {
            if (valor != null && !valor.isEmpty()) {
                esNull = false;
                break; // Encontramos un valor no nulo en esta fila
            }
        }
        if (!esNull) {
            modeloTabla.addRow(fila.toArray());
        }
    }
    }
public static void limpiarTabla(JTable tabla) {
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    modelo.setRowCount(0); // Elimina todas las filas de la tabla
}



    private void CrearProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearProfesorMouseClicked
        // TODO add your handling code here:
            CrearProfe Aparece = new CrearProfe();
            Aparece.setVisible(true);

    }//GEN-LAST:event_CrearProfesorMouseClicked

    
    private void CrearProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearProfesorActionPerformed

    private void ActualizarLaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarLaTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarLaTablaActionPerformed

    private void ActualizarLaTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarLaTablaMouseClicked
    Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;
    
    llenarTabla();

           
    }//GEN-LAST:event_ActualizarLaTablaMouseClicked
public void borrarProfesor(String codigoBorrarProfe) {
    // Obtener el vector de datos desde CrearProfe
    Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;

    // Recorrer el vector en busca del código
    for (Vector<String> fila : vectorDeDatos) {
        String codigoActual = fila.get(0); // Suponiendo que el código está en la primera columna
        if (codigoActual.equals(codigoBorrarProfe)) {
            // Si se encuentra el código, establecer los valores de la fila como null
            for (int i = 1; i < fila.size(); i++) {
                fila.set(i, null);
            }
            break; // Romper el bucle después de encontrar el código
        }
    }
}
    
    
    private void ActualizarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarMatrizActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ActualizarMatrizActionPerformed

    private void ActualizarMatrizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMatrizMouseClicked
        // TODO add your handling code here:
     ActualizarProfesor ApareceMenuP = new ActualizarProfesor();
            ApareceMenuP.setVisible(true);    
    }//GEN-LAST:event_ActualizarMatrizMouseClicked

private void cargarDatosDesdeCSV(File archivoCSV) {
    DefaultTableModel modelo = (DefaultTableModel) TablaProfesoresP.getModel();
    modelo.setRowCount(0); // Limpiamos todas las filas existentes en la tabla
    
    try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] datos = line.split(",");
            if (datos.length == 5) {
                modelo.addRow(datos); // Agregamos una fila al modelo de tabla
            }
        }
        JOptionPane.showMessageDialog(this, "Datos cargados exitosamente.");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo CSV.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void CargaMasivaProfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargaMasivaProfeMouseClicked
        // TODO add your handling code here:
        if(seleccionarProfe.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
           CargaProfes=seleccionarProfe.getSelectedFile();
           if(CargaProfes.canRead()){
               if(CargaProfes.getName().endsWith("csv")){
                   String documento = AbrirCargaProfes(CargaProfes);
                    cargarDatosDesdeCSV(CargaProfes); // Llamamos a un método para cargar los datos
                    llenarTabla();

               } else{
                JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
               }
           }
        }
        
        
    }//GEN-LAST:event_CargaMasivaProfeMouseClicked

    private void CargaMasivaProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMasivaProfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargaMasivaProfeActionPerformed

    private void LimpiarTablaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTablaBotonActionPerformed
        // TODO add your handling code here:
       limpiarTabla(TablaProfesoresP); 
    }//GEN-LAST:event_LimpiarTablaBotonActionPerformed

    private void BorrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarProfesorActionPerformed
        // TODO add your handling code here:
      BorrarProfeframe ApareceELiminar = new BorrarProfeframe();
            ApareceELiminar.setVisible(true);     
    }//GEN-LAST:event_BorrarProfesorActionPerformed

    private void RegresarMenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuPActionPerformed
        // TODO add your handling code here:
      this.dispose();

    }//GEN-LAST:event_RegresarMenuPActionPerformed

    private void ExportarProfesPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarProfesPDFActionPerformed
        // TODO add your handling code here:
    // Obtener el vector de datos desde donde sea necesario
    Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;

    // Nombre del archivo HTML a generar
    String nombreArchivo = "ListadoProfes.html";

    // Llamar al método para crear el archivo HTML
    CrearHTMLProfes.crearHTML(vectorDeDatos, nombreArchivo);
    }//GEN-LAST:event_ExportarProfesPDFActionPerformed


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
            java.util.logging.Logger.getLogger(ModuloAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarLaTabla;
    private javax.swing.JButton ActualizarMatriz;
    private javax.swing.JButton BorrarProfesor;
    private javax.swing.JButton CargaMasivaProfe;
    private javax.swing.JButton CrearProfesor;
    private javax.swing.JButton ExportarProfesPDF;
    private javax.swing.JButton LimpiarTablaBoton;
    private javax.swing.JButton RegresarMenuP;
    private javax.swing.JScrollPane TablaProfesoresMostrar;
    private javax.swing.JTable TablaProfesoresP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
