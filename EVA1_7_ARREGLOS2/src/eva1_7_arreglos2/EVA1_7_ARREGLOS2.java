/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos2;

/**
 *
 * @author Elias
 */
public class EVA1_7_ARREGLOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] datos = new int[10];
        for (int i = 0; datos.length < 10; i++) {
            datos [i] = ((int) (Math.random() * 100));
        }
        for (int i = 0; datos.length < 10; i++) {
            System.out.println("[" + datos[i] + "]");
    }
    
}
}