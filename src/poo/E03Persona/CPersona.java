/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.E03Persona;

import java.util.Scanner;
import poo.E02Fecha.CFecha;

/**
 *
 * @author user
 */
public class CPersona {

    /**
     * ************** Atributos ****************
     */
    private String nombre;
    private String direccion;
    private CFecha fechaNac;

    /**
     * ************** Métodos ****************
     */
    /*=================== Constructores =================*/
 /*
    * Constructor por defecto o predeterminado
     */
    public CPersona() {
        nombre = "";
        nombre = "";
        fechaNac = new CFecha();
    }

    /*
    * Constructor con parametros
     */
    public CPersona(String nombre, String direccion, CFecha fechaNac) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }

    /*================ Accesadores y modificadores =============*/
 /*Permiten cambiar o recuperar los valores de los atributos*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CFecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(CFecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    /*======================== Otros métodos ===================*/
    public void leer() {
        Scanner entrada = new Scanner(System.in);
        // Leer datos desde el teclado
        System.out.println("Ingrese el Nombre: ");
        this.nombre = entrada.nextLine();
        System.out.println("Ingrese la Dirección: ");
        this.direccion = entrada.nextLine();
        System.out.println("Ingrese La Fecha de Nacimiento: ");
        this.fechaNac.leer();
    }

    public void escribir() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Dirección: "+direccion);
        System.out.println("Fecha de Nacimiento: ");
        fechaNac.escribir();
    }

}
