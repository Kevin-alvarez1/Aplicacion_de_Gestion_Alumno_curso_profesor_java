/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

import static ipc1_2s2023_proyecto1_202203038.CrearProfe.vectorDatos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.Serializable;
/**
 *
 * @author Player
 */
public class ModuloAdmin extends javax.swing.JFrame implements Serializable  {
JFileChooser seleccionarProfe = new JFileChooser();
File CargaProfes;
JFileChooser seleccionarCurso = new JFileChooser();
File CargaCurso;
JFileChooser seleccionarAlumno = new JFileChooser();
File CargaAlumno;

FileInputStream entrada;
FileOutputStream salida;


    /**
     * Creates new form ModuloAdmin
     */
    public ModuloAdmin() {
        initComponents();
     this.setLocationRelativeTo(null);
       this.setResizable(false);
    }

boolean GraficaP = false;
boolean Grafica = false;

public  static Vector<Vector<String>> vectorAlumnos = new Vector<>();

public void paint(Graphics g) {
    
         Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;   
    super.paintComponents(g);
    
    if (Grafica==true) {
        int CantidadM = 0;
        int CantidadF = 0;

        // Verifica si el vector de datos no está vacío
        if (vectorDeDatos != null && !vectorDeDatos.isEmpty()) {
            // Recorre todo el vector de datos
            for (Vector<String> fila : vectorDeDatos) {
                if (fila.size() > 4) { // Asegúrate de que haya al menos 5 columnas
                    String genero = fila.get(4); // La columna de género es la quinta (índice 4)

                    // Verifica si el género es "m" o "f" y cuenta
                    if ("m".equals(genero)) {
                        CantidadM++;
                    } else if ("f".equals(genero)) {
                        CantidadF++;
                    }
                }
            }
        }
       
        // Dibuja la gráfica de pastel
        int totalGeneros = CantidadM + CantidadF;
        int gradosAzul = CantidadM * 360 / totalGeneros;
        int gradosRojo = CantidadF * 360 / totalGeneros;
        
        double totalGenerosPorce = CantidadM + CantidadF;
        double HombresPorcentaje = (CantidadM /totalGenerosPorce)*100;
        double MujeresPorcentaje = (CantidadF /totalGenerosPorce)*100;
        DecimalFormat formato1 = new DecimalFormat("#.00");
        String numeroConDosDecimalesHombre = formato1.format(HombresPorcentaje);
        DecimalFormat formato2 = new DecimalFormat("#.00");
        String numeroConDosDecimalesMujer = formato2.format(MujeresPorcentaje);
       
        // Dibuja la porción azul
        g.setColor(new Color(255, 0, 0));
        g.fillArc(420, 278, 200, 200, 0, gradosRojo);
        g.fillRect(655, 308, 20, 20);
        g.drawString("Mujeres", 685, 318);
        g.drawString(" "+numeroConDosDecimalesMujer+"%", 755, 318);

        // Dibuja la porción roja
        g.setColor(new Color(0, 0, 255));
        g.fillArc(420, 278, 200, 200, gradosRojo , gradosAzul);
        g.fillRect(655, 338, 20, 20);
        g.drawString("Hombres", 685, 348);
        g.drawString(" "+numeroConDosDecimalesHombre+"%", 755, 348);

    }  else if (GraficaP == true) {
     Vector<Vector<String>> vectorAlumnos = ModuloAdmin.vectorAlumnos;
        int CantidadM2 = 0;
        int CantidadF2 = 0;

        // Verifica si el vector de datos no está vacío
        if (vectorAlumnos != null && !vectorAlumnos.isEmpty()) {
            // Recorre todo el vector de datos
            for (Vector<String> fila : vectorAlumnos) {
                if (fila.size() > 4) { // Asegúrate de que haya al menos 5 columnas
                    String genero = fila.get(4).toLowerCase(); // Convierte a minúsculas antes de comparar
                    if ("m".equals(genero)) {
                        CantidadM2++;
                    } else if ("f".equals(genero)) {
                        CantidadF2++;
                    }
                }
            }
        }
        // Dibuja la gráfica de pastel
        int total2Generos = CantidadM2 + CantidadF2;
        int gradosAzul2 = CantidadM2 * 360 / total2Generos;
        int gradosRojo2 = CantidadF2 * 360 / total2Generos;
        
        double totalGeneros2Porce = CantidadM2 + CantidadF2;
        double Hombres2Porcentaje = (CantidadM2 /totalGeneros2Porce)*100;
        double Mujeres2Porcentaje = (CantidadF2 /totalGeneros2Porce)*100;
        DecimalFormat formato1 = new DecimalFormat("#.00");
        String numeroConDos2DecimalesHombre = formato1.format(Hombres2Porcentaje);
        DecimalFormat formato2 = new DecimalFormat("#.00");
        String numeroConDos2DecimalesMujer = formato2.format(Mujeres2Porcentaje);
       
        // Dibuja la porción azul
        g.setColor(new Color(255, 0, 0));
        g.fillArc(420, 278, 200, 200, 0, gradosRojo2);
        g.fillRect(655, 308, 20, 20);
        g.drawString("Mujeres", 685, 318);
        g.drawString(" "+numeroConDos2DecimalesMujer+"%", 755, 318);

        // Dibuja la porción roja
        g.setColor(new Color(0, 0, 255));
        g.fillArc(420, 278, 200, 200, gradosRojo2 , gradosAzul2);
        g.fillRect(655, 338, 20, 20);
        g.drawString("Hombres", 685, 348);
        g.drawString(" "+numeroConDos2DecimalesHombre+"%", 755, 348);


    }
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
public class CrearHTMLProfes implements Serializable{

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
            escritor.write("<th>Contraseña</th>");            
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
         Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;   
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
        CrearProfesor = new javax.swing.JButton();
        ActualizarMatriz = new javax.swing.JButton();
        CargaMasivaProfe = new javax.swing.JButton();
        BorrarProfesor = new javax.swing.JButton();
        ExportarProfesPDF = new javax.swing.JButton();
        RegresarMenuP = new javax.swing.JButton();
        ActualizarLaTabla = new javax.swing.JButton();
        LimpiarTablaBoton = new javax.swing.JButton();
        BotonGrafica = new javax.swing.JButton();
        panelgrafica = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoOficialCurso = new javax.swing.JTable();
        CrearCursoBoton = new javax.swing.JButton();
        CargaMasivaCursoBoton = new javax.swing.JButton();
        ActualizarCursoBoton = new javax.swing.JButton();
        EliminarCursoBoton = new javax.swing.JButton();
        ExportarHTMLCursoBoton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ActualizarTablaCursos = new javax.swing.JButton();
        LimpiarTablaCursos = new javax.swing.JButton();
        ActivarGraficaCursos = new javax.swing.JButton();
        RegresarMenuBoton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AlumnosTabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CargaMasivaAlumnosBoton = new javax.swing.JButton();
        ExportarAlumnoHTMLBoton = new javax.swing.JButton();
        ActualizarTablaAlumnos = new javax.swing.JButton();
        LimpiarTablaAlumnos = new javax.swing.JButton();
        ActivarGraficaAlumnos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        ExportarProfesPDF.setText("Exportar Listado a HTML");
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

        BotonGrafica.setText("Activar Grafica");
        BotonGrafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGraficaMouseClicked(evt);
            }
        });
        BotonGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGraficaActionPerformed(evt);
            }
        });

        jLabel1.setText("Genero de profesores: ");

        javax.swing.GroupLayout panelgraficaLayout = new javax.swing.GroupLayout(panelgrafica);
        panelgrafica.setLayout(panelgraficaLayout);
        panelgraficaLayout.setHorizontalGroup(
            panelgraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelgraficaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelgraficaLayout.setVerticalGroup(
            panelgraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelgraficaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Listado Oficial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ActualizarLaTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LimpiarTablaBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonGrafica))
                    .addComponent(TablaProfesoresMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelgrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegresarMenuP)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(CrearProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CargaMasivaProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ActualizarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BorrarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(ExportarProfesPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablaProfesoresMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarLaTabla)
                    .addComponent(LimpiarTablaBoton)
                    .addComponent(BotonGrafica))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CargaMasivaProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CrearProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BorrarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExportarProfesPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegresarMenuP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelgrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jTabbedPane1.addTab("Profesores", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Listado Oficial");

        ListadoOficialCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Creditos", "Alumnos", "Profesor"
            }
        ));
        jScrollPane1.setViewportView(ListadoOficialCurso);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        CrearCursoBoton.setText("Crear");
        CrearCursoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCursoBotonActionPerformed(evt);
            }
        });

        CargaMasivaCursoBoton.setText("Carga Masiva");
        CargaMasivaCursoBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargaMasivaCursoBotonMouseClicked(evt);
            }
        });
        CargaMasivaCursoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMasivaCursoBotonActionPerformed(evt);
            }
        });

        ActualizarCursoBoton.setText("Actualizar");
        ActualizarCursoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarCursoBotonActionPerformed(evt);
            }
        });

        EliminarCursoBoton.setText("Eliminar");
        EliminarCursoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarCursoBotonActionPerformed(evt);
            }
        });

        ExportarHTMLCursoBoton.setText("Exportar Listado a HTML");
        ExportarHTMLCursoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarHTMLCursoBotonActionPerformed(evt);
            }
        });

        jLabel4.setText("Top 3 Cursos con más estudiantes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        ActualizarTablaCursos.setText("Actualizar Tabla");
        ActualizarTablaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarTablaCursosActionPerformed(evt);
            }
        });

        LimpiarTablaCursos.setText("Limpiar Tabla");
        LimpiarTablaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTablaCursosActionPerformed(evt);
            }
        });

        ActivarGraficaCursos.setText("Activar Grafica");
        ActivarGraficaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarGraficaCursosActionPerformed(evt);
            }
        });

        RegresarMenuBoton.setText("Regresar al menu principal");
        RegresarMenuBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ActualizarTablaCursos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LimpiarTablaCursos)
                                .addGap(18, 18, 18)
                                .addComponent(ActivarGraficaCursos)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ActualizarCursoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CrearCursoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CargaMasivaCursoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(EliminarCursoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(RegresarMenuBoton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExportarHTMLCursoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CrearCursoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CargaMasivaCursoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ActualizarCursoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EliminarCursoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExportarHTMLCursoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegresarMenuBoton)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ActualizarTablaCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LimpiarTablaCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ActivarGraficaCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cursos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        AlumnosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Correo", "Genero"
            }
        ));
        jScrollPane2.setViewportView(AlumnosTabla);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Listado Oficial");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Genero de Alumnos");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CargaMasivaAlumnosBoton.setText("Carga Masiva");
        CargaMasivaAlumnosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMasivaAlumnosBotonActionPerformed(evt);
            }
        });

        ExportarAlumnoHTMLBoton.setText("Exportar a HTML");
        ExportarAlumnoHTMLBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarAlumnoHTMLBotonActionPerformed(evt);
            }
        });

        ActualizarTablaAlumnos.setText("Actualizar Tabla");
        ActualizarTablaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarTablaAlumnosActionPerformed(evt);
            }
        });

        LimpiarTablaAlumnos.setText("Limpiar Tabla");
        LimpiarTablaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTablaAlumnosActionPerformed(evt);
            }
        });

        ActivarGraficaAlumnos.setText("Activar Grafica");
        ActivarGraficaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarGraficaAlumnosActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar al menu anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ActualizarTablaAlumnos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LimpiarTablaAlumnos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ActivarGraficaAlumnos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ExportarAlumnoHTMLBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CargaMasivaAlumnosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(CargaMasivaAlumnosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExportarAlumnoHTMLBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ActivarGraficaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(ActualizarTablaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(LimpiarTablaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
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
private void llenarTablaCurso() {
    // Obtener el vector de datos desde CrearProfe
    Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;
    Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;   

    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla2 = (DefaultTableModel) ListadoOficialCurso.getModel();

    // Limpia la tabla antes de agregar datos nuevos
    modeloTabla2.setRowCount(0);

    // Iterar a través de los datos de vectorCursos
    for (Vector<String> filaCurso : vectorCursos) {
        // Verificar si hay al menos una columna en filaCurso
        if (filaCurso.size() >= 1) {
            String codigoCurso = filaCurso.get(0); // Obtener el código del curso desde la primera columna

            // Buscar el código en el vectorDeDatos
            for (Vector<String> filaDatos : vectorDeDatos) {
                if (filaDatos.size() >= 3) {
                    String codigoDatos = filaDatos.get(0); // Obtener el código desde la primera columna de vectorDeDatos
                    if (codigoCurso != null && codigoCurso.equals(codigoDatos)) {
                        // Si los códigos coinciden, obtén el nombre completo del profesor
                        String nombreCompleto = obtenerNombreCompletoProfesor(filaDatos);

                        if (nombreCompleto != null && !nombreCompleto.isEmpty()) {
                            // Si el nombre completo no es null ni está vacío, actualiza la última columna de filaCurso
                            filaCurso.set(filaCurso.size() - 1, nombreCompleto);
                            break; // No es necesario seguir buscando, se encontró la coincidencia
                        }
                    }
                }
            }

            // Verifica si se encontró un nombre completo antes de agregar la fila al modelo de la tabla
            if (filaCurso.size() >= 1 && filaCurso.get(filaCurso.size() - 1) != null && !filaCurso.get(filaCurso.size() - 1).isEmpty()) {
                // Agrega la fila actual (actualizada si es necesario) al modelo de la tabla
                modeloTabla2.addRow(filaCurso.toArray());
            }
        }
    }
}

// Método para obtener el nombre completo del profesor a partir de la segunda y tercera columna del vector
private String obtenerNombreCompletoProfesor(Vector<String> filaDatos) {
    if (filaDatos.size() >= 3 && filaDatos.get(1) != null && filaDatos.get(2) != null) {
        String nombre = filaDatos.get(1);
        String apellido = filaDatos.get(2);
        return nombre + " " + apellido;
    }    
    return "";
    
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
     MenuPrincipal ApareceMenuP = new MenuPrincipal();
    ApareceMenuP.setVisible(true);
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

    private void BotonGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGraficaActionPerformed
    
    }//GEN-LAST:event_BotonGraficaActionPerformed

    private void BotonGraficaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGraficaMouseClicked
    GraficaP = false;
    Grafica = true; // Desactiva la primera gráfica si es necesario
    repaint();

    }//GEN-LAST:event_BotonGraficaMouseClicked

    private void CrearCursoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCursoBotonActionPerformed
               CrearCursoFrame Aparece3 = new CrearCursoFrame();
               Aparece3.setVisible(true);
               
    }//GEN-LAST:event_CrearCursoBotonActionPerformed
   public String AbrirCargaCursos(File CargaCurso){

       Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;
       String documento2 = "";
    try {
        BufferedReader br = new BufferedReader(new FileReader(CargaCurso));
        String linea;
        
        while ((linea = br.readLine()) != null) {
            String[] campos = linea.split(",");
            
            // Convierte los campos en un vector de cadenas
            Vector<String> fila = new Vector<>();
            for (String campo : campos) {
                fila.add(campo);
            }
            
            // Agrega la fila al vectorDeDatos
            vectorCursos.add(fila);
        }

        br.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return documento2;
        }
    private void cargarDatosDesdeCSVCurso(File archivoCSV) {
    DefaultTableModel modelo = (DefaultTableModel) ListadoOficialCurso.getModel();
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
    private void CargaMasivaCursoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMasivaCursoBotonActionPerformed
              // TODO add your handling code here:     
    Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;

        if(seleccionarCurso.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
           CargaCurso=seleccionarCurso.getSelectedFile();
           if(CargaCurso.canRead()){
               if(CargaCurso.getName().endsWith("csv")){
                   String documento2 = AbrirCargaCursos(CargaCurso);
                    cargarDatosDesdeCSVCurso(CargaCurso); // Llamamos a un método para cargar los datos
                    llenarTablaCurso();

               } else{
                JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
               }
           }
        }
        
       
    }//GEN-LAST:event_CargaMasivaCursoBotonActionPerformed

    private void ActualizarCursoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarCursoBotonActionPerformed
    // TODO add your handling code here:
          ActualizarCursoFrame Aparece = new ActualizarCursoFrame();
          Aparece.setVisible(true);    
    }//GEN-LAST:event_ActualizarCursoBotonActionPerformed

    private void EliminarCursoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarCursoBotonActionPerformed
   // TODO add your handling code here:
           BorrarCursoFrame Aparece = new BorrarCursoFrame();
          Aparece.setVisible(true);  
    }//GEN-LAST:event_EliminarCursoBotonActionPerformed

    private void ActualizarTablaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarTablaCursosActionPerformed
    // TODO add your handling code here:
    Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;
    
    llenarTablaCurso();
    }//GEN-LAST:event_ActualizarTablaCursosActionPerformed

    private void ActivarGraficaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarGraficaCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActivarGraficaCursosActionPerformed
 
    
    public String GuardarCargaCurso(File CargaCurso, String documento){
  String mensaje = null;
        try {
            FileWriter escritor = new FileWriter(CargaCurso);
            escritor.write(documento);
            escritor.close();
            mensaje = "Archivo Guardado";
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir al guardar el archivo
            mensaje = "Error al guardar el archivo: " + e.getMessage();
        }
        return mensaje;
}
    private void CargaMasivaCursoBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargaMasivaCursoBotonMouseClicked

    }//GEN-LAST:event_CargaMasivaCursoBotonMouseClicked

    private void LimpiarTablaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTablaCursosActionPerformed
        // TODO add your handling code here:
               limpiarTabla(ListadoOficialCurso); 

    }//GEN-LAST:event_LimpiarTablaCursosActionPerformed

    private void RegresarMenuBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuBotonActionPerformed
  // TODO add your handling code here:
   MenuPrincipal ApareceMenuP = new MenuPrincipal();
    ApareceMenuP.setVisible(true);
              this.dispose();

    }//GEN-LAST:event_RegresarMenuBotonActionPerformed
public class CrearHTMLCurso implements Serializable {

    public static void crearHTMLCurso(Vector<Vector<String>> vectorCursos, String nombreArchivo3) {
try {
            FileWriter escritor3 = new FileWriter(nombreArchivo3);

            escritor3.write("<html>");
            escritor3.write("<head>");
            escritor3.write("<title>Listado de Cursos</title>");
            escritor3.write("</head>");
            escritor3.write("<body>");
            
            // Crear una tabla HTML para mostrar los datos del vector
            escritor3.write("<table border='1'>");
            
            // Agregar encabezados de la tabla
            escritor3.write("<tr>");
            escritor3.write("<th>Código</th>");
            escritor3.write("<th>Curso</th>");
            escritor3.write("<th>Creditos</th>");
            escritor3.write("<th>Alumnos</th>");
            escritor3.write("<th>Profesor</th>");
            escritor3.write("</tr>");
            
            // Agregar filas de datos
            for (Vector<String> fila : vectorCursos) {
                escritor3.write("<tr>");
                for (String valor : fila) {
                    escritor3.write("<td>" + valor + "</td>");
                }
                escritor3.write("</tr>");
            }
            
            escritor3.write("</table>");
            
            escritor3.write("</body>");
            escritor3.write("</html>");

            escritor3.close();
            System.out.println("Archivo HTML creado exitosamente: " + nombreArchivo3);
        } catch (IOException e) {
            System.err.println("Error al crear el archivo HTML: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ejemplo de cómo usar el método crearHTML
    Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;
        // Llena vector con datos desde donde sea necesario

        String nombreArchivo3 = "ListadoProfes.html";
        crearHTMLCurso(vectorCursos, nombreArchivo3);
    }
}
    private void ExportarHTMLCursoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarHTMLCursoBotonActionPerformed
// TODO add your handling code here:
          // Obtener el vector de datos desde donde sea necesario
    Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;

    // Nombre del archivo HTML a generar
    String nombreArchivo = "ListadoCursos.html";

    // Llamar al método para crear el archivo HTML
    CrearHTMLCurso.crearHTMLCurso(vectorCursos, nombreArchivo);
    }//GEN-LAST:event_ExportarHTMLCursoBotonActionPerformed
 public String AbrirCargaAlumnos(File CargaAlumno){
Vector<Vector<String>> vectorAlumnos = ModuloAdmin.vectorAlumnos;
       String documento3 = "";
    try {
        BufferedReader br = new BufferedReader(new FileReader(CargaAlumno));
        String linea;
        
        while ((linea = br.readLine()) != null) {
            String[] campos = linea.split(",");
            
            // Convierte los campos en un vector de cadenas
            Vector<String> fila = new Vector<>();
            for (String campo : campos) {
                fila.add(campo);
            }
            
            // Agrega la fila al vectorDeDatos
            vectorAlumnos.add(fila);
        }

        br.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return documento3;
        }
    private void cargarDatosDesdeCSVAlumnos(File archivoCSV) {
DefaultTableModel modelo = (DefaultTableModel) AlumnosTabla.getModel();
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
     private void llenarTablaAlumnos() {
// Obtener el vector de datos desde CrearProfe
     Vector<Vector<String>> vectorAlumnos = ModuloAdmin.vectorAlumnos;

    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) AlumnosTabla.getModel();

    // Limpia la tabla antes de agregar datos nuevos
    modeloTabla.setRowCount(0);

    // Llenar la tabla con los datos del vector, omitiendo filas con valores nulos
    for (Vector<String> fila : vectorAlumnos) {
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
    private void CargaMasivaAlumnosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMasivaAlumnosBotonActionPerformed
        // TODO add your handling code here:
Vector<Vector<String>> vectorAlumnos = ModuloAdmin.vectorAlumnos;

        if(seleccionarAlumno.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
           CargaAlumno=seleccionarAlumno.getSelectedFile();
           if(CargaAlumno.canRead()){
               if(CargaAlumno.getName().endsWith("csv")){
                   String documento4 = AbrirCargaAlumnos(CargaAlumno);
                    cargarDatosDesdeCSVAlumnos(CargaAlumno); // Llamamos a un método para cargar los datos
                    llenarTablaAlumnos();

               } else{
                JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
               }
           }
        }
        
         
    }//GEN-LAST:event_CargaMasivaAlumnosBotonActionPerformed

    private void LimpiarTablaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTablaAlumnosActionPerformed
        // TODO add your handling code here:
limpiarTabla(AlumnosTabla); 

    }//GEN-LAST:event_LimpiarTablaAlumnosActionPerformed

    private void ActualizarTablaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarTablaAlumnosActionPerformed
        // TODO add your handling code here:
Vector<Vector<String>> vectorAlumnos = ModuloAdmin.vectorAlumnos;
    llenarTablaAlumnos();
    }//GEN-LAST:event_ActualizarTablaAlumnosActionPerformed
 
    
    private void ActivarGraficaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarGraficaAlumnosActionPerformed
        // TODO add your handling code here:
GraficaP = true;
    Grafica = false; // Desactiva la primera gráfica si es necesario
    repaint();
    }//GEN-LAST:event_ActivarGraficaAlumnosActionPerformed
public class CrearHTMLAlumno implements Serializable {

    public static void crearHTMLAlumno(Vector<Vector<String>> vectorAlumnos, String nombreArchivo4) {
        try {
            FileWriter escritor34 = new FileWriter(nombreArchivo4);

            escritor34.write("<html>");
            escritor34.write("<head>");
            escritor34.write("<title>Listado de Cursos</title>");
            escritor34.write("</head>");
            escritor34.write("<body>");
            
            // Crear una tabla HTML para mostrar los datos del vector
            escritor34.write("<table border='1'>");
            
            // Agregar encabezados de la tabla
            escritor34.write("<tr>");
            escritor34.write("<th>Código</th>");
            escritor34.write("<th>Nombre</th>");
            escritor34.write("<th>Apellido</th>");
            escritor34.write("<th>Correo</th>");
            escritor34.write("<th>Genero</th>");
            escritor34.write("<th>Contraseña</th>");            
            escritor34.write("</tr>");
            
            // Agregar filas de datos
            for (Vector<String> fila : vectorAlumnos) {
                escritor34.write("<tr>");
                for (String valor : fila) {
                    escritor34.write("<td>" + valor + "</td>");
                }
                escritor34.write("</tr>");
            }
            
            escritor34.write("</table>");
            
            escritor34.write("</body>");
            escritor34.write("</html>");

            escritor34.close();
            System.out.println("Archivo HTML creado exitosamente: " + nombreArchivo4);
        } catch (IOException e) {
            System.err.println("Error al crear el archivo HTML: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ejemplo de cómo usar el método crearHTML
    Vector<Vector<String>> vectorAlumnos = ModuloAdmin.vectorAlumnos;
        // Llena vector con datos desde donde sea necesario

        String nombreArchivo4 = "ListadoProfes.html";
        crearHTMLAlumno(vectorAlumnos, nombreArchivo4);
    }
}
  public String GuardarCargaAlumno(File CargaAlumno, String documento){
String mensaje = null;
        try {
            FileWriter escritor = new FileWriter(CargaAlumno);
            escritor.write(documento);
            escritor.close();
            mensaje = "Archivo Guardado";
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir al guardar el archivo
            mensaje = "Error al guardar el archivo: " + e.getMessage();
        }
        return mensaje;
}
    private void ExportarAlumnoHTMLBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarAlumnoHTMLBotonActionPerformed
        // TODO add your handling code here:
 // Obtener el vector de datos desde donde sea necesario
    Vector<Vector<String>> vectorAlumnos = ModuloAdmin.vectorAlumnos;

    // Nombre del archivo HTML a generar
    String nombreArchivo = "ListadoAlumnos.html";

    // Llamar al método para crear el archivo HTML
    CrearHTMLAlumno.crearHTMLAlumno(vectorAlumnos, nombreArchivo);       
    }//GEN-LAST:event_ExportarAlumnoHTMLBotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
 MenuPrincipal ApareceMenuP = new MenuPrincipal();
    ApareceMenuP.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JButton ActivarGraficaAlumnos;
    private javax.swing.JButton ActivarGraficaCursos;
    private javax.swing.JButton ActualizarCursoBoton;
    private javax.swing.JButton ActualizarLaTabla;
    private javax.swing.JButton ActualizarMatriz;
    private javax.swing.JButton ActualizarTablaAlumnos;
    private javax.swing.JButton ActualizarTablaCursos;
    private javax.swing.JTable AlumnosTabla;
    private javax.swing.JButton BorrarProfesor;
    private javax.swing.JButton BotonGrafica;
    private javax.swing.JButton CargaMasivaAlumnosBoton;
    private javax.swing.JButton CargaMasivaCursoBoton;
    private javax.swing.JButton CargaMasivaProfe;
    private javax.swing.JButton CrearCursoBoton;
    private javax.swing.JButton CrearProfesor;
    private javax.swing.JButton EliminarCursoBoton;
    private javax.swing.JButton ExportarAlumnoHTMLBoton;
    private javax.swing.JButton ExportarHTMLCursoBoton;
    private javax.swing.JButton ExportarProfesPDF;
    private javax.swing.JButton LimpiarTablaAlumnos;
    private javax.swing.JButton LimpiarTablaBoton;
    private javax.swing.JButton LimpiarTablaCursos;
    private javax.swing.JTable ListadoOficialCurso;
    private javax.swing.JButton RegresarMenuBoton;
    private javax.swing.JButton RegresarMenuP;
    private javax.swing.JScrollPane TablaProfesoresMostrar;
    private javax.swing.JTable TablaProfesoresP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelgrafica;
    // End of variables declaration//GEN-END:variables
}
