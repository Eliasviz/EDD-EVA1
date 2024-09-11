/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_arreglo_obj;

/**
 *
 * @author invitado
 */
public class EVA1_12_ARREGLO_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] arregloper = new Persona[5];
        System.out.println("Dirrecion Arreglos" + arregloper);
        for (int i = 0; i < arregloper.length; i++) {
            arregloper[i] = new Persona();
            System.out.println("arregloper[" + i + "] = " + arregloper[i]);
            System.out.print("Nombre: [" + i + "]" + arregloper[i].getNombre());
            System.out.print("Apellido: [" + i + "]" + arregloper[i].getApellido());
            System.out.print("Edad: [" + i + "]" + arregloper[i].getEdad());

        }
    }
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
        
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = "Elias";
        this.apellido = "Vizcarra";
        this.edad = 20;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
