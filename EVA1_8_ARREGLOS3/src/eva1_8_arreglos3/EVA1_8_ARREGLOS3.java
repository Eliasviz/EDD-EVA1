/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_arreglos3;

/**
 *
 * @author Elias
 */
public class EVA1_8_ARREGLOS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] diaSemanas = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        int[] billetes = {20, 50, 100, 200, 500, 1000};
        for (int i = 0; diaSemanas.length < 10; i++) {
            System.out.print("[" + diaSemanas[i] + "]");            
        }
        System.out.println("");
        for (int i = 0; billetes.length < 10; i++) {
            System.out.print("[" + billetes[i] + "]");
            
        }
    }
    
}
