package poo.interfaces.ejemplo.factura;


import poo.interfaces.ejemplo.factura.Factura;

public class Prueba {
    public static void main(String[] args) {
        Factura factura = new Factura();
        factura.asignarValor(1000);
        System.out.println("SinIVG: "+factura.sinIGV());
        factura.rebaja(50);
        System.out.println("SinIVG: "+factura.sinIGV());
        System.out.println("ConIVG: "+factura.conIGV());     
    }
    
}
