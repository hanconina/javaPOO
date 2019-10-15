package evaluaciones.parcial20192;

public class Coche extends Vehiculo implements IAntiguedad {

    private int nroAsientos;

    public Coche() {
        super();
        nroAsientos = 0;
    }

    @Override
    public double calcularPrecioAlquiler(int nroDias) {
        double precioBase = 50 * nroDias;
        double adicional = 1.5 * nroAsientos;
        return precioBase + adicional;
    }

    @Override
    public void leer() {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Leer un Coche");
        super.leer();
        System.out.println("Nro. Asientos: ");
        nroAsientos = entrada.nextInt();
    }

    @Override
    public void escribir() {
        System.out.println("Datos del Coche");
        super.escribir();
        System.out.println("Nro. Asientos: " + nroAsientos);
    }

    @Override
    public int calcularAntiguedad() {
        return Vehiculo.anioActual - super.getFechaCompra().getAnio();
    }

}
