package evaluaciones.parcial20192;

public class Furgoneta extends Vehiculo {

    private int PMA;

    public Furgoneta() {
        super();
        PMA = 0;
    }

    @Override
    public void leer() {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Leer una Furgoneta");
        super.leer();
        System.out.println("PMA: ");
        PMA = entrada.nextInt();
    }

    @Override
    public void escribir() {
        System.out.println("Datos de la Furgoneta");
        super.escribir();
        System.out.println("PMA: " + PMA);
    }

    @Override
    public double calcularPrecioAlquiler(int nroDias) {
        double precioBase = 50 * nroDias;
        double adicional = 20 * PMA;
        return precioBase + adicional;
    }

}
