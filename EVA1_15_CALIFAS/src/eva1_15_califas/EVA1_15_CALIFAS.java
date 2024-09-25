/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_califas;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_15_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][][] califas;
        int noCarre, noGrop, noAlm;
        System.out.println("Cuantas carreras son? ");
        Scanner captu = new Scanner (System.in);
        noCarre = captu.nextInt();
        captu.nextLine();      
        califas = new int [noCarre][][];
        for (int i = 0; i < califas.length; i++) {
            System.out.println("Cuantos grupos son de la carrera? " + i);
            noGrop = captu.nextInt();
            captu.nextLine();
            califas[i] = new int [noGrop][];
            for (int j = 0; j < califas[i].length ; j++) {
                System.out.println("Cuantos aluimnos son de la carrera? " + i + " y del grupo " + j);
                noAlm = captu.nextInt();
                captu.nextLine();
                califas[i][j] = new int [noAlm];
                for (int k = 0; k < califas[i][j].length; k++) {
                    System.out.println("Calificacion de el alumno " + k +", del Grupo "+ j + ", de la Carrera " + i);
                    califas[i][j][k] = captu.nextInt();
                    captu.nextLine();
                    
                }
                
                
            }
            
        }
    }
}

