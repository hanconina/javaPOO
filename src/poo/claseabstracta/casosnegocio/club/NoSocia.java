/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.claseabstracta.casosnegocio.club;

/**
 *
 * @author user
 */
public class NoSocia extends Persona {

    private int nroIngresos;
    
    public NoSocia(int DNI, String nombres, String medioPago, double totalConsumo, int nroIngresos){
        super(DNI,nombres,medioPago,totalConsumo);
        this.nroIngresos = nroIngresos;
        
    }

    public double calcularPago() {
        double pago = 0;
        if (nroIngresos == 1) {
            pago = totalConsumo + 250;
        } else {
            if (nroIngresos >= 2 && nroIngresos <= 6) {
                pago = totalConsumo + 150;
            } else {
                pago = totalConsumo + 100;
            }
        }
        return pago;
    }

    @Override
    public String getInfo() {
        String info
                = "Nombres: " + nombres
                + " Codigo: " + DNI
                + " Medio pago: " + medioPago
                + " Monto Facturado: " + calcularPago()
                + " Tipo: No Socio";
        return info;
    }
}
