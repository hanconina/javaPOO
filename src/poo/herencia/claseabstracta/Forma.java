/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.claseabstracta;

/**
 *
 * @author user
 */
public abstract class Forma {
    private String nombre;

    public Forma() {
    }

    public Forma(String nombre) {
        this.nombre = nombre;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Area: "+area());
    }
    public abstract double area();
}
