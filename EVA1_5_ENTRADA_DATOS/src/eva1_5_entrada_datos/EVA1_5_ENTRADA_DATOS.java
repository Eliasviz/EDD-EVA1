/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        
        //CAPTURA DE DATOS DEL TECLADO
        //Scanner --> herramienta (clase)
        //Scanner: es un tipo de dato
        Scanner captura; //incorporar la herramienta al codigo (import)
        //no existe, hay que crearla
        captura = new Scanner (System.in);
        
        //DARLE LA INSTRUCCIÓN AL USUARIO
        System.out.println("Introduce tu nombre completo");
        //captura (asignar un valor a la variable
        nombre=captura.nextLine();//capturamos todo el texto
                                  //hasta que precione "enter"
        //IMPRIMIR LOS DATOS:
        System.out.println("------------DATOS CAPTURADOS--------------");
        System.out.println(nombre);
        
    }
    
}
