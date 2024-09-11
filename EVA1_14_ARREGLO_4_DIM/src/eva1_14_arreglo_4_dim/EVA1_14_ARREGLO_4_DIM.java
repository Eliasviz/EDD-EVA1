/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_arreglo_4_dim;

/**
 *
 * @author Elias
 */
public class EVA1_14_ARREGLO_4_DIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][][][] matriz = new int [4][3][3][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    for (int l = 0; l < matriz[i][j][k].length; l++) {
                        matriz[i][j][k][l] = (int)(Math.random() * 100);
                    }
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    for (int l = 0; l < matriz[i][j][k].length; l++) {
                        System.out.print("[" + matriz[i][j][k][l] + "]");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
