/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.claseabstracta;

import java.util.LinkedList;

/**
 *
 * @author user
 */
public class AppForma {
    public static void mostrarFormas(LinkedList<Forma> formas){
        for (Forma f : formas){
            f.imprimirDatos();
        }
    }
    public static void main(String[] args){
        Forma f1 = new Cuadrado("Cuadrado",5);
        Forma f2 = new Rectangulo("Rectangulo",5,3);
        Forma f3 = new Circulo("Circulo",1);
        
        LinkedList<Forma> formas = new LinkedList<Forma>();
        formas.add(f1);
        formas.add(f2);
        formas.add(f3);
        
        mostrarFormas(formas);
        
        
    }
    
}
