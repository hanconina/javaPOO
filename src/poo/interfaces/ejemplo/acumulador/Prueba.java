package poo.interfaces.ejemplo.acumulador;


import poo.interfaces.ejemplo.acumulador.Acumulador;


public class Prueba {
    public static void main(String[] args) {
        // Modificacion if = new Modificacion(); error no es posible crear instancias de una interfaz o clase abstractat
        Acumulador ac = new Acumulador(25); // Clase concreta - crear una nueva instancia para la clase Acumulador
        System.out.println("Valor: "+ac.darValor());
        ac.incremento(12);
        System.out.println("Valor: "+ac.darValor());        
    }
    
}
