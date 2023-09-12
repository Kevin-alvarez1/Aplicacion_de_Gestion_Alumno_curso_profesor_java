package ipc1_2s2023_proyecto1_202203038;

import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.actividadesCurso;

import ipc1_2s2023_proyecto1_202203038.Appdata;
import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.actividadesCurso;
import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.notasCurso;
import static ipc1_2s2023_proyecto1_202203038.LoginAlumnoJframe.vectorParaCrearBotonesAlumno;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Player
 */
public class CursoAlumnoPlantilla extends javax.swing.JFrame {

    /**
     * Creates new form CursoAlumnoPlantilla
     */
    public CursoAlumnoPlantilla() {
        initComponents();
        
           this.setLocationRelativeTo(null);
     this.setResizable(false); 
       this.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
        Appdata.serializar();
        }
    });
    txtTotalPonderacion.setEditable(false);
    txtPromedioNotas.setEditable(false);
    mostrarActividadesPorNombre(nombreCurso2);
    }

private String nombreCurso2;
 public void llenarPlantilla2(String nombreCurso2, String descripcionCurso) {
        jLabel1.setText(nombreCurso2);
        this.nombreCurso2 = nombreCurso2;    
 }
 double notaObtenida;
private void mostrarActividadesPorNombre(String nombreCurso2) {
    DefaultTableModel modeloTablaAlumno = (DefaultTableModel) TalaAlumno.getModel();
    double totalPonderacion = 0.0; // Inicializa la suma en 0
    double sumaNotas = 0.0; // Inicializa la suma de las notas en 0
    int contadorCoincidencias = 0; // Inicializa el contador de coincidencias en 0

    // Utilizar un conjunto para almacenar filas únicas
    Set<List<Object>> filasUnicas = new HashSet<>();

    // Iterar a través del vector actividadesCurso
    for (Vector<String> actividad : actividadesCurso) {
        // Verificar si el vector tiene al menos 4 elementos (posiciones 0, 1, 2 y 3)
        if (actividad.size() >= 4) {
            // Obtener el nombre del curso de la posición 0
            String nombreCursoActividad = actividad.get(0);

            // Si el nombre del curso coincide con nombreCurso2
            if (nombreCursoActividad.equals(nombreCurso2)) {
                // Obtener los datos de las posiciones 1, 2 y 3
                String columna1 = actividad.get(1);
                String columna2 = actividad.get(2);
                double ponderacion = 0.0; // Inicializa la ponderación en 0.0

                // Verificar si la ponderación es un número válido
                try {
                    ponderacion = Double.parseDouble(actividad.get(3));
                    totalPonderacion += ponderacion; // Sumar a la ponderación total
                } catch (NumberFormatException e) {
                    // Manejo de error si el valor no es un número válido
                    System.err.println("Error al analizar la ponderación: " + e.getMessage());
                }

                // Obtener la nota de la columna 1 de notasCurso
                if (!notasCurso.isEmpty()) {
                    String notaColumna1 = notasCurso.get(0).get(1);
                    try {
                        double notaDividida = Double.parseDouble(notaColumna1) / 100;
                        notaObtenida = notaDividida * ponderacion;

                        // Crear una lista con los datos de la fila
                        List<Object> fila = Arrays.asList(columna1, columna2, ponderacion, notaObtenida);

                        // Verificar si la fila ya se agregó previamente
                        if (filasUnicas.add(fila)) {
                            // Si la fila es única, agregarla al modelo de tabla
                            modeloTablaAlumno.addRow(fila.toArray());

                            sumaNotas += notaObtenida;
                            contadorCoincidencias++;
                        }
                    } catch (NumberFormatException e) {
                        // Manejo de error si el valor no es un número válido
                        System.err.println("Error al analizar la nota: " + e.getMessage());
                    }
                }
            }
        }
    }

    // Actualizar el JTextField txtTotalPonderacion con la suma total
    txtTotalPonderacion.setText(String.valueOf(totalPonderacion));

    // Calcular el promedio de las notas si hay coincidencias
    if (contadorCoincidencias > 0) {
        double promedioNotas = sumaNotas / contadorCoincidencias;
        // Actualizar el JTextField txtPromedioNotas con el promedio de notas
        txtPromedioNotas.setText(String.valueOf(promedioNotas));
    } else {
        // No hay coincidencias, establecer el texto en blanco o un mensaje adecuado
        txtPromedioNotas.setText("");
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TalaAlumno = new javax.swing.JTable();
        panelBarras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        actualizarBoton = new javax.swing.JButton();
        txtTotalPonderacion = new javax.swing.JTextField();
        txtPromedioNotas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        TalaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Ponderacion", "Nota Obtenida"
            }
        ));
        jScrollPane1.setViewportView(TalaAlumno);

        javax.swing.GroupLayout panelBarrasLayout = new javax.swing.GroupLayout(panelBarras);
        panelBarras.setLayout(panelBarrasLayout);
        panelBarrasLayout.setHorizontalGroup(
            panelBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        panelBarrasLayout.setVerticalGroup(
            panelBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Curso");

        jButton1.setText("regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        actualizarBoton.setText("Actualizar tabla y grafica");
        actualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(panelBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotalPonderacion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPromedioNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(actualizarBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1))))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(actualizarBoton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPonderacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPromedioNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    private void actualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBotonActionPerformed
        // TODO add your handling code here:
    DefaultTableModel modeloTabla = (DefaultTableModel) TalaAlumno.getModel();
    modeloTabla.setRowCount(0);  
    mostrarActividadesPorNombre(nombreCurso2);
    repaint(); 
    }//GEN-LAST:event_actualizarBotonActionPerformed

public void paint(Graphics g) {
        super.paintComponents(g);
        
        // Define las coordenadas y dimensiones de las barras
        int barraX = 140; // Coordenada X de la primera barra
        int barraY = 576; // Coordenada Y de las barras
        int barraAncho = 50; // Ancho de las barras
        int maxAlturaBarra = 100; // Altura máxima de las barras (ajusta según tus necesidades)

        // Itera a través del vector de actividades
        for (Vector<String> actividad : actividadesCurso) {
            if (actividad.size() >= 4) {
                String nombreCursoActividad = actividad.get(0);

                // Si el nombre del curso coincide con nombreCurso2
                if (nombreCursoActividad.equals(nombreCurso2)) {
                    // Obtener los datos necesarios
                    String tituloBarra = actividad.get(1);
                    double notaObtenida = Double.parseDouble(actividad.get(3));

                    // Calcula la altura de la barra en función de la notaObtenida
                    int barraAltura = (int) ((notaObtenida / 70) * maxAlturaBarra); // Ajusta según tus necesidades

                    // Dibuja la barra con título
                    g.setColor(Color.BLUE); // Color de la barra (puedes cambiarlo)
                    g.fillRect(barraX, barraY - barraAltura, barraAncho, barraAltura);
                    g.setColor(Color.BLACK); // Color del texto (puedes cambiarlo)
                    g.drawString(tituloBarra, barraX, barraY + 15);

                    // Actualiza la coordenada X para la siguiente barra
                    barraX += barraAncho + 20; // Ajusta el espacio entre barras si es necesario
                }
            }
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CursoAlumnoPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoAlumnoPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoAlumnoPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoAlumnoPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursoAlumnoPlantilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TalaAlumno;
    private javax.swing.JButton actualizarBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBarras;
    private javax.swing.JTextField txtPromedioNotas;
    private javax.swing.JTextField txtTotalPonderacion;
    // End of variables declaration//GEN-END:variables
}
