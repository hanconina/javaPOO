package poo.practica1;

public class AppPruebaCuenta {
    public static void main(String[] args){
        CuentaMancomunada c1 = 
                new CuentaMancomunada(1,1,2,1000);
        
        CuentaSueldo c2 = 
                new CuentaSueldo(2,3,1000,"ULima");
        
        c1.depositar(1000);
        c1.retirar(1000);
        
        c2.depositar(1000);
        c2.retirar(1000);
        
        c1.imprimirDatos();
        c2.imprimirDatos();

        
    }    
    
}
