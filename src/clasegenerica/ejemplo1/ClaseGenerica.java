/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica.ejemplo1;

// Declaración de una clase genérica
public class ClaseGenerica <T>{
    // Declaración de un objeto de tipo Genérico
    T objeto;
    // Constructor 
    public ClaseGenerica(T o){
        this.objeto = o;
    }
    
    public void TipoClase(){
        System.out.println("El tipo de T es: "+objeto.getClass().getName());
    }    
}