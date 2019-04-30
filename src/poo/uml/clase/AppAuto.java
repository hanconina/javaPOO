package poo.uml.clase;

public class AppAuto {

    public static void main(String[] args) {
        // Crear un objeto auto
        Auto oAuto = new Auto("PE-001","Toyota",34567.98F);
        System.out.println("Número de Serie: "+oAuto.accesarNumSerie());
        System.out.println("Ver Datos de Auto: "+"\n"+oAuto.verDatos());
    }
}
