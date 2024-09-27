/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_for_recursivo;

/**
 *
 * @author Elias
 */
public class EVA1_16_FOR_RECURSIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        for (int i = 5; i > 0; i--) {
            System.out.println("La secuencia es: " + i);            
        }
        */
        ForRecursivo(10);
        System.out.println("");
        ForRecursivoup(1,10);
    }
    public static void ForRecursivo(int val){
        System.out.print(val + " - ");
        if(val > 1)
            ForRecursivo(val - 1);
    }
    public static void ForRecursivoup(int val, int fin){
        System.out.print(val + " - ");
        if(val < fin)
            ForRecursivoup(val + 1,fin);
    }
    
}
