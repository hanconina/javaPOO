package evaluaciones.practicacalificada1;

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
        
        
        // Referencia a objetos 
        CuentaSueldo cuenta1 = new CuentaSueldo(100001,22346789,1000.00,"ULima");
        CuentaSueldo cuenta2 = new CuentaSueldo(100001,22346789,1000.00,"ULima");
        
        
        // Aliasing
        CuentaSueldo cuenta3 = 
                new CuentaSueldo(100001,22346789,1000.00,"ULima");
        CuentaSueldo cuenta4 = cuenta3;
        cuenta4.depositar(1000);
        System.out.println("Saldo de la Cuenta 3: "+
                cuenta3.recuperarSaldo());
        System.out.println("Saldo de la Cuenta 4: "
                +cuenta4.recuperarSaldo());
        
        // Método de Clase 
        CuentaSueldo cuenta5 = 
                new CuentaSueldo(100001,22346789,1000.00,"ULima");
        CuentaSueldo cuenta6 = 
                new CuentaSueldo(100002,44444444,1000.00,"BCP");
        CuentaSueldo.transferencia(cuenta1, cuenta2, 200);
        System.out.println("Saldo de la Cuenta 5: "+
                cuenta5.recuperarSaldo());
        System.out.println("Saldo de la Cuenta 6: "
                +cuenta6.recuperarSaldo());
    }    
    
}
