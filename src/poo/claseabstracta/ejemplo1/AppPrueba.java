package poo.claseabstracta.ejemplo1;

public class AppPrueba {
    public static void main(String[] args) {
        // Conversiones implicitas - Conversión hacia arriba
        // UPCATING
        int a = 23;
        long b = a;
        
        // Converciones explicitas o casting
        // Conversión hacia abajo downcasting
        int a1 = 23;
        short a2 = (short)a1;
        // UPCASTING EN OBJETOS
        Vehiculo v1;
        Auto auto1 = new Auto("PE2389",1200,true);
        v1 = auto1;
        System.out.println(v1.getInfo());
        auto1.descapotar(false);
        System.out.println(v1.getInfo());
        
//        Vehiculo c1 = new Camioneta("PE3456",3400,3456);
//        System.out.println(c1.getInfo());
//        Camioneta camioneta1 = (Camioneta)c1;
//        System.out.println(camioneta1.getInfo());
        
//        Vehiculo v3 = new Auto("PE3459",9000,false);
//        System.out.println(v3.getInfo());
//        Camioneta camioneta2 = (Camioneta)v3;
//        System.out.println(camioneta2.getInfo());
        
        Vehiculo v4 = new Vehiculo("PE7867",2345);
        System.out.println(v4.getInfo());
        Camioneta camioneta3 = (Camioneta)v4;
        System.out.println(camioneta3.getInfo());
        
        
    }
    
}
