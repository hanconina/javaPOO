/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.E02Fecha;

/**
 *
 * @author user
 */
public class AppFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CFecha fecha1 = new CFecha();
        fecha1.leer();
        fecha1.escribir();
        fecha1.setAño(2001);
        fecha1.setDia(31);
        fecha1.setMes(3);
        fecha1.escribir();
    }
    
}
