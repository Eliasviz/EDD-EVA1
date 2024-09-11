/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_arreglos_multiples;

/**
 *
 * @author Elias
 */
public class EVA1_13_ARREGLOS_MULTIPLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int [3][2];
        System.out.println(matriz);
        System.out.println(matriz[0]);
        System.out.println(matriz[1]);
        System.out.println(matriz[2]);
        System.out.println(matriz[1][1]);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100);               
            }           
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");               
            }
            System.out.println("");
        }
    }    
}
