/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

import java.util.Vector;

/**
 *
 * @author Player
 */
public class Curso {
/*public static Vector<Vector<String>> vectorParaCrearBotones = new Vector<>();

    Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;
    String CursoProfe;
    String CodigoCursoProfe;
    int CodigoCursoProfeNum;
    public static Vector<Vector<String>> vectorModuloProfesor = new Vector<>();

    // Constructor que recibe los datos y los almacena en vectorModuloProfesor
    public Curso(String usuarioIngresado, String contrasenaIngresada, String codigoCursoProfe) {
        this.usuarioIngresado = usuarioIngresado;
        this.contrasenaIngresada = contrasenaIngresada;
        this.CodigoCursoProfe = codigoCursoProfe;
        this.CodigoCursoProfeNum = Integer.parseInt(codigoCursoProfe);

        // Busca el registro correspondiente al usuarioIngresado en vectorDeDatos
        Vector<String> datosUsuario = null;
        for (Vector<String> fila : vectorDeDatos) {
            if (fila.size() >= 6 && fila.get(3).equals(usuarioIngresado)) {
                datosUsuario = fila;
                break;
            }
        }

        if (datosUsuario != null) {
            // Almacena los datos en vectorModuloProfesor
            Vector<String> datosModuloProfesor = new Vector<>();
            datosModuloProfesor.add(codigoCursoProfe); // Código del curso
            datosModuloProfesor.add(datosUsuario.get(1)); // Nombre del curso
            datosModuloProfesor.add(usuarioIngresado); // Nombre del profesor
            datosModuloProfesor.add(datosUsuario.get(2)); // Apellido del profesor
            datosModuloProfesor.add(datosUsuario.get(5)); // Cantidad de alumnos

            // Verifica que no haya valores nulos antes de agregarlos
            boolean contieneNulos = datosModuloProfesor.stream().anyMatch(s -> s == null);
            if (!contieneNulos) {
                vectorModuloProfesor.add(datosModuloProfesor);
            }
        }
    }
    


public Vector<Vector<String>> obtenerDatosCursosDelProfesor(String usuarioIngresado) {
    Vector<Vector<String>> vectorCursos = CrearCursoFrame.vectorCursos;
    Vector<Vector<String>> vectorDeDatos = CrearProfe.vectorDatos;

    String nombreProfeModulo = "";
    String apellidoProfeModulo = "";

    for (Vector<String> filaProfe : vectorDeDatos) {
        if (filaProfe.size() >= 4 && filaProfe.get(3) != null && filaProfe.get(3).equals(usuarioIngresado)) {
            nombreProfeModulo = filaProfe.get(1);
            apellidoProfeModulo = filaProfe.get(2);
        }
    }

    boolean asignado = false;
    Vector<String> cursosAsignados = new Vector<>();

    for (Vector<String> filaCurso : vectorCursos) {
        if (filaCurso.size() >= 5) {
            String codigoCurso = filaCurso.get(0); // El código del curso se encuentra en la posición 0

            if (nombreProfeModulo != null && nombreProfeModulo.equals(filaCurso.get(3))) {
                if (!asignado) {
                    cursosAsignados.clear(); // Limpiar cursos asignados
                    asignado = true;
                }
                cursosAsignados.add(filaCurso.get(1)); // Agregar nombre del curso
            } else if (asignado) {
                // Se detiene cuando no coincide
                asignado = false;

                // Agregar cursos asignados al vectorParaCrearBotones
                Vector<String> datosCurso = new Vector<>();
                datosCurso.add(String.join(", ", cursosAsignados)); // Agregar cursos asignados al vector
                datosCurso.add(nombreProfeModulo); // Agregar nombre del profesor al vector
                datosCurso.add(apellidoProfeModulo); // Agregar apellido del profesor al vector

                // Agregar la cantidad de cursos asignados en la última posición del vector
                datosCurso.add(Integer.toString(cursosAsignados.size()));

                vectorParaCrearBotones.add(datosCurso);
            }
        }
    }

    // Agregar cursos finales si quedan cursos asignados al final del bucle
    if (asignado) {
        Vector<String> datosCurso = new Vector<>();
        datosCurso.add(String.join(", ", cursosAsignados)); // Agregar cursos asignados al vector
        datosCurso.add(nombreProfeModulo); // Agregar nombre del profesor al vector
        datosCurso.add(apellidoProfeModulo); // Agregar apellido del profesor al vector

        // Agregar la cantidad de cursos asignados en la última posición del vector
        datosCurso.add(Integer.toString(cursosAsignados.size()));

        vectorParaCrearBotones.add(datosCurso);
    }

    return vectorParaCrearBotones;
}*/
}
