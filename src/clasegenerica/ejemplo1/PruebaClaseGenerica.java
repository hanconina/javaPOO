/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica.ejemplo1;

public class PruebaClaseGenerica {
    public static void main(String args[]) {
        // Creamos una instancia de ClaseGenerica para Integer.
        ClaseGenerica<Integer> objetoEntero = new ClaseGenerica<Integer>(88);
        objetoEntero.TipoClase();
        // Creamos una instancia de ClaseGenerica para String.
        ClaseGenerica<String> objetoCadena = new ClaseGenerica<String>("ULima");
        objetoCadena.TipoClase();
        // Creamos una instancia de ClaseGenerica para Libro.
        ClaseGenerica<Libro> objetoLibro = new ClaseGenerica<Libro>(new Libro());
        objetoLibro.TipoClase();
    }
}