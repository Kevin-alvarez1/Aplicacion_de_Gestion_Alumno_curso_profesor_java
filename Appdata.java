/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

/**
 *
 * @author Player
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Appdata implements Serializable {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
     /*   // Serializar los datos
        serializarDatos(vectorDatos);

        // Deserializar los datos
        Vector<Vector<String>> datosDeserializados = deserializarDatos();
        if (datosDeserializados != null) {
            // Haz algo con los datos deserializados
            System.out.println("Datos deserializados: " + datosDeserializados);
        }
    }

    public static void serializarDatos(Vector<Vector<String>> datos) {
        try {
            FileOutputStream fileOut = new FileOutputStream("datos.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(datos);
            out.close();
            fileOut.close();
            System.out.println("Los datos han sido serializados y guardados en datos.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Vector<Vector<String>> deserializarDatos() {
        Vector<Vector<String>> datosDeserializados = null;
        try {
            FileInputStream fileIn = new FileInputStream("datos.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            datosDeserializados = (Vector<Vector<String>>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return datosDeserializados;
    }*/
    }}







