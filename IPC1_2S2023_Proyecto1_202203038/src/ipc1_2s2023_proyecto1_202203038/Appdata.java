/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

/**
 *
 * @author Player
 */
import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.notasCurso;
import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.ordenamientoDeNotasMejores;
import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.vectorAlumnosAsignadosAsignados;
import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.ordenamientoDeNotasPeores;
import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.alumnosEnCurso;
import static ipc1_2s2023_proyecto1_202203038.CursoPlantillaModuloProfe.actividadesCurso;
import static ipc1_2s2023_proyecto1_202203038.CrearCursoFrame.vectorCursos;
import static ipc1_2s2023_proyecto1_202203038.CrearProfe.vectorDatos;
import static ipc1_2s2023_proyecto1_202203038.LoginAlumnoJframe.vectorParaCrearBotonesAlumno;
import static ipc1_2s2023_proyecto1_202203038.LoginProfesores.vectorParaCrearBotones;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


//si crea el archivo.bin pero no lo llena con nada

public class Appdata {
    public static LinkedList<Vector<Vector<String>>> listaDeVectores = new LinkedList<>();
    public static String rutaUsuariosSerializados = "./DatosSerializados/datosSerializados.bin"; // Ruta relativa al paquete

    public static void llenarListaDeVectores() {
        listaDeVectores.add(vectorAlumnosAsignadosAsignados);
        listaDeVectores.add(notasCurso);
        listaDeVectores.add(ordenamientoDeNotasMejores);
        listaDeVectores.add(ordenamientoDeNotasPeores);
        listaDeVectores.add(alumnosEnCurso);
        listaDeVectores.add(actividadesCurso);
        listaDeVectores.add(vectorCursos);
        listaDeVectores.add(vectorDatos);
        listaDeVectores.add(vectorParaCrearBotonesAlumno);
        listaDeVectores.add(vectorParaCrearBotones);
    }
public static void serializar() {
    // Se crea el archivo donde se va a serializar
    File file = new File(rutaUsuariosSerializados);

    // Creamos la carpeta donde irán los archivos serializados, si no existía
    if (!file.getParentFile().exists()) {
        file.getParentFile().mkdirs();
    }

    try {
        // Se crea el archivo donde se va a serializar (o se sobrescribe si ya existe)
        file.createNewFile();

        // Se utiliza FileOutputStream sin la ruta del archivo
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listaDeVectores);
        oos.close();
        fos.close();
        System.out.println("Vectores serializados correctamente.");
    } catch (IOException ex) {
        System.out.println("Ocurrió un error al intentar serializar los vectores.");
        ex.printStackTrace();
    }
}
  public static void deserializar() {
        try {
            File file = new File(rutaUsuariosSerializados);
            if (!file.exists()) {
                return;
            }
            FileInputStream fis = new FileInputStream(rutaUsuariosSerializados);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listaDeVectores = (LinkedList<Vector<Vector<String>>>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Appdata.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Appdata.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Appdata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


