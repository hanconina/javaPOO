package evaluaciones.parcial20192;

public class Microbus extends Vehiculo implements IAntiguedad {

    private int nroAsientos;

    public Microbus() {
        super();
        nroAsientos = 0;
    }

    @Override
    public void leer() {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Leer un Microbus");
        super.leer();
        System.out.println("Nro. Asientos: ");
        nroAsientos = entrada.nextInt();
    }

    @Override
    public void escribir() {
        System.out.println("Datos del Microbus");
        super.escribir();
        System.out.println("Nro. Asientos: " + nroAsientos);
    }

    @Override
    public double calcularPrecioAlquiler(int nroDias) {
        double precioBase = 50 * nroDias;
        double adicional = 2.0 * nroAsientos;
        return precioBase + adicional;
    }

    @Override
    public int calcularAntiguedad() {
        return Vehiculo.anioActual - super.getFechaCompra().getAnio();
    }

}
