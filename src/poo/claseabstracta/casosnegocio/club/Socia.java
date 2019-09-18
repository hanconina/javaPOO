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
public class Socia extends Persona{
    private int codigo;
    private int antiguedad;
    
    public Socia(int DNI, String nombres, String medioPago, double totalConsumo, int codigo, int antiguedad){
        super(DNI, nombres, medioPago, totalConsumo);
        this.codigo = codigo;
        this.antiguedad = antiguedad;
    }

    
    @Override
    public double calcularPago(){
        double pago=0;
        if (antiguedad>=0 && antiguedad<=5){
            pago = totalConsumo*0.4;
        }else{
            if (antiguedad>5 && antiguedad<=10){
                pago = totalConsumo*0.3;
            }else{
                pago = totalConsumo*0.2;
            }
        }
        return pago;
    }
    @Override
    public String getInfo(){
        String info = 
                "Nombres: "+nombres+
                " Codigo: "+codigo+
                " Medio pago: "+medioPago+
                " Monto Facturado: "+calcularPago()+
                " Tipo: Socio";
        return info;
    }
    
}
