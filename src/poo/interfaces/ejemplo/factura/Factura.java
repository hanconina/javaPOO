package poo.interfaces.ejemplo.factura;


import poo.interfaces.ejemplo.factura.Constantes;


public class Factura implements Constantes, Variaciones{
    private double totalSinIGV;
    public final static double IGV = 0.18;
    
    public double sinIGV(){
        return this.totalSinIGV;
    }
    public double conIGV(){
        return totalSinIGV*(1 + IGV);
    }
    @Override
    public void asignarValor(double v){
        if (v<valorMaximo){
            this.totalSinIGV = v;
        }else{
            this.totalSinIGV = 0;
        }        
    }

    @Override
    public void rebaja(double t) { // t es un valor porcentaje 20%
        //this.totalSinIGV = this.totalSinIGV*t/100;
        this.totalSinIGV *= t/100;        
    }
    
}
