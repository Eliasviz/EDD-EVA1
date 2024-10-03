/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_factorial;

/**
 *
 * @author Elias
 */
public class EVA1_17_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 = " + Factorial(5));
        System.out.println("Factorial de 5 = " + FactorialRec(5));
    }
    public static int Factorial(int valor){
        int facto = 1;
        for (int i = 1; i <= valor; i++) 
            facto = facto * i;
            return facto;
    }
    public static int FactorialRec(int valor){
        if(valor > 0)
            return valor * FactorialRec(valor - 1);
        else
            return 1;            
    }
    
    
}
