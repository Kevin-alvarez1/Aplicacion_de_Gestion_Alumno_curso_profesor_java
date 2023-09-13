/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1_2s2023_proyecto1_202203038;

import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class IPC1_2S2023_Proyecto1_202203038 implements Serializable{


    public static void main (String[] args) {
        Appdata.deserializar();
        Appdata.llenarListaDeVectores();    

        MenuPrincipal Aparece = new MenuPrincipal();
        Aparece.setVisible(true);
        
    }
}

    

    

