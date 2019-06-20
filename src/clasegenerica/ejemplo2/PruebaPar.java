/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica.ejemplo2;

/**
 *
 * @author user
 */
public class PruebaPar {

    public static void main(String[] args) {
        // Instanciación de la clase genérica para Integer
        // No se puede usar int porque no es una clase
        Par<Integer> p = new Par<Integer>(1, 2);
        // Instanciación de la clase genérica para Character 	
        Par<Character> p1 = new Par<Character>('a', 'b');
        p = p.intercambiar();
        p1 = p1.intercambiar();
        p.mostrar();
        p1.mostrar();
    }

}
